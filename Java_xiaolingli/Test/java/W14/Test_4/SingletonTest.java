package SingletonTest;

class Singleton{

	private Singleton(){}
	
	private static Singleton instance;
	
	public static Singleton getInstance() {
		
		if(instance==null)
			instance=new Singleton();
		
	    return instance;
	}
	
	public void getMassage() {
		System.out.print("This is the first test.");
	}
	
}

public class SingletonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Singleton s=Singleton.getInstance();
		s.getMassage();
	}
}

