package MultiThreadTest;

public class Son {
    
	private String name;
	private int blood;
	
	public Son() {}
	
	public Son(String name,int blood)
	{this.name=name;
	 this.blood=blood;}
	
	public void setterName(String name)
	{this.name=name;}
	
	public String getterName()
	{return this.name;}
	
	public void setterBlood(int blood)
	{this.blood=blood;}
	
	public int getterBlood()
	{return this.blood;}
	
	public int hashCode()
	{
		return name.hashCode();
	}
	
	public boolean equals(Object obj)
	{
		if (this==obj)
			return true;
		
		if(obj!=null&&obj.getClass()==Son.class)
		{
			Son target=(Son)obj;
			return target.getterName().equals(name);
		}
		
		return false;
	}
}

