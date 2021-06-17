## 手把手教你搭建Java环境

> 作者：韩茹
>
> 公司：程序咖（北京）科技有限公司
>
> 程序咖：IT职业技能评测平台
>
> 网址：https://www.chengxuka.com

![rexue](img/rexue.png)

任务

```
1.下载JDK
2.安装JDK
3.配置环境变量
4.测试
5.卸载
```





想要进行java语言的学习与开发，我们要先搭建java的开发环境。就好比我们做一道油焖大虾，首先要有厨房这个环境。只有在厨房里，我们才可以使用燃气炉灶，油，盐等做出一道菜。同理，只有安装了java的开发环境，我们才能够编写和运行java的程序。



## 一、下载JDK

Java已经被Oracle收购，进入Oracle官网下载。

https://www.oracle.com/cn/index.html

- 1、首先，打开浏览器，输入以上Oracle的官网网址

![oracleguanwang1](img\oracleguanwang1.jpg)

- 2、然后点开产品，打开产品的列表，点击Java

![oracleguanwang2](img\oracleguanwang2.jpg)



- 3、点击Download Java，进入Java的下载页

![oracleguanwang3](img\oracleguanwang3.jpg)



- 4、滚动到下面，找到Java8版本。虽然最新版本是Java14，但是我们强烈建议选择Java8版本。

![oracleguanwang4](img\oracleguanwang4.jpg)



- 5、根据自己电脑的操作系统，进行下载。

![oracleguanwang5](img\oracleguanwang5.jpg)



当然，你也可以通过以下网盘链接来获取

课前准备工具包：链接:https://pan.baidu.com/s/1Kqg-O0r7H7KpXAXT3xvXww 密码:dqh4

![baiduwangpan](img\baiduwangpan.jpg)



## 二、安装JDK

**JDK的安装是无脑安装，就是一路下一步下一步。。直到完成。默认安装在C盘下的Program Files目录下，傻瓜式下一步下一步直到完成即可。但是如果想更改安装目录，那么请你小心按照以下操作进行安装。**

> 采坑：在jdk的安装过程中，包含了jre的安装，如果不想装在默认目录下，那么在安装jre的时候，要注意安装路径，不要覆盖刚刚安装好的jdk。



1、找到下载后的jdk的安装包，双击进行安装

![anzhuang1](img\anzhuang1.jpg)



2、首先安装jdk。在安装过程中，默认会安装到C盘的Program Files目录下，如果想改变安装目录，可以点击更改按钮。当然，你也可以安装到默认目录下。

![anzhuang2](img\anzhuang2.jpg)



3、直接手动的修改安装目录，将C盘改为你要安装的盘符即可。

![anzhuang3](img\anzhuang3.jpg)

4、修改好jdk的安装路径后，点击下一步。



![anzhuang4](img\anzhuang4.jpg)



5、一路下一步就安装好了jdk，然后就到了jre的安装。如果不想安装到默认的C盘，点击更改按钮。一般建议将jre和jdk安装到一个目录下。

![anzhuang5](img\anzhuang5.jpg)





6、此处会弹出浏览框，我们点击D盘后，再点击Java。jre的安装需要我们自己手动创建一个安装的文件夹。



![anzhuang6](img\anzhuang6.jpg)





7、安装jre的文件夹名，我们手动输入：jre后面跟着版本号。jre1.8.0_77。



![anzhuang7](img\anzhuang7.jpg)



8、点击确定后，就可以继续安装了。

![anzhuang8](img\anzhuang8.jpg)





9、到此jdk和jre安装完成。

![anzhuang9](img\anzhuang9.jpg)



10、然后查看一下安装目录，打开D盘，Program Files目录，多了一个Java文件夹，点进去后有两个文件夹，一个是jdk的安装目录，一个是jre的安装目录。

![anzhuang10](img\anzhuang10.jpg)



