package test4;

public enum SingletonDemo4 {
     INSTANCE;
     
    public static void saySomthing(String str){
        System.out.println("hello"+str);
     }
 }
//枚举方式，最佳实践，推荐使用，并且他不会存在多个实例化的问题以及反序列化的问题。