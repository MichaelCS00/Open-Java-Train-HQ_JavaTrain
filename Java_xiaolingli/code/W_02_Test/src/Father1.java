
public class Father1 {
	private String surname;
    private String name;
    private String gender;
    private int height;
    
    Father1(){}
    Father1(String a,String b,String c,int d)
    {
    	surname=a;
    	name=b;
    	gender=c;
    	height=d;
    	
    }
    
   public void Show()
   {
   	   System.out.println("surname: "+surname);
   	   System.out.println("name: "+name);
       System.out.println("gender: "+gender);
       System.out.println("height: "+height);
   }
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Father1 f=new Father1("White","John","Man",180);
         f.Show();
	}

}
