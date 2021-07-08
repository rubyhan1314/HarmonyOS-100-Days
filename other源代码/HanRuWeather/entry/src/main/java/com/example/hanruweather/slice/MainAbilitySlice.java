package com.example.hanruweather.slice;

import com.example.hanruweather.ResourceTable;
import com.example.hanruweather.constant.Constant;
import com.example.hanruweather.provider.WeatherPageProvider;
import com.example.hanruweather.utils.DateUtils;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.ability.IAbilityConnection;
import ohos.aafwk.content.Intent;
import ohos.aafwk.content.Operation;
import ohos.agp.components.*;
import ohos.agp.components.element.ShapeElement;
import ohos.agp.utils.LayoutAlignment;
import ohos.agp.window.dialog.ToastDialog;
import ohos.bundle.ElementName;
import ohos.hiviewdfx.HiLog;
import ohos.hiviewdfx.HiLogLabel;
import ohos.rpc.*;
import ohos.utils.zson.ZSONArray;
import ohos.utils.zson.ZSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MainAbilitySlice extends AbilitySlice {

    private static final HiLogLabel LABEL_LOG = new HiLogLabel(3, 0x00201, "MainAbilitySlice");

    private static final String BUNDLE_NAME = "com.example.hanruweather";

    private static final String SERVICE_NAME = "WeatherServiceAbility";

    private ClientRemoteProxy clientRemoteProxy = null;

    private TextField inputCityTextField;
    private Text textCity;
    private Text textDate;
    private Text textTemp;
    private Text textHumidity;
    private Text textSpeed;


    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_main);

        initComponent();
        HiLog.info(LABEL_LOG, "connectService------ ");
        // 连接服务
        connectAbility(getServiceIntent(BUNDLE_NAME, SERVICE_NAME), connection);

    }

    // 初始化组件
    private void initComponent() {
        textCity = (Text) findComponentById(ResourceTable.Id_show_city);
        textDate = (Text) findComponentById(ResourceTable.Id_show_date);
        textTemp = (Text) findComponentById(ResourceTable.Id_show_temp);
        textHumidity = (Text) findComponentById(ResourceTable.Id_show_humidity);
        textSpeed = (Text) findComponentById(ResourceTable.Id_show_wind);
        inputCityTextField = (TextField) findComponentById(ResourceTable.Id_input_city);


        Button btnQuery = (Button) findComponentById(ResourceTable.Id_btn_query);
        Button btnQueryMore = (Button) findComponentById(ResourceTable.Id_btn_query_more);

        btnQuery.setClickedListener(component -> {

            clientRemoteProxy.todoServiceJob(Constant.CURRENT);
        });
        btnQueryMore.setClickedListener(component -> {

            clientRemoteProxy.todoServiceJob(Constant.FORECAST);
        });
    }

    // 连接对象
    private IAbilityConnection connection = new IAbilityConnection() {
        @Override
        public void onAbilityConnectDone(ElementName elementName, IRemoteObject iRemoteObject, int resultCode) {
            clientRemoteProxy = new ClientRemoteProxy(iRemoteObject);
        }

        @Override
        public void onAbilityDisconnectDone(ElementName elementName, int resultCode) {
            HiLog.info(LABEL_LOG, "%{public}s", "onAbilityDisconnectDone resultCode : " + resultCode);
        }
    };

    // 客户端代理类
    public class ClientRemoteProxy implements IRemoteBroker {
        private final IRemoteObject remoteObject;

        public ClientRemoteProxy(IRemoteObject remoteObject) {
            this.remoteObject = remoteObject;
        }

        // 这里是消息发送最关键的地方
        public void todoServiceJob(int command) {
            // 传过去的参数：城市名称
            MessageParcel message = MessageParcel.obtain();
            String city = inputCityTextField.getText();
            HiLog.info(LABEL_LOG, "textfield-->city------ " + city);
            message.writeString(city);
            // 接收回来的参数
            MessageParcel reply = MessageParcel.obtain();

            // 异步还是同步
            MessageOption option = new MessageOption(MessageOption.TF_SYNC);

            try {
                // 发送请求
                remoteObject.sendRequest(command, message, reply, option);

                // 处理结果
                int result = reply.readInt();
                if (result == Constant.FAIL) {
                    new ToastDialog(getContext()).setText("查无数据").setAlignment(LayoutAlignment.CENTER).show();
                } else if (result == Constant.SUCCESS) {
                    switch (command) {
                        case Constant.CURRENT:
                            String jsonData = reply.readString();
                            HiLog.info(LABEL_LOG, "jsonData------ " + jsonData);
                            Map<String, String> map = ZSONObject.stringToClass(jsonData, Map.class);
                            HiLog.info(LABEL_LOG, "map------ " + map);
                            // 将接收到到数据，设置到UI组件上
                            textCity.setText(map.get("city") + "," + map.get("country"));
                            String date = DateUtils.getCurrentDate();
                            textDate.setText(date + ",  " + DateUtils.getWeekOfCurrentDay());
                            textTemp.setText(map.get("temp") + "°C");
                            textHumidity.setText("空气湿度：" + map.get("humidity") + "%");
                            textSpeed.setText("风速：" + map.get("speed") + "km/hr");

                            break;
                        case Constant.FORECAST:
                            String jsonData2 = reply.readString();
                            HiLog.info(LABEL_LOG, "jsonData2------ " + jsonData2);
                            List<Map> list = ZSONArray.stringToClassList(jsonData2, Map.class);
                            HiLog.info(LABEL_LOG, "list------ " + list);
                            showMoreData(list);
                            break;
                        default:
                    }
                }
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

        @Override
        public IRemoteObject asObject() {
            return remoteObject;
        }
    }

    // 显示更多的天气数据
    private void showMoreData(List<Map> list) {
        // 1.获取PageSlider
        PageSlider pageSlider = (PageSlider) findComponentById(ResourceTable.Id_page_slider);
        pageSlider.setVisibility(Component.VISIBLE);

        // 2.设置数据
        ArrayList arrayList = new ArrayList<>(list);
        pageSlider.setProvider(new WeatherPageProvider(arrayList, this));

        // 设置回弹效果
        pageSlider.setReboundEffect(true);

        // 创建PageSliderIndicator
        PageSliderIndicator indicator = (PageSliderIndicator) findComponentById(ResourceTable.Id_indicator);
        ShapeElement normalElement = new ShapeElement(this, ResourceTable.Graphic_unselected_page_bg_element);
        ShapeElement selectedElement = new ShapeElement(this, ResourceTable.Graphic_selected_page_bg_element);
        indicator.setItemElement(normalElement, selectedElement);
        // 置导航点之间的偏移量
        indicator.setItemOffset(100);
        // 设置
        indicator.setPageSlider(pageSlider);
    }


    // 获取启动本地服务的Intent
    private Intent getServiceIntent(String bundleName, String serviceName) {
        Operation operation = new Intent.OperationBuilder().withDeviceId("")
                .withBundleName(bundleName)
                .withAbilityName(serviceName)
                .build();
        Intent intent = new Intent();
        intent.setOperation(operation);
        return intent;
    }


}
