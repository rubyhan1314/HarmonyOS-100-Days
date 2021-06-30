package com.example.uidemo.slice;

import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.colors.RgbColor;
import ohos.agp.components.Component;
import ohos.agp.components.DirectionalLayout;
import ohos.agp.components.DirectionalLayout.LayoutConfig;
import ohos.agp.components.Text;
import ohos.agp.components.element.ShapeElement;
import ohos.agp.utils.Color;
import ohos.agp.utils.LayoutAlignment;
import ohos.agp.utils.TextAlignment;

public class SecondAbilitySlice extends AbilitySlice {
    @Override
    protected void onStart(Intent intent) {
        super.onStart(intent);

        // 1.创建布局
        // 创建一个DirectionLayout，定向布局
        DirectionalLayout directionalLayout = new DirectionalLayout(getContext());
        // 设置布局的大小
        directionalLayout.setWidth(DirectionalLayout.LayoutConfig.MATCH_PARENT);
        directionalLayout.setHeight(DirectionalLayout.LayoutConfig.MATCH_PARENT);

        // 设置布局的方向
        directionalLayout.setOrientation(Component.VERTICAL);

        // 设置子控件的对齐方式
        directionalLayout.setAlignment(LayoutAlignment.CENTER);

        // 设置背景颜色
        ShapeElement background = new ShapeElement();
        background.setRgbColor(new RgbColor(220,220,220));
        directionalLayout.setBackground(background);

        //2. 创建布局中的组件
        Text text1 = new Text(getContext());
        text1.setId(1001);
        text1.setText("面朝大海，春暖花开。。");
        text1.setWidth(DirectionalLayout.LayoutConfig.MATCH_PARENT);
        text1.setHeight(300); // px
        text1.setTextSize(75);// px
        text1.setTextAlignment(TextAlignment.CENTER);
        text1.setMarginsTopAndBottom(10,10);

        ShapeElement textBackground=new ShapeElement();
        textBackground.setRgbColor(new RgbColor(255,182,193));
        text1.setBackground(textBackground);
        text1.setTextColor(Color.BLACK);

        Text text2 = new Text(getContext());
        text2.setId(1002);
        text2.setText("鸿蒙巴士");
        DirectionalLayout.LayoutConfig layoutConfig = new LayoutConfig(LayoutConfig.MATCH_PARENT,300);
        text2.setLayoutConfig(layoutConfig);

        text2.setTextSize(75);
        text2.setTextAlignment(TextAlignment.CENTER);
        text2.setMarginsTopAndBottom(10,10);
        text2.setBackground(textBackground);
        text2.setTextColor(Color.BLACK);

        // 3.将组件，添加到布局中
        directionalLayout.addComponent(text1);
        directionalLayout.addComponent(text2);

        // 4.设置AbilitySlice要显示的布局
        setUIContent(directionalLayout);

    }
}
