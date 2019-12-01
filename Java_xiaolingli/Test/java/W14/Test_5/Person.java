package MultiThreadTest;

public class Person extends Thread {

	private Son son;
	private int fallcount;
	
	public  Person(String name,Son son,int fallcount) {
		super(name);
		this.son=son;
		this.fallcount=fallcount;
	}
	
	@Override
	public void run() 
	{
		
	 // synchronized(son)
	// {
		
		  while(son.getterBlood()>1)
		{ 
		  System.out.println(getName()+ " is hitting. Son lost blood: "+fallcount);
		  son.setterBlood(son.getterBlood()-1);
	      System.out.println("The rest of son's blood is : "+son.getterBlood());
	      
	      try {
			Thread.sleep(1);
		  }catch(InterruptedException e) {
			e.printStackTrace();
		  }
		}
		
		if(son.getterBlood()<0)
			System.out.println("son had been killed.");
		
	   }
	//}
}
