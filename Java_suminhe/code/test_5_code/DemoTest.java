package demo;

/**
 * @projectName(项目名称): Test1
 * @package(包名称): demo
 * @className:(类名称): DemoTest  
 * @author(作者): Sumin He
 * @email: sumin.he@qq.com
 * @createDate(创建时间): 2019/11/25 23:15   
 * @description(类描述): TODO 一句话描述该类的功能
 * @updateUser(修改人): 修改人
 * @updateDate(修改时间): 修改时间
 * @updateRemark(修改备注): 说明本次修改内容   
 */
public class DemoTest {
    public static void main(String[] args) {
        //实例化
        Ladder l1=new Ladder (10,20,5);
        //得到面积
        System.out.println(l1.getMianji());

        l1=new Ladder(1,3,20);
        System.out.println(l1.getMianji());

        Circle l2=new Circle(5);
        System.out.println(l2.getZhouchang());
        System.out.println(l2.getMianji());
    }
}
