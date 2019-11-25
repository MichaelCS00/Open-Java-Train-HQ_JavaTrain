package test4;

public class SingletonDemo3 {
	      public static final SingletonDemo3 INSTANCE = new SingletonDemo3();
	      private SingletonDemo3(){
	         
	      }
	      public static SingletonDemo3 getInstance(){
	          return INSTANCE;
	      }
	  
	  }