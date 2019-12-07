class Father{
	Father(){}
	Father(String a,String b, String c,int d){
		familyName=a;
		name=b;
		sex=c;
		height=d;
	}
	protected String familyName;
	private String name;
	private String sex;
	private int height;
	public void show(){
		System.out.println("Family Name: "+familyName);
		System.out.println("Name: "+name);
		System.out.println("Sex: "+sex);
		System.out.println("Height: "+height);
	}
}

class Son extends Father{
	Son(){}
	Son(String a,String b, String c,int d){
		super.familyName=a;
		name=b;
		sex=c;
		height=d;
	}
	private String name;
	private String sex;
	private int height;
	public void show(){
		System.out.println("Family Name: "+super.familyName);
		System.out.println("Name: "+name);
		System.out.println("Sex: "+sex);
		System.out.println("Height: "+height);
	}
	
}

class W_02_Test{
	public static void main(String [] args) {
		Father f=new Father("White","John","man",180);
		Son s=new Son("White","Johnson","man",188);
		System.out.println("-------Father------");
		f.show();
		System.out.println("--------Son--------");
		s.show();
	}
	
}