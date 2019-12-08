package test4;

public class SingletonDemo1 {
	      private static SingletonDemo1 INSTANCE;
	      private SingletonDemo1(){
	         
	      }
	      public static SingletonDemo1 getInstance(){
	          if(INSTANCE==null){
	              INSTANCE = new SingletonDemo1();
	          }
	          return INSTANCE;
	      }
	  }
//简单的方式，但这个有一个缺点，那就是在并发执行时，可能存在多个实例。

//Singleton模式主要作用是保证在Java应用程序中，一个类Class只有一个实例存在。
//一般Singleton模式通常有几种种形式:第一一种形式:定义一一个类，它的构造函数为private的，
//它有一个static的private的该类变量，在类初始化时实例话，
//通过一个public的getInstance方法获取对它的引用，继而调用其中的方法。
