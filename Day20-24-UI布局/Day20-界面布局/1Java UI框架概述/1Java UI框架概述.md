# 【HarmonyOS鸿蒙开发UI专题NO.1】1、Java UI框架概述



> 作者：韩茹
>
> 公司：程序咖（北京）科技有限公司
>
> 鸿蒙巴士专栏作家



应用的Ability在屏幕上将显示一个用户界面，该界面用来显示所有可被用户查看和交互的内容。

应用中所有的用户界面元素都是由Component和ComponentContainer对象构成。Component是绘制在屏幕上的一个对象，用户能与之交互。ComponentContainer是一个用于容纳其他Component和ComponentContainer对象的容器。

Java UI框架提供了一部分Component和ComponentContainer的具体子类，即创建用户界面（UI）的各类组件，包括一些常用的组件（比如：文本、按钮、图片、列表等）和常用的布局（比如：DirectionalLayout和DependentLayout）。用户可通过组件进行交互操作，并获得响应。

**所有的UI操作都应该在主线程进行设置。**

### 一、组件和布局

用户界面元素统称为组件，组件根据一定的层级结构进行组合形成布局。组件在未被添加到布局中时，既无法显示也无法交互，因此一个用户界面至少包含一个布局。在UI框架中，具体的布局类通常以XXLayout命名，完整的用户界面是一个布局，用户界面中的一部分也可以是一个布局。布局中容纳Component与ComponentContainer对象。



### 二、Component和ComponentContainer

- Component：提供内容显示，是界面中所有组件的基类，开发者可以给Component设置事件处理回调来创建一个可交互的组件。Java UI框架提供了一些常用的界面元素，也可称之为组件，组件一般直接继承Component或它的子类，如Text、Image等。
- ComponentContainer：作为容器容纳Component或ComponentContainer对象，并对它们进行布局。Java UI框架提供了一些标准布局功能的容器，它们继承自ComponentContainer，一般以“Layout”结尾，如DirectionalLayout、DependentLayout等。

**图1** Component结构

![0000000000011111111.20210330203819.69697269163018954464001089331457](img/0000000000011111111.20210330203819.69697269163018954464001089331457.png)





### 三、LayoutConfig

每种布局都根据自身特点提供LayoutConfig供子Component设定布局属性和参数，通过指定布局属性可以对子Component在布局中的显示效果进行约束。例如：“width”、“height”是最基本的布局属性，它们指定了组件的大小。

**图2** LayoutConfig

![0000000000011111111.20210330203819.23454739925301727219933385303769](img/0000000000011111111.20210330203819.23454739925301727219933385303769.png)





### 四、组件树

布局把Component和ComponentContainer以树状的层级结构进行组织，这样的一个布局就称为组件树。组件树的特点是仅有一个根组件，其他组件有且仅有一个父节点，组件之间的关系受到父节点的规则约束。





更多内容：

1、社区：鸿蒙巴士https://www.harmonybus.net/

2、公众号：HarmonyBus

3、技术交流QQ群：714518656

4、视频课：https://www.chengxuka.com

