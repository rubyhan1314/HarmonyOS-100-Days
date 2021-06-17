## 4、依赖布局DependentLayout



> 作者：韩茹
>
> 公司：程序咖（北京）科技有限公司
>
> 程序咖：IT职业技能评测平台
>
> 网址：https://www.chengxuka.com

DependentLayout是Java UI系统里的一种常见布局。与DirectionalLayout相比，拥有更多的排布方式，每个组件可以指定相对于其他同级元素的位置，或者指定相对于父组件的位置。

![0000000000011111111.20210521145409.94860093388810449052258963138964](img/0000000000011111111.20210521145409.94860093388810449052258963138964.png)

### 一、支持的XML属性

DependentLayout的共有XML属性继承自：[Component](https://developer.harmonyos.com/cn/docs/documentation/doc-guides/ui-java-component-common-xml-0000001138483639)



| 属性名称   | 中文描述                                         | 取值                                   | 取值说明               | 使用案例                                                     |
| ---------- | ------------------------------------------------ | -------------------------------------- | ---------------------- | ------------------------------------------------------------ |
| id         | 控件identity，用以识别不同控件对象，每个控件唯一 | integer类型                            | 仅可用于配置控件的id。 | ohos:id="$+id:component_id"                                  |
| theme      | 样式                                             | 引用                                   | 仅可引用pattern资源。  | ohos:theme="$pattern:button_pattern"                         |
| width      | 宽度，必填项                                     | float类型，match_parent，match_content |                        | ohos:width="20"<br />ohos:width="10vp"<br />ohos:width="$float:size_value" |
| height     | 高度，必填项                                     | float类型，match_parent，match_content |                        | ohos:height="20" <br />ohos:height="20vp" <br />ohos:height="$float:size_value" |
| min_width  | 最小宽度                                         | float类型                              |                        | ohos:min_width="20"<br />ohos:min_width="20vp"<br />ohos:min_width="$float:size_value" |
| min_height | 最小高度                                         | float类型                              |                        | ohos:min_height="20"<br />ohos:min_height="20vp"<br />ohos:min_height="$float:size_value" |
| alpha      | 透明度                                           | float类型                              | 取值范围在0~1。        | ohos:alpha="0.86"<br />ohos:alpha="$float:value"             |
| enabled    | 是否启用                                         | boolean类型                            |                        | ohos:enabled="true"<br />ohos:enabled="$boolean:true"        |
| visibility | 可见性                                           | visible，invisible，hide               |                        | ohos:visibility="visible"                                    |
| padding    | 内间距                                           | float类型                              |                        |                                                              |
| margin     | 外边距                                           | float类型                              |                        |                                                              |



DependentLayout的自有XML属性见下表：详见[官方文档](https://developer.harmonyos.com/cn/docs/documentation/doc-guides/ui-java-layout-dependentlayout-0000001050729536)：



| 属性名称  | 中文描述 | 取值              | 取值说明           | 使用案例                                                     |
| --------- | -------- | ----------------- | ------------------ | ------------------------------------------------------------ |
| alignment | 对齐方式 | left              | 表示左对齐。       | 可以设置取值项如表中所列，也可以使用“\|”进行多项组合。<br />ohos:alignment="top\|left"<br />ohos:alignment="left" |
|           |          | top               | 表示顶部对齐。     |                                                              |
|           |          | right             | 表示右对齐。       |                                                              |
|           |          | bottom            | 表示底部对齐。     |                                                              |
|           |          | horizontal_center | 表示水平居中对齐。 |                                                              |
|           |          | vertical_center   | 表示垂直居中对齐。 |                                                              |
|           |          | center            | 表示居中对齐。     |                                                              |



DependentLayout所包含组件可支持的XML属性见下表：

**表2** DependentLayout所包含组件可支持的XML属性表

| 属性名称            | 中文描述                               | 取值        | 取值说明                                        | 使用案例                                                     |
| ------------------- | -------------------------------------- | ----------- | ----------------------------------------------- | ------------------------------------------------------------ |
| left_of             | 将右边缘与另一个子组件的左边缘对齐     | 引用        | 仅可引用DependentLayout中包含的其他组件的id。   | ohos:left_of="$id:component_id"                              |
| right_of            | 将左边缘与另一个子组件的右边缘对齐     | 引用        | 仅可引用DependentLayout中包含的其他组件的id。   | ohos:right_of="$id:component_id"                             |
| above               | 将下边缘与另一个子组件的上边缘对齐     | 引用        | 仅可引用DependentLayout中包含的其他组件的id     | ohos:above="$id:component_id"                                |
| below               | 将上边缘与另一个子组件的下边缘对齐     | 引用        | 仅可引用DependentLayout中包含的其他组件的id     | ohos:below="$id:component_id"                                |
| align_baseline      | 将子组件的基线与另一个子组件的基线对齐 | 引用        | 仅可引用DependentLayout中包含的其他组件的id     | ohos:align_baseline="$id:component_id"                       |
| align_left          | 将左边缘与另一个子组件的左边缘对齐     | 引用        | 仅可引用DependentLayout中包含的其他组件的id。   | ohos:align_left="$id:component_id"                           |
| align_top           | 将上边缘与另一个子组件的上边缘对齐     | 引用        | 仅可引用DependentLayout中包含的其他组件的id     | ohos:align_top="$id:component_id"                            |
| align_right         | 将右边缘与另一个子组件的右边缘对齐     | 引用        | 仅可引用DependentLayout中包含的其他组件的id。   | ohos:align_right="$id:component_id"                          |
| align_bottom        | 将底边与另一个子组件的底边对齐         | 引用        | 仅可引用DependentLayout中包含的其他组件的id     | ohos:align_bottom="$id:component_id"                         |
| align_start         | 将起始边与另一个子组件的起始边对齐     | 引用        | 仅可引用DependentLayout中包含的其他组件的id。   | ohos:align_start="$id:component_id"                          |
| align_end           | 将结束边与另一个子组件的结束边对齐     | 引用        | 仅可引用DependentLayout中包含的其他组件的id。   | ohos:align_end="$id:component_id"                            |
| align_parent_left   | 将左边缘与父组件的左边缘对齐           | boolean类型 | 可以直接设置true/false，也可以引用boolean资源。 | ohos:align_parent_left="true"<br />ohos:align_parent_left="$boolean:true" |
| align_parent_top    | 将上边缘与父组件的上边缘对齐           | boolean类型 | 可以直接设置true/false，也可以引用boolean资源。 | ohos:align_parent_top="true"<br />ohos:align_parent_top="$boolean:true" |
| align_parent_right  | 将右边缘与父组件的右边缘对齐           | boolean类型 | 可以直接设置true/false，也可以引用boolean资源。 | ohos:align_parent_right="true"<br />ohos:align_parent_right="$boolean:true" |
| align_parent_bottom | 将底边与父组件的底边对齐               | boolean类型 | 可以直接设置true/false，也可以引用boolean资源。 | ohos:align_parent_bottom="true"<br />ohos:align_parent_bottom="$boolean:true" |
| center_in_parent    | 将子组件保持在父组件的中心             | boolean类型 | 可以直接设置true/false，也可以引用boolean资源。 | ohos:center_in_parent="true"<br />ohos:center_in_parent="$boolean:true" |
| horizontal_center   | 将子组件保持在父组件水平方向的中心     | boolean类型 | 可以直接设置true/false，也可以引用boolean资源。 | ohos:horizontal_center="true"<br />ohos:horizontal_center="$boolean:true" |
| vertical_center     | 将子组件保持在父组件垂直方向的中心     | boolean类型 | 可以直接设置true/false，也可以引用boolean资源。 | ohos:vertical_center="true"<br />ohos:vertical_center="$boolean:true" |



### 二、排列方式

DependentLayout的排列方式是相对于其他同级组件或者父组件的位置进行布局。

#### 2.1 相对于同级组件

end_of：

![WX20210602-113523@2x](img/WX20210602-113523@2x.png)



示例代码：

```xml
<?xml version="1.0" encoding="utf-8"?>
<DependentLayout
    xmlns:ohos="http://schemas.huawei.com/res/ohos"
    ohos:width="match_content"
    ohos:height="match_content"
    ohos:background_element="#EDEDED"
    >
    <Text
        ohos:id="$+id:text1"
        ohos:width="match_content"
        ohos:height="match_content"
        ohos:left_margin="15vp"
        ohos:top_margin="15vp"
        ohos:bottom_margin="15vp"
        ohos:text="text1"
        ohos:text_size="20fp"
        ohos:background_element="#1E90FF"/>
    <Text
        ohos:id="$+id:text2"
        ohos:width="match_content"
        ohos:height="match_content"
        ohos:left_margin="15vp"
        ohos:top_margin="15vp"
        ohos:right_margin="15vp"
        ohos:bottom_margin="15vp"
        ohos:text="end_of text1"
        ohos:text_size="20fp"
        ohos:background_element="#FFC0CB"
        ohos:end_of="$id:text1"/>
</DependentLayout>
```



below：

效果图：

![WX20210602-113728@2x](img/WX20210602-113728@2x.png)

示例代码：

```xml
<?xml version="1.0" encoding="utf-8"?>
<DependentLayout
    xmlns:ohos="http://schemas.huawei.com/res/ohos"
    ohos:width="match_content"
    ohos:height="match_content"
    ohos:background_element="#EDEDED"
    >
    <Text
        ohos:id="$+id:text1"
        ohos:width="match_content"
        ohos:height="match_content"
        ohos:left_margin="15vp"
        ohos:top_margin="15vp"
        ohos:bottom_margin="15vp"
        ohos:text="text1"
        ohos:text_size="20fp"
        ohos:background_element="#1E90FF"/>
    <Text
        ohos:id="$+id:text2"
        ohos:width="match_content"
        ohos:height="match_content"
        ohos:left_margin="15vp"
        ohos:top_margin="15vp"
        ohos:right_margin="15vp"
        ohos:bottom_margin="15vp"
        ohos:text="end_of text1"
        ohos:text_size="20fp"
        ohos:background_element="#FFC0CB"
        ohos:end_of="$id:text1"/>

    <Text
        ohos:id="$+id:text3"
        ohos:width="match_content"
        ohos:height="match_content"
        ohos:left_margin="15vp"
        ohos:top_margin="15vp"
        ohos:right_margin="40vp"
        ohos:bottom_margin="15vp"
        ohos:text="below text1"
        ohos:text_size="20fp"
        ohos:background_element="#FF00FF"
        ohos:below="$id:text1"/>
</DependentLayout>
```



**其他的above、start_of、left_of、right_of等参数可分别实现类似的布局。**



举个例子，效果图：

<img src="img/WX20210602-134336@2x.png" alt="WX20210602-134336@2x" style="zoom:50%;" />



示例代码：

```xml
<?xml version="1.0" encoding="utf-8"?>
<DependentLayout
    xmlns:ohos="http://schemas.huawei.com/res/ohos"
    ohos:width="match_parent"
    ohos:height="match_parent"
    >
    <Button
        ohos:id="$+id:button1"
        ohos:width="match_content"
        ohos:height="match_content"
        ohos:text="中心"
        ohos:text_size="20fp"
        ohos:padding="10vp"
        ohos:margin="10vp"
        ohos:background_element="#EEEEEE"
        ohos:center_in_parent="true"/>
    <Button
        ohos:id="$+id:button2"
        ohos:height="match_content"
        ohos:width="match_content"
        ohos:text="上面"
        ohos:text_size="20fp"
        ohos:padding="10vp"
        ohos:above="$id:button1"
        ohos:background_element="#EEEEEE"
        ohos:align_left="$id:button1"
        />
    <Button
        ohos:id="$+id:button3"
        ohos:height="match_content"
        ohos:width="match_content"
        ohos:text="下面"
        ohos:text_size="20fp"
        ohos:padding="10vp"
        ohos:below="$id:button1"
        ohos:background_element="#EEEEEE"
        ohos:align_left="$id:button1"
        />
    <Button
        ohos:id="$+id:button4"
        ohos:height="match_content"
        ohos:width="match_content"
        ohos:text="左面"
        ohos:text_size="20fp"
        ohos:padding="10vp"
        ohos:left_of="$id:button1"
        ohos:align_top="$id:button1"
        ohos:background_element="#EEEEEE"
        />
    <Button
        ohos:id="$+id:button5"
        ohos:height="match_content"
        ohos:width="match_content"
        ohos:text="右面"
        ohos:text_size="20fp"
        ohos:padding="10vp"
        ohos:right_of="$id:button1"
        ohos:align_top="$id:button1"
        ohos:background_element="#EEEEEE"
        />
</DependentLayout>
```









#### 2.2 相对于父组件

以上位置布局可以组合，形成处于左上角、左下角、右上角、右下角的布局。

![WX20210602-132611@2x](img/WX20210602-132611@2x.png)

示例代码：

```xml
<?xml version="1.0" encoding="utf-8"?>
<DependentLayout
    xmlns:ohos="http://schemas.huawei.com/res/ohos"
    ohos:width="300vp"
    ohos:height="200vp"
    ohos:background_element="#ffbbbbbb">
    <Text
        ohos:id="$+id:text1"
        ohos:width="match_content"
        ohos:height="match_content"
        ohos:text="父容器右侧并居中"
        ohos:text_size="12fp"
        ohos:background_element="#48D1CC"
        ohos:align_parent_right="true"
        ohos:center_in_parent="true"/>
    <Text
        ohos:id="$+id:text2"
        ohos:width="match_content"
        ohos:height="match_content"
        ohos:text="父容器底部"
        ohos:text_size="12fp"
        ohos:background_element="#FFA500"
        ohos:align_parent_bottom="true"
        ohos:center_in_parent="true"/>
    <Text
        ohos:id="$+id:text3"
        ohos:width="match_content"
        ohos:height="match_content"
        ohos:text="父容器中心"
        ohos:text_size="12fp"
        ohos:background_element="#BA55D3"
        ohos:center_in_parent="true"/>
    <Text
        ohos:id="$+id:text4"
        ohos:width="match_content"
        ohos:height="match_content"
        ohos:text="父容器左上"
        ohos:text_size="12fp"
        ohos:background_element="#FF1493"
        ohos:align_parent_left="true"
        ohos:align_parent_top="true"/>
    <Text
        ohos:id="$+id:text5"
        ohos:width="match_content"
        ohos:height="match_content"
        ohos:text="父容器左下"
        ohos:text_size="12fp"
        ohos:background_element="#1E90FF"
        ohos:align_parent_left="true"
        ohos:align_parent_bottom="true"/>
</DependentLayout>
```



举个例子，完成九饼：

<img src="img/WX20210602-133348@2x.png" alt="WX20210602-133348@2x" style="zoom:50%;" />

示例代码：

```xml
<?xml version="1.0" encoding="utf-8"?>
<DependentLayout
    xmlns:ohos="http://schemas.huawei.com/res/ohos"
    ohos:width="match_parent"
    ohos:height="match_parent"
    >
    <Text

        ohos:id="$+id:text1"
        ohos:width="80vp"
        ohos:height="80vp"
        ohos:background_element="$media:binggan"
        ohos:align_parent_left="true"
        ohos:align_parent_top="true"/>
    <Text
        ohos:id="$+id:text2"
        ohos:width="80vp"
        ohos:height="80vp"
        ohos:background_element="$media:binggan"
        ohos:align_parent_top="true"
        ohos:center_in_parent="true"/>
    <Text
        ohos:id="$+id:text3"
        ohos:width="80vp"
        ohos:height="80vp"
        ohos:background_element="$media:binggan"
        ohos:align_parent_right="true"
        ohos:align_parent_top="true"
        />
    <Text
        ohos:id="$+id:text4"
        ohos:width="80vp"
        ohos:height="80vp"
        ohos:background_element="$media:binggan"
        ohos:align_parent_left="true"
        ohos:vertical_center="true"/>
    <Text
        ohos:id="$+id:text5"
        ohos:width="80vp"
        ohos:height="80vp"
        ohos:background_element="$media:binggan"
        ohos:center_in_parent="true"/>
    <Text
        ohos:id="$+id:text6"
        ohos:width="80vp"
        ohos:height="80vp"
        ohos:background_element="$media:binggan"
        ohos:vertical_center="true"
        ohos:align_parent_right="true"/>
    <Text
        ohos:id="$+id:text7"
        ohos:width="80vp"
        ohos:height="80vp"
        ohos:background_element="$media:binggan"
        ohos:align_parent_left="true"
        ohos:align_parent_bottom="true"/>
    <Text
        ohos:id="$+id:text8"
        ohos:width="80vp"
        ohos:height="80vp"
        ohos:background_element="$media:binggan"
        ohos:horizontal_center="true"
        ohos:align_parent_bottom="true"/>
    <Text
        ohos:id="$+id:text9"
        ohos:width="80vp"
        ohos:height="80vp"
        ohos:background_element="$media:binggan"
        ohos:align_parent_bottom="true"
        ohos:align_parent_right="true"/>
</DependentLayout>
```



最后，再来个例子：

![WX20210602-140056@2x](img/WX20210602-140056@2x.png)



示例代码：

```xml
<?xml version="1.0" encoding="utf-8"?>
<DependentLayout
    xmlns:ohos="http://schemas.huawei.com/res/ohos"
    ohos:width="match_parent"
    ohos:height="match_content"
    ohos:background_element="#959595">
    <Text
        ohos:id="$+id:text1"
        ohos:width="match_parent"
        ohos:height="match_content"
        ohos:text_size="25fp"
        ohos:top_margin="15vp"
        ohos:left_margin="15vp"
        ohos:right_margin="15vp"
        ohos:top_padding="5vp"
        ohos:bottom_padding="5vp"
        ohos:background_element="#6C6C6C"
        ohos:text="Title"
        ohos:text_weight="1000"
        ohos:text_alignment="horizontal_center"
        />
    <Text
        ohos:id="$+id:text2"
        ohos:width="match_content"
        ohos:height="150vp"
        ohos:text_size="10fp"
        ohos:background_element="#6C6C6C"
        ohos:text="Catalog"
        ohos:top_margin="15vp"
        ohos:left_margin="15vp"
        ohos:right_margin="15vp"
        ohos:bottom_margin="15vp"
        ohos:left_padding="5vp"
        ohos:right_padding="5vp"
        ohos:align_parent_left="true"
        ohos:text_alignment="center"
        ohos:multiple_lines="true"
        ohos:below="$id:text1"
        ohos:text_font="serif"/>
    <Text
        ohos:id="$+id:text3"
        ohos:width="match_parent"
        ohos:height="150vp"
        ohos:text_size="25fp"
        ohos:background_element="#6C6C6C"
        ohos:text="Content"
        ohos:top_margin="15vp"
        ohos:right_margin="15vp"
        ohos:bottom_margin="15vp"
        ohos:text_alignment="center"
        ohos:below="$id:text1"
        ohos:end_of="$id:text2"
        ohos:text_font="serif"/>
    <Button
        ohos:id="$+id:button1"
        ohos:width="70vp"
        ohos:height="match_content"
        ohos:text_size="15fp"
        ohos:background_element="#6C6C6C"
        ohos:text="Previous"
        ohos:right_margin="15vp"
        ohos:bottom_margin="15vp"
        ohos:padding="5vp"
        ohos:below="$id:text3"
        ohos:left_of="$id:button2"
        ohos:italic="false"
        ohos:text_weight="5"
        ohos:text_font="serif"/>
    <Button
        ohos:id="$+id:button2"
        ohos:width="70vp"
        ohos:height="match_content"
        ohos:text_size="15fp"
        ohos:background_element="#6C6C6C"
        ohos:text="Next"
        ohos:right_margin="15vp"
        ohos:bottom_margin="15vp"
        ohos:padding="5vp"
        ohos:align_parent_end="true"
        ohos:below="$id:text3"
        ohos:italic="false"
        ohos:text_weight="5"
        ohos:text_font="serif"/>
</DependentLayout>
```

