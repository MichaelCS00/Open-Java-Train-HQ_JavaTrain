package test4;

public class SingletonDemo3 {
	      public static final SingletonDemo3 INSTANCE = new SingletonDemo3();
	      private SingletonDemo3(){
	         
	      }
	      public static SingletonDemo3 getInstance(){
	          return INSTANCE;
	      }
	  
	  }
	  //工厂化方式，特点是可以在实例过程中添加逻辑。