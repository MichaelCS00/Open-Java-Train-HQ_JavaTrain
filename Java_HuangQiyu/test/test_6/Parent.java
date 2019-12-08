package test;

public class Parent extends Thread
{
	String name;
	int harm;
	Son son = new Son(100);
	
	public Parent(String name, int harm, Son son)
	{
		this.name = name;
		this.harm = harm;
		this.son = son;
	}
	public synchronized void run(){
		
		while(son.getBlood()>0)
		{
			son.setBlood(son.getBlood()-this.harm);
			System.out.println(Thread.currentThread().getName()+" hits son.The rest of son's blood is" + son.getBlood());
			
			try {
					Thread.sleep(1);
				}
			catch(InterruptedException e) 
			{
					e.printStackTrace();
			}
		}
		System.out.println("son have been killed");
	}
}

