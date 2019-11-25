
public class MultiThread {
	public static void main(String [] args) {
		FatherThread fh=new FatherThread();
		MotherThread mh=new MotherThread();
		fh.start();
		mh.start();
	}
}

class FatherThread extends Thread{
	Son son=new Son();
	Father father=new Father();
	@Override
	public void run() {
		for(;son.blood>0;) {
			father.fight(son);
			System.out.println("Father hiting...    Son's blood is "+son.blood);
		}	
	}
}

class MotherThread extends Thread{
	Son son=new Son();
	Mother mother=new Mother();
	@Override
	public void run() {
		for(;son.blood>0;) {
			mother.fight(son);
			System.out.println("Mother hiting...    Son's blood is "+son.blood);
		}	
	}
}

class Father{
	void fight(Son son){
		son.blood--;
	}
}

class Mother{
	void fight(Son son){
		son.blood--;
	}
}

class Son{
	private static final Son son=new Son();
	int blood;
	Son(){
		blood=100;
	}
}