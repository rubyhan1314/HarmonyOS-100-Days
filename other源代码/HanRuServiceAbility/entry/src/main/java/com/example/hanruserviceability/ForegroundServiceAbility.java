package com.example.hanruserviceability;

import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;
import ohos.event.notification.NotificationRequest;
import ohos.rpc.IRemoteObject;
import ohos.hiviewdfx.HiLog;
import ohos.hiviewdfx.HiLogLabel;

public class ForegroundServiceAbility extends Ability {
    private static final HiLogLabel LABEL_LOG = new HiLogLabel(3, 0x00201, "ForegroundServiceAbility");

    private static final int NOTIFICATION_ID = 0XD0000002;
    @Override
    public void onStart(Intent intent) {
        HiLog.error(LABEL_LOG, "ForegroundServiceAbility::onStart");
        super.onStart(intent);
        NotificationRequest request = new NotificationRequest(NOTIFICATION_ID).setTapDismissed(true);
        NotificationRequest.NotificationNormalContent content = new NotificationRequest.NotificationNormalContent();
        content.setTitle("Foreground Service").setText("I'm a Foreground Service");
        NotificationRequest.NotificationContent notificationContent = new NotificationRequest.NotificationContent(
                content);
        request.setContent(notificationContent);
        keepBackgroundRunning(NOTIFICATION_ID, request);
    }

    @Override
    public void onBackground() {
        super.onBackground();
        HiLog.info(LABEL_LOG, "ForegroundServiceAbility::onBackground");
    }

    @Override
    public void onStop() {
        super.onStop();
        HiLog.info(LABEL_LOG, "ForegroundServiceAbility::onStop");
    }

    @Override
    public void onCommand(Intent intent, boolean restart, int startId) {
    }

    @Override
    public IRemoteObject onConnect(Intent intent) {
        return null;
    }

    @Override
    public void onDisconnect(Intent intent) {
    }
}