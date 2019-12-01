
public class Son1 extends Father1{
	
	private String name;
    private String gender;
    private int height;
    
    Son1(){}
    Son1(String a,String b,int c)
    {
    	
    	name=a;
    	gender=b;
    	height=c;
    	
    }
    public void Show()
    {  
    	System.out.println("name: "+name);
        System.out.println("gender: "+gender);
        System.out.println("height: "+height);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son1 s=new Son1("Johnson","Man",180);
        s.Show();
	}

}
