import java.util.Scanner;

public class Futher { 
	Scanner a=new Scanner(System.in);
    private String surname=a.nextLine();
    private String name=a.nextLine();
    private String gender=a.nextLine();
    private int height=a.nextInt();
    
    public void Show1()
    {
    	System.out.println(surname);
    	System.out.println(name);
        System.out.println(gender);
        System.out.println(height);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Futher obj1=new Futher();
         obj1.Show1();
	}

}
