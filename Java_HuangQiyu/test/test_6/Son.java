package test;

public class Son {
	private volatile int blood;
	
	public Son(int blood) {
		this.blood = blood;
	}
	
	public int getBlood(){
		return this.blood;
	}
	public void setBlood(int blood) 
	{
		this.blood = blood;
	}
}
