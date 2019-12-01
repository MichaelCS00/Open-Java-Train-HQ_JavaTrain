import java.util.Scanner;

public class Son extends Futher {
	Scanner b=new Scanner(System.in);
    private String name=b.nextLine();
    private String gender=b.nextLine();
    private int height=b.nextInt();
    
    public void Show2()
    {
    	System.out.println(name);
        System.out.println(gender);
        System.out.println(height);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son obj2=new Son();
		obj2.Show2();
		
	}

}
