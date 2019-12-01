package demo;

/**
 * @projectName(项目名称): Test1
 * @package(包名称): demo
 * @className:(类名称): Ladder  
 * @author(作者): Sumin He
 * @email: sumin.he@qq.com
 * @createDate(创建时间): 2019/11/25 23:03   
 * @description(类描述): TODO 一句话描述该类的功能
 * @updateUser(修改人): 修改人
 * @updateDate(修改时间): 修改时间
 * @updateRemark(修改备注): 说明本次修改内容   
 */
public class Ladder {
    //属性
    private double shangdi;
    private double xiadi;
    private double gao;
    private double mianji;

    //构造方法
    Ladder(double sd,double xd,double g){
        shangdi = sd;
        xiadi = xd;
        gao = g;
        mianji = (sd+xd)*g/2;
    }

    public double getMianji() {
        return mianji;
    }
}
