package exercise;

public class SingleCase {
	  private static SingleCase Single = new SingleCase();
      private SingleCase(){}
      public static SingleCase get(){
   	   return Single;
      }
      public void print(){
   	   System.out.println("Hello World!");
      }
}
