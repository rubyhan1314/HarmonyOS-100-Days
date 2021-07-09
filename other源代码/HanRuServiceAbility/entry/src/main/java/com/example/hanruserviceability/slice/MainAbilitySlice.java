package com.example.hanruserviceability.slice;

import com.example.hanruserviceability.LocalServiceAbility;
import com.example.hanruserviceability.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.ability.IAbilityConnection;
import ohos.aafwk.content.Intent;
import ohos.aafwk.content.Operation;
import ohos.agp.components.Component;
import ohos.bundle.ElementName;
import ohos.distributedschedule.interwork.DeviceInfo;
import ohos.distributedschedule.interwork.DeviceManager;
import ohos.hiviewdfx.HiLog;
import ohos.hiviewdfx.HiLogLabel;
import ohos.rpc.*;

import java.security.SecureRandom;
import java.util.List;

public class MainAbilitySlice extends AbilitySlice {
    // 本地service
    private static final String LOCAL_BUNDLE = "com.example.hanruserviceability";
    private static final String NORMAL_SERVICE = "LocalServiceAbility";

    private static final HiLogLabel LABEL_LOG = new HiLogLabel(3, 0x00201, "MainAbilitySlice");




    private static final String REMOTE_BUNDLE = "com.example.hanruserviceability";

    private static final String REMOTE_SERVICE = "RemoteServiceAbility";


