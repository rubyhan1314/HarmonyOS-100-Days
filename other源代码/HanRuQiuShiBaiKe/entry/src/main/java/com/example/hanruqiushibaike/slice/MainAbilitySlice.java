package com.example.hanruqiushibaike.slice;

import com.example.hanruqiushibaike.ResourceTable;
import com.example.hanruqiushibaike.constant.Constant;
import com.example.hanruqiushibaike.handler.DownLoadImageEventHandler;
import com.example.hanruqiushibaike.utils.HttpUtils;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.*;
import ohos.eventhandler.EventHandler;
import ohos.eventhandler.EventRunner;
import ohos.eventhandler.InnerEvent;



public class MainAbilitySlice extends AbilitySlice {
    private Button btnDownload;
    private RoundProgressBar roundProgressBar;
    private ListContainer listContainer;

    private EventRunner eventRunner;
    private EventHandler handler;

    // 先定义全局变量
    public static final int EVENT_MESSAGE_NORMAL = 1;


    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_main);


        initComponent();
        initHandler();

        // 按钮的点击事件
        btnDownload.setClickedListener(component -> {
            // 点击按钮，下载糗事百科的json数据
            long param = 0;
            InnerEvent innerEvent = InnerEvent.get(EVENT_MESSAGE_NORMAL, param, EventRunner.current());
            handler.sendEvent(innerEvent, EventHandler.Priority.IMMEDIATE);
            System.out.println("UI线程-->InnerEvent已发送。。");
            roundProgressBar.setVisibility(Component.VISIBLE);
        });

    }
    public ListContainer getListContainer(){
        return listContainer;
    }

    public RoundProgressBar getRoundProgressBar(){
        return roundProgressBar;
    }



    // 获取UI组件
    private void initComponent(){
        btnDownload= (Button) findComponentById(ResourceTable.Id_btn_download);
        roundProgressBar = (RoundProgressBar)findComponentById(ResourceTable.Id_round_progress_bar1);
        listContainer = (ListContainer) findComponentById(ResourceTable.Id_list_container);

    }
    // 实例化EventHandler和EventRunner对象，并在onStart()方法中调用该初始化方法。
    private void initHandler() {
        eventRunner = EventRunner.create("TestRunner");
        handler = new DownLoadImageEventHandler(eventRunner,this);
    }

}
