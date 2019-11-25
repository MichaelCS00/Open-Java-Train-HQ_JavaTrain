公共仓库中的个人文件目录下新建 test 文件夹用于存储往后的测试，最终所有测试需要上传到远程仓库

	以下测试能用图形表达的尽量用图像表达文档要求用 markdown 格式，需要写代码的用 Java 编写

## 0. 描述一个Java程序从编写到运行的完整过程(图文表达)
  ![01](https://github.com/MichaelCS00/HQ_JavaTrain/blob/master/Hunkchen_image/01.PNG)
## 1. 阐述你对 Java 中 接口、抽象类、对象 的理解(图文表达 会用 UML 的尽量用 UML)
  ![02](https://github.com/MichaelCS00/HQ_JavaTrain/blob/master/Hunkchen_image/02.png)
## 2. 举出几个常用的 git 命令，描述什么情况下会产生代码冲突？如何解决？
### (1)git clone+仓库地址（克隆远程仓库）
### (2)git add .(添加到暂存区）
### (3)cd 文件名（查看该文件）
### (4)ls(当前文件的子文件）
### (5)ll(查看当前文件具体的情况如时间等属性
### (6)git touch 创建文档
### (7)mkdir创建文档
### (8)mr 删除文件
### (9)git status(查看当前代码状态)
### (10)git commit -m“”（提交到本地分支）
### (11)git pull（将远程仓库的代码拉到本地分支）
### (12)git push（提交到远程仓库）
### 问题：本地仓库的代码不是最新的代码，再不是最新的代码修改，在推送的时候会发生冲突
### 解决方法：git pull拉去远程仓库最新状态
## 3. 简单描述一下 jvm 内存模型(图文表达)
  ![03](https://github.com/MichaelCS00/HQ_JavaTrain/blob/master/Hunkchen_image/03.png)
## 4. 编写一个单例类，要求程序能完成一定的功能(具体自定)
### public class Student {
###	private static Student student =new Student();
###	private String name;
###	private int age;
###     private double height;
###	private Student()
###	{
###		name = null;
###		age = 0;
###		height =0.0;
###	}
###	public String getName()
###	{
###		return name;
###	}
###	public int getAge()
###	{
###		return age;
###	}
###	public double getHeight()
###	{
###		return height;
###	}
###	public void setName(String name)
###	{
###		this.name = name;
###	}
###	public void setAge(int age)
###	{
###		this.age=age;
###	}
###	public void setHeight(double height)
###	{
###		this.height=height;
###	}
###	public static Student getInstance()
###	{
###		return student;
###	}
###	public static void main(String[] args) {
###		getInstance().setName("Hunkchen");
###		getInstance().setAge(19);
###		getInstance().setHeight(190.0);
###		System.out.println("the name of Student :"+getInstance().getName());
###		System.out.println("the age of Student :"+getInstance().getAge());
###		System.out.println("the height of Student :"+getInstance().getHeight());
###	}
### }
## 5. 编写一个程序解决多线程问题，爸爸妈妈同时打儿子，儿子会扣血，但要求不能扣到0以下且扣血过程要准确;在此基础上尽量提高效率(具体类的设计和输出自定)

