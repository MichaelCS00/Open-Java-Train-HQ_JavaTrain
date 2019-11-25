#  编写一个程序解决多线程问题，爸爸妈妈同时打儿子，儿子会扣血，但要求不能扣到0以下且扣血过程要准确;在此基础上尽量提高效率(具体类的设计和输出自定)

#### 1、实现Runnable接口 

#### 2、创建三个类:儿子只有Blood属性

```java
 class mother / father{
     int times_m/times_f;
 }
class son{
    int blood；
}
```

#### 3、使用Synchronized

Synchronized 可以保证同一时刻，只有一个线程可执行某个方法或某个代码块。

