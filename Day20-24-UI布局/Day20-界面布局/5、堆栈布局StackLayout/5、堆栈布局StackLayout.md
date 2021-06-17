## 5、栈布局StackLayout



> 作者：韩茹
>
> 公司：程序咖（北京）科技有限公司
>
> 程序咖：IT职业技能评测平台
>
> 网址：https://www.chengxuka.com

StackLayout直接在屏幕上开辟出一块空白的区域，**添加到这个布局中的视图都是以层叠的方式显示**，而它会把这些视图默认放到这块区域的左上角，第一个添加到布局中视图显示在最底层，最后一个被放在最顶层。上一层的视图会覆盖下一层的视图。因此该布局叫做堆栈布局。
它很自由，无论你放多少个组件进去他都是从左上角开始计算，所以你可以用layout_alignment和margin做出随心所欲的布局。




![0000000000011111111.20210402161825.60223655492111112520532416880193](img/0000000000011111111.20210402161825.60223655492111112520532416880193.gif)

### 一、支持的XML属性

StackLayout无自有的XML属性，共有XML属性继承自：[Component](https://developer.harmonyos.com/cn/docs/documentation/doc-guides/ui-java-component-common-xml-0000001138483639)



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



StackLayout所包含组件可支持的XML属性见下表：

**表1** StackLayout所包含组件可支持的XML属性

| 属性名称         | 中文描述 | 取值              | 取值说明           | 使用案例                                                     |
| ---------------- | -------- | ----------------- | ------------------ | ------------------------------------------------------------ |
| layout_alignment | 对齐方式 | left              | 表示左对齐。       | 可以设置取值项如表中所列，<br />也可以使用“\|”进行多项组合。ohos:layout_alignment="top"<br />ohos:layout_alignment="top\|left" |
|                  |          | top               | 表示顶部对齐。     |                                                              |
|                  |          | right             | 表示右对齐。       |                                                              |
|                  |          | bottom            | 表示底部对齐。     |                                                              |
|                  |          | horizontal_center | 表示水平居中对齐。 |                                                              |
|                  |          | vertical_center   | 表示垂直居中对齐。 |                                                              |
|                  |          | center            | 表示居中对齐。     |                                                              |







### 二、排列方式

#### 2.1 使用默认布局添加组件

StackLayout，一层一层。每个子控件，默认从左上角开始显示，离父容器的声明标签越近，越位于底层。也就是说，越在后面声明的控件，越在上层。

示例代码：

```xml
<?xml version="1.0" encoding="utf-8"?>
<StackLayout
    xmlns:ohos="http://schemas.huawei.com/res/ohos"
    ohos:id="$+id:stack_layout"
    ohos:height="match_parent"
    ohos:width="match_parent">

    <Text
        ohos:id="$+id:text1"
        ohos:height="380vp"
        ohos:width="match_parent"
        ohos:text_alignment="bottom|horizontal_center"
        ohos:text_size="24fp"
        ohos:text="Layer 1"
        ohos:background_element="#C71585" />

    <Text
        ohos:id="$+id:text2"
        ohos:height="280vp"
        ohos:width="280vp"
        ohos:text_alignment="bottom|horizontal_center"
        ohos:text_size="24fp"
        ohos:text="Layer 2"
        ohos:background_element="#FF69B4" />

    <Text
        ohos:id="$+id:text3"
        ohos:height="180vp"
        ohos:width="180vp"
        ohos:text_alignment="center"
        ohos:text_size="24fp"
        ohos:text="Layer 3"
        ohos:background_element="#FFC0CB" />

</StackLayout>
```



效果图：

![WX20210602-143446@2x](img/WX20210602-143446@2x.png)













#### 2.2 使用相对位置添加组件

**使用layout_alignment属性可以指定组件在StackLayout中的相对位置**。

示例代码：

```xml
<?xml version="1.0" encoding="utf-8"?>
<StackLayout
    xmlns:ohos="http://schemas.huawei.com/res/ohos"
    ohos:height="match_parent"
    ohos:width="match_parent"
    >


    <Button
        ohos:height="50vp"
        ohos:width="100vp"
        ohos:text="Button 1"
        ohos:text_size="20fp"
        ohos:background_element="#eeeeee"
        ohos:layout_alignment="right"/>
    <Button
        ohos:height="50vp"
        ohos:width="100vp"
        ohos:text="Button 2"
        ohos:text_size="20fp"
        ohos:background_element="#eeeeee"
        ohos:layout_alignment="bottom"/>
    <Button
        ohos:height="50vp"
        ohos:width="100vp"
        ohos:text="Button 3"
        ohos:text_size="20fp"
        ohos:background_element="#eeeeee"
        ohos:layout_alignment="vertical_center"/>
    <Button
        ohos:height="50vp"
        ohos:width="100vp"
        ohos:text="Button 4"
        ohos:text_size="20fp"
        ohos:background_element="#eeeeee"
        ohos:layout_alignment="bottom|right"
        />


</StackLayout>
```

效果图：

<img src="img/WX20210602-145102@2x.png" alt="WX20210602-145102@2x" style="zoom:50%;" />





示例代码：

```xml
<?xml version="1.0" encoding="utf-8"?>
<StackLayout
    xmlns:ohos="http://schemas.huawei.com/res/ohos"
    ohos:height="match_parent"
    ohos:width="match_parent"
    >

    <Text
        ohos:id="$id:text1"
        ohos:height="match_parent"
        ohos:width="match_parent"
        ohos:background_element="#CD853F"
        />
    <Text
        ohos:id="$id:text2"
        ohos:height="600vp"
        ohos:width="300vp"
        ohos:background_element="#FF8C00"
        ohos:layout_alignment="center"
        />
    <Text
        ohos:id="$id:text3"
        ohos:height="400vp"
        ohos:width="200vp"
        ohos:background_element="#FFA500"
        ohos:layout_alignment="center"
        />
    <Text
        ohos:id="$+id:text4"
        ohos:height="200vp"
        ohos:width="100vp"
        ohos:background_element="#FFD700"
        ohos:layout_alignment="center"
        />
</StackLayout>
```

效果图：

<img src="img/WX20210602-144535@2x.png" alt="WX20210602-144535@2x" style="zoom:50%;" />

示例代码：

我们可以利用堆栈布局，结合layout_alignment和margin这两个属性，可以任意摆放。特别的方便。

这里负数就是在原来的基础上相反方向移动多少

注意：此处是负数，因为 layout_alignment = "center"
表示水平和垂直方向上居中，基准线为视图水平和垂直方向的中点，
因为鸟在基准线的上方向(负方向)，所以为负数)


