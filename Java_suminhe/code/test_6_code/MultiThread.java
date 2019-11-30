package demo2;

import java.util.Random;
/**
 * @projectName(项目名称): Test1
 * @package(包名称): demo1
 * @className:(类名称): MultiThread  
 * @author(作者): Sumin He
 * @email: sumin.he@qq.com
 * @createDate(创建时间): 2019/11/26 17:08   
 * @description(类描述): TODO 一句话描述该类的功能
 * @updateUser(修改人): 修改人
 * @updateDate(修改时间): 修改时间
 * @updateRemark(修改备注): 说明本次修改内容   
 */
public class MultiThread {

    public static void main(String [] args) {

        Runnable father = new Son();
        Runnable mother = new Son();

        Thread thread1 = new Thread(father);
        Thread thread2 = new Thread(mother);

        thread1.start();
        thread2.start();
    }
}

class Son implements Runnable{
    private int blood = 100;
//    public Son(int b) {
//        blood = b;
//    }
    @Override
    public void run() {
        Random r = new Random();
        int n = r.nextInt(100);
        blood = blood - n;
        System.out.println("此次打儿子扣血量：" + n);
        if (blood > 0 ){
            System.out.println("儿子血量剩余：" + blood);
        }
        else {
            System.out.println("儿子血量少于0，已阵亡；");
        }
    }
}

