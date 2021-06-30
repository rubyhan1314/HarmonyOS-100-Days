package com.example.hanruqiushibaike.handler;

import com.example.hanruqiushibaike.constant.Constant;
import com.example.hanruqiushibaike.provider.ListItemProvider;
import com.example.hanruqiushibaike.slice.MainAbilitySlice;
import com.example.hanruqiushibaike.utils.HttpUtils;
import com.example.hanruqiushibaike.utils.JsonParseUtils;
import ohos.agp.components.Component;
import ohos.agp.components.ListContainer;
import ohos.agp.components.RoundProgressBar;
import ohos.agp.window.dialog.ToastDialog;
import ohos.eventhandler.EventHandler;
import ohos.eventhandler.EventRunner;
import ohos.eventhandler.InnerEvent;

import java.util.List;
import java.util.Map;

//1.创建自定义的EventHandler子类
public class DownLoadImageEventHandler extends EventHandler {
    private MainAbilitySlice slice;

    //2.添加构造方法
    public DownLoadImageEventHandler(EventRunner runner, MainAbilitySlice slice) {
        super(runner);
        this.slice = slice;
    }

    //3.重写processEvent()方法
    @Override
    protected void processEvent(InnerEvent event) {
        super.processEvent(event);
        if (event == null) {
            return;
        }
        switch (event.eventId) {
            case MainAbilitySlice.EVENT_MESSAGE_NORMAL:
                System.out.println("----开始网络下载---");

                // 下载完毕后，解析json数据
                String json = HttpUtils.getJsonFromNet(Constant.QIUSHIBAIKE_URL);
                System.out.println("===json:" + json);
                if (json != null) {
                    List<Map<String, String>> listData = JsonParseUtils.parseJsonToList(json);
                    // 在UI线程上设置ListContainer
                    EventRunner runner = (EventRunner) event.object;
                    EventHandler eventHandler = new EventHandler(runner) {
                        @Override
                        protected void processEvent(InnerEvent event) {
                            // 进度条消失
                            RoundProgressBar roundProgressBar = slice.getRoundProgressBar();
                            roundProgressBar.setVisibility(Component.HIDE);
                            // 设置数据到ListContainer上
                            if (listData.size() == 0) {
                                new ToastDialog(slice.getContext()).setText("没有数据显示").show();
                            } else {
                                // 1.初始化Provider对象
                                ListItemProvider listItemProvider = new ListItemProvider(listData, slice);
                                // 2.获取listContainer对象
                                ListContainer listContainer = slice.getListContainer();
                                // 3.适配要展示的内容数据
                                listContainer.setItemProvider(listItemProvider);
                            }
                        }
                    };
                    int testEventId = 1;
                    long testParam = 0;
                    Object testObject = listData;
                    InnerEvent innerEvent = InnerEvent.get(testEventId, testParam, testObject);
                    eventHandler.sendEvent(innerEvent);

                }


        }

    }
}
