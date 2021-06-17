## 8、自适应盒子布局AdaptivBoxLayout



> 作者：韩茹
>
> 公司：程序咖（北京）科技有限公司
>
> 程序咖：IT职业技能评测平台
>
> 网址：https://www.chengxuka.com



AdaptiveBoxLayout是自适应盒子布局，该布局提供了在不同屏幕尺寸设备上的自适应布局能力，主要用于相同级别的多个组件需要在不同屏幕尺寸设备上自动调整列数的场景。

1. **该布局中的每个子组件都用一个单独的“盒子”装起来，子组件设置的布局参数都是以盒子作为父布局生效，不以整个自适应布局为生效范围。**
2. **该布局中每个盒子的宽度固定为布局总宽度除以自适应得到的列数，高度为match_content，每一行中的所有盒子按高度最高的进行对齐。**
3. **该布局水平方向是自动分块，因此水平方向不支持match_content，布局水平宽度仅支持match_parent或固定宽度。**
4. **自适应仅在水平方向进行了自动分块，纵向没有做限制，因此如果某个子组件的高设置为match_parent类型，可能导致后续行无法显示。**



![0000000000011111111.20210602180820.99212566024011954502703008047066](img/0000000000011111111.20210602180820.99212566024011954502703008047066.jpg)

### 一、常用方法

AdaptiveBoxLayout布局常用方法如下。

| 方法                                                        | 功能                         |
| ----------------------------------------------------------- | ---------------------------- |
| addAdaptiveRule(int minWidth, int maxWidth, int columns)    | 添加一个自适应盒子布局规则。 |
| removeAdaptiveRule(int minWidth, int maxWidth, int columns) | 移除一个自适应盒子布局规则。 |
| clearAdaptiveRules()                                        | 移除所有自适应盒子布局规则。 |



### 二、示例代码

在AdaptiveBoxLayout中添加和删除自适应盒子布局规则的效果对比如下。

xml布局文件：

```xml
<?xml version="1.0" encoding="utf-8"?>

<DirectionalLayout
    xmlns:ohos="http://schemas.huawei.com/res/ohos"
    ohos:height="match_parent"
    ohos:width="match_parent"
    ohos:orientation="vertical">
<!--    自适应盒子布局-->

    <AdaptiveBoxLayout
        xmlns:ohos="http://schemas.huawei.com/res/ohos"
        ohos:height="0vp"
        ohos:width="match_parent"
        ohos:weight="1"
        ohos:id="$+id:adaptive_box_layout"
        ohos:background_element="#33FFC0CB"
        >

        <Text
            ohos:height="40vp"
            ohos:width="80vp"
            ohos:background_element="#FFC0CB"
            ohos:margin="10vp"
            ohos:padding="10vp"
            ohos:text="文本 1"
            ohos:text_size="18fp" />

        <Text
            ohos:height="40vp"
            ohos:width="80vp"
            ohos:background_element="#FFC0CB"
            ohos:margin="10vp"
            ohos:padding="10vp"
            ohos:text="文本 2"
            ohos:text_size="18fp" />

        <Text
            ohos:height="match_content"
            ohos:width="match_content"
            ohos:background_element="#FFC0CB"
            ohos:margin="10vp"
            ohos:padding="10vp"
            ohos:multiple_lines="true"
            ohos:text="AdaptiveBoxLayout,自适应盒子布局。其中放置了许多宽度相同但高度不同的盒子。 一行的高度由最高的盒子决定。"
            ohos:text_size="18fp" />

        <Text
            ohos:height="40vp"
            ohos:width="80vp"
            ohos:background_element="#FFC0CB"
            ohos:margin="10vp"
            ohos:padding="10vp"
            ohos:text="文本 4"
            ohos:text_size="18fp" />

        <Text
            ohos:height="40vp"
            ohos:width="match_parent"
            ohos:background_element="#FFC0CB"
            ohos:margin="10vp"
            ohos:padding="10vp"
            ohos:text="程序咖"
            ohos:text_size="18fp" />



        <Text
            ohos:height="40vp"
            ohos:width="80vp"
            ohos:background_element="#FFC0CB"
            ohos:margin="10vp"
            ohos:padding="10vp"
            ohos:text="文本 5"
            ohos:text_size="18fp" />

        <Text
            ohos:height="160vp"
            ohos:width="80vp"
            ohos:background_element="#FFC0CB"
            ohos:margin="10vp"
            ohos:padding="10vp"
            ohos:text="文本 6"
            ohos:text_size="18fp" />
    </AdaptiveBoxLayout>

    <Button
        ohos:id="$+id:add_rule_btn"
        ohos:layout_alignment="horizontal_center"
        ohos:top_margin="10vp"
        ohos:padding="10vp"
        ohos:background_element="#A9CFF0"
        ohos:height="match_content"
        ohos:width="match_content"
        ohos:text_size="22fp"
        ohos:text="addAdaptiveRule(100, 2000, 3);"/>

    <Button
        ohos:id="$+id:remove_rule_btn"
        ohos:padding="10vp"
        ohos:top_margin="10vp"
        ohos:layout_alignment="horizontal_center"
        ohos:bottom_margin="10vp"
        ohos:background_element="#D5D5D5"
        ohos:height="match_content"
        ohos:width="match_content"
        ohos:text_size="22fp"
        ohos:text="removeAdaptiveRule(100, 2000, 3);"/>

</DirectionalLayout>
```

这里最外层我们选择定向布局DirectionalLayout，垂直方向。然后里面放一个自适应盒子布局AdaptiveBoxLayout，在里面放置一些Text文本框。最下面放置两个按钮，用于添加自适应规则和移除自适应规则。

初始布局如下：

<img src="img/WX20210607-143447@2x.png" alt="WX20210607-143447@2x" style="zoom:50%;" />





如果想添加或者删除规则，我们需要实现按钮的点击事件，所以在对应的Java代码中，添加按钮的监听。

打开MainAbilitySlice.java文件：

```java
package com.example.adaptiveboxlayout.slice;

import com.example.adaptiveboxlayout.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.AdaptiveBoxLayout;

public class MainAbilitySlice extends AbilitySlice {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_main);

        AdaptiveBoxLayout adaptiveBoxLayout = (AdaptiveBoxLayout)findComponentById(ResourceTable.Id_adaptive_box_layout);

        findComponentById(ResourceTable.Id_add_rule_btn).setClickedListener((component-> {
            // 添加规则
            adaptiveBoxLayout.addAdaptiveRule(100, 2000, 3);
            // 更新布局
            adaptiveBoxLayout.postLayout();
        }));

        findComponentById(ResourceTable.Id_remove_rule_btn).setClickedListener((component-> {
            // 移除规则
            adaptiveBoxLayout.removeAdaptiveRule(100, 2000, 3);
            // 更新布局
            adaptiveBoxLayout.postLayout();
        }));
    }

}

```


AdaptiveBoxLayout,自适应盒子布局。其中放置了许多宽度相同但高度不同的盒子。 一行的高度由最高的盒子决定。

点击addAdaptiveRule(100, 2000, 3)按钮，添加一个横向上为3列的自适应规则，效果如下：

<img src="img/WX20210607-143623@2x.png" alt="WX20210607-143623@2x" style="zoom:50%;" />



点击效果：

<img src="img/adaptivboxyunxngxiaoguo1.gif" alt="2021-06-07 14.38.02" style="zoom:50%;" />
