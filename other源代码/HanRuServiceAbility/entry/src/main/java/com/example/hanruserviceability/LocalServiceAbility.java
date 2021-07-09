package com.example.hanruserviceability;

import ohos.aafwk.ability.Ability;
import ohos.aafwk.ability.LocalRemoteObject;
import ohos.aafwk.content.Intent;
import ohos.rpc.IRemoteObject;
import ohos.hiviewdfx.HiLog;
import ohos.hiviewdfx.HiLogLabel;

/**
 * 创建一个本地 Service
 */
public class LocalServiceAbility extends Ability {
    private static final HiLogLabel LABEL_LOG = new HiLogLabel(3, 0x00201, "LocalServiceAbility");

    @Override
    public void onStart(Intent intent) {
        HiLog.info(LABEL_LOG, "LocalServiceAbility::onStart");
        super.onStart(intent);
    }

    @Override
    public void onBackground() {
        super.onBackground();
        HiLog.info(LABEL_LOG, "LocalServiceAbility::onBackground");
    }

    @Override
    public void onStop() {
        super.onStop();
        HiLog.info(LABEL_LOG, "LocalServiceAbility::onStop");
    }

    @Override
    public void onCommand(Intent intent, boolean restart, int startId) {
        HiLog.info(LABEL_LOG, "onCommand--->startId:"+startId);
    }
    private MyRemoteObject myRemoteObject = new MyRemoteObject();
    @Override
    public IRemoteObject onConnect(Intent intent) {
        HiLog.info(LABEL_LOG, "onConnect--->"+myRemoteObject.hashCode());
        return myRemoteObject;
    }
    // 创建自定义IRemoteObject实现类
    public class MyRemoteObject extends LocalRemoteObject {
        MyRemoteObject(){
            HiLog.info(LABEL_LOG, "MyRemoteObject()------");
        }
        public String callHello(String name){
            return sayHello(name);
        }
    }
    String sayHello(String name){
        return "Hello "+name;
    }
    @Override
    public void onDisconnect(Intent intent) {
        HiLog.info(LABEL_LOG, "onDisconnect--------");
    }
}