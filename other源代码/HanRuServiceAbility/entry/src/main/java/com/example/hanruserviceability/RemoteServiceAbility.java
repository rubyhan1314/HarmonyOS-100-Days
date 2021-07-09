package com.example.hanruserviceability;

import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;
import ohos.rpc.*;
import ohos.hiviewdfx.HiLog;
import ohos.hiviewdfx.HiLogLabel;

public class RemoteServiceAbility extends Ability {
    private static final HiLogLabel LABEL_LOG = new HiLogLabel(3, 0x00201, "RemoteServiceAbility");

    @Override
    public void onStart(Intent intent) {
        HiLog.info(LABEL_LOG, "RemoteServiceAbility::onStart");
        super.onStart(intent);
    }

    @Override
    public void onBackground() {
        super.onBackground();
        HiLog.info(LABEL_LOG, "RemoteServiceAbility::onBackground");
    }

    @Override
    public void onStop() {
        super.onStop();
        HiLog.info(LABEL_LOG, "RemoteServiceAbility::onStop");
    }

    @Override
    public void onCommand(Intent intent, boolean restart, int startId) {
        HiLog.info(LABEL_LOG, "onCommand-----startId:" + startId);
    }

    @Override
    public IRemoteObject onConnect(Intent intent) {
        HiLog.info(LABEL_LOG, "onConnect--------");
        return serviceRemoteProxy;
    }


    private static final String DESCRIPTOR = "com.example.hanruserviceability.RemoteAbility";

    private ServiceRemoteProxy serviceRemoteProxy = new ServiceRemoteProxy(DESCRIPTOR);

    public class ServiceRemoteProxy extends RemoteObject implements IRemoteBroker {

        private static final int RESULT_SUCCESS = 0;

        public ServiceRemoteProxy(String descriptor) {
            super(descriptor);

        }

        @Override
        public boolean onRemoteRequest(int code, MessageParcel data, MessageParcel reply, MessageOption option) throws RemoteException {
            HiLog.info(LABEL_LOG, "onRemoteRequest----code:" + code);


            int initData = data.readInt();
            String initStr = data.readString();
            HiLog.info(LABEL_LOG, "onRemoteRequest----接收到：" + initData + "," + initStr);
            int resultData = initData * 1024;
            reply.writeInt(RESULT_SUCCESS);
            reply.writeInt(resultData);
            reply.writeString("地上鞋三双");

            return true;
        }

        @Override
        public IRemoteObject asObject() {
            return this;
        }
    }

    @Override
    public void onDisconnect(Intent intent) {
        HiLog.info(LABEL_LOG, "onDisconnect--------");
    }
}