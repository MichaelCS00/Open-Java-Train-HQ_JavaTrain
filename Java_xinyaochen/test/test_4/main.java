package test4;

public class main {
	  
	     public static void main(String[] args) {
	         // TODO Auto-generated method stub
	       System.out.println("SingletonDemo1"+SingletonDemo1.getInstance());
	       System.out.println("SingletonDemo1"+SingletonDemo1.getInstance());
	         
	       System.out.println("SingletonDemo2"+SingletonDemo2.INSTANCE);
	       System.out.println("SingletonDemo2"+SingletonDemo2.INSTANCE);
	
	       System.out.println("SingletonDemo3"+SingletonDemo3.getInstance());
	       System.out.println("SingletonDemo3"+SingletonDemo3.getInstance());
	
	       System.out.println("SingletonDemo4"+SingletonDemo4.INSTANCE);
	       System.out.println("SingletonDemo4"+SingletonDemo4.INSTANCE);
	       
	       SingletonDemo4.INSTANCE.saySomthing("SingletonDemo4");
	   }
	}