> 很多新同学在安装的时候，不注意安装目录，在安装jre的时候，会不小心覆盖掉刚刚安装好的jdk。所以一定要注意。



11、打开jdk文件夹

![anzhuang11](img\anzhuang11.jpg)

- bin目录：JDK开发工具的可执行文件。javac.exe和java.exe等命令就在此目录下。
- db：包含Java DB，Java DB是一个机遇Java编程语言的SQL关系数据库管理系统。
- include：包含C语言头文件，支持Java本地接口与Java虚拟机调试程序接口的本地编程技术。
- jre：Java运行时环境的根目录，包含Java虚拟机，运行时的类包和Java应用启动器。但不包含开发环境中的开发工具。
- lib目录：开发工具使用的归档包文件。
- src.zip：Java源码压缩包
- 。。。

## 三、配置环境变量

此电脑上右键选择属性，然后点击高级系统设置，就会打开系统属性窗口。

然后点击高级，点击下面的环境变量，就会打开环境变量的设置窗口。

![peizhi1](img\peizhi1.jpg)



1、在系统变量里，点击新建，配置JAVA_HOME变量。变量值就是刚刚jdk的安装路径。

![peizhi2](img\peizhi2.jpg)



2、配置CLASSPATH路径：

![peizhi3](img\peizhi3.jpg)



3、修改path路径：

在我们的windows系统中，path变量是内置好的，我们需要将jdk下的bin目录配置到path里。所以此处选择编辑：

![peizhi4](img\peizhi4.jpg)



然后两次新建，将jdk下的bin目录和jdk下jre里的bin目录配置进去。

![peizhi5](img\peizhi5.jpg)









```
我的电脑 --> 页面空白处，鼠标右键 --> 属性
--> 左侧边栏 高级系统设置 --> 环境变量


新建：
变量名:JAVA_HOME
变量值:D:\Program Files\Java\jdk1.8.0_77
		就是jdk的安装目录

新建:
变量名:CLASSPATH
变量值:.;%JAVA_HOME%\lib;%JAVA_HOME%\lib\tools.jar

修改:
变量名:path
添加内容:
	%JAVA_HOME%\bin;%JAVA_HOME%\jre\bin;
```



![JAVA_HOME](img\JAVA_HOME.png)

![CLASS_PATH](img\CLASS_PATH.png)

![PATH修改](img\PATH修改.png)

4、配置后一定要点击确定，这些配置才会生效。

![peizhi6](img\peizhi6.jpg)





**<font color="red" size="5">踩坑1：配置环境变量后，要点击确认按钮，配置才会生效。</font>**

**<font color="red" size="5">踩坑2：配置环境变量后，要重启dos黑窗口，命令才可以使用</font>**





## 四、测试是否安装成功

打开终端：

方法一：开始|Windows系统|命令提示符

方法二：搜索框里直接搜索：命令提示符或者cmd

方法三：快捷键：win+R键，然后输入cmd

**注意：如果你在配置环境变量前已经打开了dos窗口，那么配置环境变量后，需要重新打开dos窗口。**

测试1：

![ceshi1](img\ceshi1.jpg)



测试2：

![ceshi2](img\ceshi2.jpg)



## 五、卸载

如果安装错了路径，或者想换个安装路径，那么你要选择卸载jdk，然后重新安装。切记不要直接剪切安装包。

如果你有360或者腾讯管家等软件可以操作他们来卸载jdk。否则可以按照以下操作卸载：

1、打开控制面板，点击应用程序，选择卸载：

![xiezai1](img\xiezai1.jpg)

2、点击Java8 Update，选择卸载，然后下面的Java SE Development Kit 8 Update也要卸载。

![xiezai2](img\xiezai2.jpg)



3、然后查看以下刚刚的安装目录，正常情况下，该目录会随着卸载jdk而删除，但是如果没有删除，你可以手动删除它，然后再重新安装jdk。

![xiezai3](img\xiezai3.jpg)