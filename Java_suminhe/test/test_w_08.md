# 一、描述一个Java程序从编写到运行的完整过程(图文表达)

一个Java程序的编译运行过程
1、编辑源代码 .java文件
2、编译 .java文件生成字节码文件 .class文件
3、JVM中的类加载器加载字节码文件 .class文件
4、JVM中的执行引擎找到入口方法main()，执行其中的字节码指令



# 二、完善您对Java中接口，抽象类，对象的理解（图文表达会用UML的尝试用UML）

## 1、抽象类：

抽象类除了不能实例化对象之外，类的其它功能依然存在，成员变量、成员方法和构造方法的访问方式和普通类一样。
由于抽象类不能实例化对象，所以抽象类必须被继承，才能被使用。
抽象类表示的是一种继承关系，一个类只能继承一个抽象类

## 2、接口

接口与类相似，但接口并不是类，接口以interface来声明编写，接口的方式和类很相似，但是它们属于不同的概念。
类描述对象的属性和方法。接口则包含类要实现的方法。
接口无法被实例化，但是可以被实现。一个实现接口的类，必须实现接口内所描述的所有方法，否则就必须声明为抽象类。
一个类却可以实现多个接口。

## 3、抽象类与接口的区别

1.抽象类中的方法可以有方法体，就是能实现方法的具体功能，但是接口中的方法不行。
2.抽象类中的成员变量可以是各种类型的，而接口中的成员变量只能是 public static final 类型的。
3.接口中不能含有静态代码块以及静态方法(用 static 修饰的方法)，而抽象类是可以有静态代码块和静态方法。
4.一个类只能继承一个抽象类，而一个类却可以实现多个接口。

## 4、对象

对象是对类的具体实现



# 三、举出几个常用的 git 命令，描述什么情况下会产生代码冲突？如何解决？

1. 初始化git仓库命令
   git init
2. 添加用户和邮箱 
   $  git config --global user.name ""
   $  git config --global user.email ""
3. git add 文件名 添加文件
4. git commit -m  0.1  提交代码库
5. git pull 更新代码
6. git push 提交代码

7. git checkout 文件名 还原本地文件
   git checkout 分支名称切换分支
8. git diff 比较工作区文件 和本地仓库文件 不加参数的话
9. git merge b   指定分支名 合并当前分支
10. git rebase b  把 b 合并到当前分支
11. git reset --hard   还原到上一个版本
    6.. git  log 查看提交记录
12. git reset -- hard  23ddnndnfdd  还原到指定版本
13. git rm 文件名 删除暂存区文件
14. .git branch -a 查看远程分支
15. git push origin master  --force 强制推送文件到远程服务器 替换原来的文件
16. git reflog show dev 查看操作记录  git reset --hard  版本号     还原具体的版本


## 代码冲突往往会发生在以下情况：

1. 多个代码更改发生在同一行代码上
2. 一个提交删除了某一个文件而另一个提交尝试去编辑该文件

## 解决方法

1. 解决同行代码竞争引起的合并冲突
   为了解决一个由更改同行代码引起的合并冲突，你必须决定在冲突方中哪一个提交的代码才是最终需要提交到分支上。
   （1）打开Git Bash。
   （2）进入发生代码冲突的本地Git仓库。
   （3）获取受到合并冲突印象的文件列表。在本例中，文件styleguide.md有一个合并冲突。
   （4）打开文本编辑器，并用他找到文件中冲突发生的地方。
   （5）你可以查找“<<<<<<<”标记符出现的地方来定位合并冲突发生的位置。
   （6）决定你是否只保留你分支上的代码，还是保留另一个开发人员提交的代码，
   或者编写一个全新的代码提交（包含两者）。
   删除冲突标记符“<<<<<<<”，“=======”，“>>>>>>>”，并对文件完成你想要的修改。
   （7）增加你的修改。
   （8）提交代码。
2. 解决文件删除引起的合并冲突
   （1）打开Git Bash。
   （2）进入发生代码冲突的本地Git仓库。
   （3）获取受到合并冲突印象的文件列表。在本例中，文件styleguide.md有一个合并冲突。
   （4）打开你的文本编辑器，例如Atom，并用他找到文件中冲突发生的地方。
   （5）决定你是否要保留被移除的文件。你也许想在文本编辑器中查看被移除文件最后的修改。
   （6）提交代码。



# 四、简单描述一下 jvm 内存模型(图文表达)



![test_4_JVM1](..\image\test_4_JVM1.jpg)

![test_4_JVM2](..\image\test_4_JVM2.png)



# 五、编写一个单例类，要求程序能完成一定的功能(具体自定)

## 一个Java应用程序，该程序中有3个类：Ladder、Circle和主类A。具体要求如下：Ladder类具有类型为double的上底、下底、高、面积属性，具有返回面积的功能，包括一个构造方法对上底、下底、高进行初始化。Circle类具有类型为double的半径、周长和面积属性，具有返回周长、面积的功能，包括一个构造方法对半径进行初始化。主类A用来测试类Ladder和类Circle的功能。

 [Ladder.md](..\code\test_5_code\Ladder.md) 

 [Circle.md](..\code\test_5_code\Circle.md) 

 [DemoTest.md](..\code\test_5_code\DemoTest.md) 



# 六、编写一个程序解决多线程问题，

## 爸爸妈妈同时打儿子，儿子会扣血，但要求不能扣到0以下且扣血过程要准确;
## 在此基础上尽量提高效率(具体类的设计和输出自定)

[MultiThread.md](..\code\test_6_code\MultiThread.md)

package demo2;

import java.util.Random;
/**

 * @projectName(项目名称): Test1

 * @package(包名称): demo1

 * @className:(类名称): MultiThread  

 * @author(作者): Sumin He

 * @email: sumin.he@qq.com

 * @createDate(创建时间): 2019/11/26 17:08   

 * @description(类描述): TODO 一句话描述该类的功能

 * @updateUser(修改人): 修改人

 * @updateDate(修改时间): 修改时间

 * @updateRemark(修改备注): 说明本次修改内容   
   */
   public class MultiThread {

   public static void main(String [] args) {

       Runnable father = new Son();
       Runnable mother = new Son();
       
       Thread thread1 = new Thread(father);
       Thread thread2 = new Thread(mother);
       
       thread1.start();
       thread2.start();

   }
   }

class Son implements Runnable{
    private int blood = 100;
//    public Son(int b) {
//        blood = b;
//    }
    @Override
    public void run() {
        Random r = new Random();
        int n = r.nextInt(100);
        blood = blood - n;
        System.out.println("此次打儿子扣血量：" + n);
        if (blood > 0 ){
            System.out.println("儿子血量剩余：" + blood);
        }
        else {
            System.out.println("儿子血量少于0，已阵亡；");
        }
    }
}



