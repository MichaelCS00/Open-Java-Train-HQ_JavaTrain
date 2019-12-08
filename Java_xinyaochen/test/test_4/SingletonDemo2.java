package test4;

public class SingletonDemo2 {
     public static final SingletonDemo2 INSTANCE = new SingletonDemo2();
     private SingletonDemo2(){
        
     }

}
//公共域的方式，特点就是简单，缺点就是做不到在返回的过程中做额外的逻辑处理。