    private static final String FOREGROUND_SERVICE = "ForegroundServiceAbility";

    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_main);
        initComponents();
    }

    // 初始化组件
    private void initComponents() {
        // 启动本地service
        Component startLocalButton = findComponentById(ResourceTable.Id_start_local_button);
        startLocalButton.setClickedListener(component -> startLocalService(LOCAL_BUNDLE, NORMAL_SERVICE));
        // 停止本地service
        Component stopLocalButton = findComponentById(ResourceTable.Id_stop_local_button);
        stopLocalButton.setClickedListener(component -> stopLocalService());
        // 本地Service的连接和断开
        Component connectLocalButton = findComponentById(ResourceTable.Id_connect_local_button);
        Component disconnectLocalButton = findComponentById(ResourceTable.Id_disconnect_local_button);
        connectLocalButton.setClickedListener(component -> connectLocalService());
        disconnectLocalButton.setClickedListener(component -> disconnectAbility(connection));


        // 远程service的启动和停止
        Component startRemoteButton = findComponentById(ResourceTable.Id_start_remote_button);
        Component stopRemoteButton = findComponentById(ResourceTable.Id_stop_remote_button);
        startRemoteButton.setClickedListener(component -> startRemoteService(REMOTE_BUNDLE, REMOTE_SERVICE));
        stopRemoteButton.setClickedListener(component -> stopRemoteService());

        // 远程service的连接和断开
        Component connectRemoteButton = findComponentById(ResourceTable.Id_connect_remote_button);
        Component disconnectRemoteButton = findComponentById(ResourceTable.Id_disconnect_remote_button);
        connectRemoteButton.setClickedListener(component -> connectRemoteService());
        disconnectRemoteButton.setClickedListener(component -> disconnectAbility(connection2));

        // 前台service
        Component keepRunningButton = findComponentById(ResourceTable.Id_keep_run_button);
        keepRunningButton.setClickedListener(component -> startLocalService(LOCAL_BUNDLE, FOREGROUND_SERVICE));

    }


    // 连接远程服务
    private void connectRemoteService() {
        HiLog.info(LABEL_LOG, "connectRemoteService------ ");
        Intent intent = getRemoteServiceIntent(REMOTE_BUNDLE, REMOTE_SERVICE);
        connectAbility(intent, connection2);
    }


    // 用于连接远程Service
    private IAbilityConnection connection2 = new IAbilityConnection() {

        @Override
        public void onAbilityConnectDone(ElementName elementName, IRemoteObject iRemoteObject, int i) {
            HiLog.info(LABEL_LOG, "onAbilityConnectDone------ ");

            ClientRemoteProxy clientRemoteProxy = new ClientRemoteProxy(iRemoteObject);
            clientRemoteProxy.todoServiceJob();


        }

        @Override
        public void onAbilityDisconnectDone(ElementName elementName, int i) {

        }
    };

    // 客户端代理类
    public class ClientRemoteProxy implements IRemoteBroker {
        private static final int RESULT_SUCCESS = 0;
        private static final int RESULT_TODO = 1;
        private final IRemoteObject remoteObject;

        public ClientRemoteProxy(IRemoteObject remoteObject) {
            this.remoteObject = remoteObject;
        }

        // 这里是消息发送最关键的地方
        public void todoServiceJob() {
            // 用于传到远程Service的数据
            MessageParcel message = MessageParcel.obtain();
            message.writeInt(100);
            message.writeString("床前明月光");

            // 用于接收远程Service传回的数据
            MessageParcel reply = MessageParcel.obtain();

            // 同步还是异步
            MessageOption option = new MessageOption(MessageOption.TF_SYNC);
            try {
                // remoteObject.sendRequest()就是向远程发布消息，告诉远程设备我要干嘛。
                /**
                 * 第一个参数相当于请求码，两端约定好，客户端发送这个码，远程设备接口后识别这个码就知道要干嘛了。
                 *
                 * MessageParcel 使用起来像队列，实际功能却和Map很像，通过MessageParcel.obtain()获取，然后writeInt和readInt写入和写出数据，数据类型包含基本类型和自己创建的对象。
                 *
                 * message，是客户端向远程设备传递的设备
                 *
                 * reply，远程设备向客户端回复的消息，发送的时候就已经把需要接收的消息的位置给留好了，而不是远程设备接收数据后将数据清空然后再将结果写入。
                 *
                 * 第四个参数MessageOption var4是本次通信是同步的还是异步的
                 */
                remoteObject.sendRequest(RESULT_TODO, message, reply, option);


                int resultCode = reply.readInt();
                if (resultCode != RESULT_SUCCESS) {
                    throw new RemoteException();
                }
                int resultInt = reply.readInt();
                String resultStr = reply.readString();

                HiLog.info(LABEL_LOG, "result------ "+resultInt+", "+resultStr);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
        @Override
        public IRemoteObject asObject() {
            return remoteObject;
        }
    }


    // 停止本地服务
    private void stopRemoteService() {
        HiLog.info(LABEL_LOG, "stopRemoteService------ ");
        Intent intent = getRemoteServiceIntent(REMOTE_BUNDLE, REMOTE_SERVICE);
        stopAbility(intent);
    }
    // 获取远程服务的Intent
    private Intent getRemoteServiceIntent(String bundleName, String serviceName) {
        HiLog.info(LABEL_LOG, "getRemoteServiceIntent------ ");
        Operation operation = new Intent.OperationBuilder().withDeviceId(getRemoteDeviceId())
                .withBundleName(bundleName)
                .withAbilityName(serviceName)
//                .withFlags(Intent.FLAG_ABILITYSLICE_MULTI_DEVICE) // 设置支持分布式调度系统多设备启动的标识
                .build();
        Intent intent = new Intent();
        intent.setOperation(operation);
        return intent;
    }
    // 获取远程设备的ID
    private String getRemoteDeviceId() {
        List<DeviceInfo> infoList = DeviceManager.getDeviceList(DeviceInfo.FLAG_GET_ALL_DEVICE);
        if ((infoList == null) || (infoList.size() == 0)) {
            return "";
        }
        int random = new SecureRandom().nextInt(infoList.size());
        return infoList.get(random).getDeviceId();
    }

    // 启动远程服务
    private void startRemoteService(String bundleName, String serviceName) {
        HiLog.info(LABEL_LOG, "startRemoteService------ ");
        Intent remoteServiceIntent = getRemoteServiceIntent(bundleName, serviceName);
        startAbility(remoteServiceIntent);
    }


    // 连接本地服务
    private void connectLocalService() {
        HiLog.info(LABEL_LOG, "connectService------ ");
        Intent intent = getLocalServiceIntent(LOCAL_BUNDLE, NORMAL_SERVICE);
        connectAbility(intent, connection);
    }

    LocalServiceAbility .MyRemoteObject myRemoteObject;
    // 连接对象
    // 创建连接Service回调实例
    private IAbilityConnection connection = new IAbilityConnection() {
        // 连接到Service的回调
        @Override
        public void onAbilityConnectDone(ElementName elementName, IRemoteObject iRemoteObject, int resultCode) {
            // Client侧需要定义与Service侧相同的IRemoteObject实现类。开发者获取服务端传过来IRemoteObject对象，并从中解析出服务端传过来的信息。

            HiLog.info(LABEL_LOG, "onAbilityConnectDone------ resultCode："+resultCode+","+iRemoteObject.hashCode());
            myRemoteObject = (LocalServiceAbility.MyRemoteObject) iRemoteObject;
            if(myRemoteObject != null){
                String valueFromService = myRemoteObject.callHello("hanru");
                HiLog.info(LABEL_LOG, "valueFromService-->"+valueFromService);
            }else{
                HiLog.info(LABEL_LOG, "myRemoteObject is null!!");
            }

        }

        // Service异常死亡的回调
        @Override
        public void onAbilityDisconnectDone(ElementName elementName, int resultCode) {
            HiLog.info(LABEL_LOG, "onAbilityDisconnectDone------ resultCode："+resultCode);
        }
    };


        // 停止本地服务
    private void stopLocalService() {
        HiLog.info(LABEL_LOG, "stopService------ ");
        Intent intent = getLocalServiceIntent(LOCAL_BUNDLE, NORMAL_SERVICE);
        stopAbility(intent);
    }

    // 启动本地服务
    private void startLocalService(String bundleName, String serviceName) {
        HiLog.info(LABEL_LOG, "startLocalService------ ");
        Intent localServiceIntent = getLocalServiceIntent(bundleName, serviceName);
        startAbility(localServiceIntent);
    }
    // 获取启动本地服务的Intent
    private Intent getLocalServiceIntent(String bundleName, String serviceName) {
        Operation operation = new Intent.OperationBuilder().withDeviceId("")
                .withBundleName(bundleName)
                .withAbilityName(serviceName)
                .build();
        Intent intent = new Intent();
        intent.setOperation(operation);
        return intent;
    }
        @Override
    public void onActive() {
        super.onActive();
    }

    @Override
    public void onForeground(Intent intent) {
        super.onForeground(intent);
    }
}
