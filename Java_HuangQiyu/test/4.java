public class Singleton{
    private static Singleton obj = new Singleton;
    private int num;
    private Singleton(){
        this.num=10;
    }
    public static Singleton get(){
        return obj;
    }

    public static void main(){
        Singleton obj = Singleton.get();
        system.out.println(obj.num);         
    }



}
