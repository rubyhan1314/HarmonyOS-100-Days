package com.example.uidemo;

import com.example.uidemo.slice.MainAbilitySlice;
import com.example.uidemo.slice.SecondAbilitySlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class MainAbility extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        //super.setMainRoute(MainAbilitySlice.class.getName());
        super.setMainRoute(SecondAbilitySlice.class.getName());
    }
}
