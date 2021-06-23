package com.example.hanrustacklayout.slice;

import com.example.hanrustacklayout.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.*;

public class MainAbilitySlice extends AbilitySlice {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_demo_stack_layout);

        ComponentContainer stackLayout = (ComponentContainer) findComponentById(ResourceTable.Id_stack_layout);
        Text textMsg = (Text) findComponentById(ResourceTable.Id_text_msg);
        Text text1 = (Text) findComponentById(ResourceTable.Id_text1);
        Image image = (Image) findComponentById(ResourceTable.Id_image1);
        text1.setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {
                // 指定的把子元素搬到前面去
                stackLayout.moveChildToFront(image);
                textMsg.setText("点一下，带回去，藏起来。。");
                System.out.println("component--------------------"+component);
            }
        });

        image.setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {
                stackLayout.moveChildToFront(text1);
                textMsg.setText("点一下有美女");
                System.out.println("component--------------------"+component);
            }
        });
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
