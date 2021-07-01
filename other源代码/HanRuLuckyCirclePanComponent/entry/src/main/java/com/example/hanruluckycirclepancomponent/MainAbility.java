package com.example.hanruluckycirclepancomponent;

import com.example.hanruluckycirclepancomponent.customcomponent.LuckyCirclePanComponent;
import com.example.hanruluckycirclepancomponent.slice.MainAbilitySlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;
import ohos.agp.components.DirectionalLayout;

public class MainAbility extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        // super.setMainRoute(MainAbilitySlice.class.getName());
        DirectionalLayout myLayout = new DirectionalLayout(getContext());
        DirectionalLayout.LayoutConfig config = new DirectionalLayout.LayoutConfig(
                DirectionalLayout.LayoutConfig.MATCH_PARENT, DirectionalLayout.LayoutConfig.MATCH_PARENT);
        LuckyCirclePanComponent luckyCirclePanComponent = new LuckyCirclePanComponent(this);
        luckyCirclePanComponent.setLayoutConfig(config);
        myLayout.addComponent(luckyCirclePanComponent);
        super.setUIContent(myLayout);
    }
}
