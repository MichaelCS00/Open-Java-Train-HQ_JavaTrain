package test_java;

import static java.lang.System.out;
import java.util.concurrent.locks.ReentrantLock;

public class multi_thread {
    public static void main(String args[]){
        father f=new father();
        mother m=new mother();
        son s=new son();
        Thread thread_f=new Thread(new Runnable() {
            @Override
            public void run() {
                s.blood-=f.bounch();
                System.out.println(s.blood);
            }
        });
        Thread thread_m=new Thread(new Runnable() {
            @Override
            public void run() {
                s.blood-=m.bounch();
                System.out.println(s.blood);
            }
        });
        thread_f.start();
        thread_m.start();
    }
}
class father{
    int cishu_f;
    public synchronized int bounch(){
        int once = (int)(100*Math.random());
        return once;
    }
}
class son{
    int blood;
}
class mother{
    int cishu_m;
    public synchronized int bounch(){
        int once = (int)(100*Math.random());
        return once;
    }
}