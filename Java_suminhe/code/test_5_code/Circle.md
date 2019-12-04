package demo;

import static java.lang.Math.PI;

/**
 * @projectName(项目名称): Test1
 * @package(包名称): demo
 * @className:(类名称): Circle  
 * @author(作者): Sumin He
 * @email: sumin.he@qq.com
 * @createDate(创建时间): 2019/11/25 23:08   
 * @description(类描述): TODO 一句话描述该类的功能
 * @updateUser(修改人): 修改人
 * @updateDate(修改时间): 修改时间
 * @updateRemark(修改备注): 说明本次修改内容   
 */
public class Circle {
    //属性
    private double banjing;
    private double zhouchang;
    private double mianji;

    //构造方法
    Circle(double r){
        banjing = r;
        zhouchang = 2*PI*r;
        mianji = PI*r*r;
    }

    public double getZhouchang() {
        return zhouchang;
    }

    public double getMianji() {
        return mianji;
    }
}
