package com.example.hanruluckycirclepancomponent.utils;

import ohos.agp.utils.LayoutAlignment;
import ohos.agp.window.dialog.ToastDialog;
import ohos.app.Context;

public class ToastUtils {

    public static void showTips(Context  context,String msg){
        new ToastDialog(context).setText(msg) .setAlignment(LayoutAlignment.CENTER).show();
    }
}
