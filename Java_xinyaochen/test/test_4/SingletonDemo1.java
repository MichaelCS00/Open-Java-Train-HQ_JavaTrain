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
