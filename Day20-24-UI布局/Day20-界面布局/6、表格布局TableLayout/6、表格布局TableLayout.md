## 6、表格布局TableLayout



> 作者：韩茹
>
> 公司：程序咖（北京）科技有限公司
>
> 程序咖：IT职业技能评测平台
>
> 网址：https://www.chengxuka.com

TableLayout使用表格的方式划分子组件。

![0000000000011111111.20210402161825.15488980687844103312978336109283](img/0000000000011111111.20210402161825.15488980687844103312978336109283.png)

### 一、支持的XML属性

TableLayout的共有XML属性继承自：[Component](https://developer.harmonyos.com/cn/docs/documentation/doc-guides/ui-java-component-common-xml-0000001138483639)





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



TableLayout的自有XML属性见下表：

**表1** TableLayout的自有XML属性

| 属性名称       | 中文描述 | 取值           | 取值说明                                      | 使用案例                                                     |
| -------------- | -------- | -------------- | --------------------------------------------- | ------------------------------------------------------------ |
| alignment_type | 对齐方式 | align_edges    | 表示TableLayout内的组件按边界对齐。           | ohos:alignment_type="align_edges"                            |
|                |          | align_contents | 表示TableLayout内的组件按边距对齐。           | ohos:alignment_type="align_contents"                         |
| column_count   | 列数     | integer类型    | 可以直接设置整型数值，也可以引用integer资源。 | ohos:column_count="3"<br />ohos:column_count="$integer:count" |
| row_count      | 行数     | integer类型    | 可以直接设置整型数值，也可以引用integer资源。 | ohos:row_count="2"<br />ohos:row_count="$integer:count"      |
| orientation    | 排列方向 | horizontal     | 表示水平方向布局。                            | ohos:orientation="horizontal"                                |
|                |          | vertical       | 表示垂直方向布局。                            | ohos:orientation="vertical"                                  |







### 二、使用表格布局

#### 2.1 默认一列多行

TableLayout默认一列多行。

我们先修改一下布局文件，项目/entry/src/main/resources/base/layout/下的ability_main_layout文件。

删除原来的代码，创建TableLayout：

```xml
<?xml version="1.0" encoding="utf-8"?>
<TableLayout
    xmlns:ohos="http://schemas.huawei.com/res/ohos"
    ohos:height="match_parent"
    ohos:width="match_parent"
    ohos:background_element="#87CEEB"
    ohos:layout_alignment="horizontal_center"
    ohos:padding="8vp">
</TableLayout>
```



然后在里面添加4个Text子控件：

```xml
<?xml version="1.0" encoding="utf-8"?>
<TableLayout
    xmlns:ohos="http://schemas.huawei.com/res/ohos"
    ohos:height="match_parent"
    ohos:width="match_parent"
    ohos:background_element="#87CEEB"
    ohos:layout_alignment="horizontal_center"
    ohos:padding="8vp">

    <Text
        ohos:height="60vp"
        ohos:width="60vp"
        ohos:background_element="#00BFFF"
        ohos:margin="8vp"
        ohos:text="1"
        ohos:text_alignment="center"
        ohos:text_size="20fp"/>
    <Text
        ohos:height="60vp"
        ohos:width="60vp"
        ohos:background_element="#00BFFF"
        ohos:margin="8vp"
        ohos:text="2"
        ohos:text_alignment="center"
        ohos:text_size="20fp"/>
    <Text
        ohos:height="60vp"
        ohos:width="60vp"
        ohos:background_element="#00BFFF"
        ohos:margin="8vp"
        ohos:text="3"
        ohos:text_alignment="center"
        ohos:text_size="20fp"/>
    <Text
        ohos:height="60vp"
        ohos:width="60vp"
        ohos:background_element="#00BFFF"
        ohos:margin="8vp"
        ohos:text="4"
        ohos:text_alignment="center"
        ohos:text_size="20fp"/>
</TableLayout>
```



效果图：

<img src="img/WX20210603-111727@2x.png" alt="WX20210603-111727@2x" style="zoom:50%;" />















#### 2.2 设置多行多列

设置行数和列数：

```xml
<TableLayout
    ...
    ohos:row_count="2"
    ohos:column_count="2">
```



只需要在TableLayout标签中设置好行数和列数，其他的内容不用改，效果图：

<img src="img/WX20210603-111957@2x.png" alt="WX20210603-111957@2x" style="zoom:50%;" />





#### 2.4 设置对齐方式

在XML中设置对齐方式，以”align_contents“为例：

```xml
<TableLayout
    ...
    ohos:alignment_type="align_contents">
    ...
</TableLayout>
```