```xml
<?xml version="1.0" encoding="utf-8"?>
<StackLayout
    xmlns:ohos="http://schemas.huawei.com/res/ohos"
    ohos:height="match_parent"
    ohos:width="match_parent"
    ohos:orientation="vertical">
    <!--第一层是背景-->
    <!--   ohos:scale_mode="clip_center"图片缩放模式，可以查看Image的文档 -->
    <Image
        ohos:height="match_parent"
        ohos:width="match_parent"
        ohos:image_src="$media:tiankong"
        ohos:scale_mode="clip_center"
        />
    <!-- 第二层为小鸟，菩萨，跑车

   负数就是在原来的基础上相反方向移动多少

   注意：此处是负数，因为 layout_alignment = "center"
   表示水平和垂直方向上居中，基准线为视图水平和垂直方向的中点，
   因为鸟在基准线的上方向(负方向)，所以为负数)
   -->

    <Image
        ohos:height="50vp"
        ohos:width="50vp"
        ohos:scale_mode="stretch"
        ohos:image_src="$media:bird"
        ohos:layout_alignment="center"
        ohos:top_margin="-120vp"
        ohos:left_margin="-40vp"
        />
    <!--菩萨-->
    <Image
        ohos:height="120vp"
        ohos:width="100vp"
        ohos:image_src="$media:pusa"
        ohos:scale_mode="stretch"
        ohos:layout_alignment="top|right"
        ohos:top_margin="30vp"
        ohos:right_margin="40vp"/>
    <!-- 跑车-->
     <Image
         ohos:height="150vp"
         ohos:width="150vp"
         ohos:image_src="$media:car"
         ohos:scale_mode="stretch"
         ohos:layout_alignment="horizontal_center|bottom"
         ohos:bottom_margin="50vp"/>
</StackLayout>
```

效果图：

<img src="img/WX20210607-100630@2x.png" alt="WX20210607-100630@2x" style="zoom:50%;" />
