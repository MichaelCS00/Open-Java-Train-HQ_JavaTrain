package work;
public class a {
      private String xs;
      private String name;
      private char sex;
      private  double height;
      public a(String a,String b,char c,double d)
       {xs=a;
         name=b;
         sex=c;
         height=d;}
    public void show() 
    {System.out.println(xs);
    System.out.println(name);
    System.out.println(sex);
    System.out.println(height);
    }
}
package work;
import work.a;
public class b extends a{
}