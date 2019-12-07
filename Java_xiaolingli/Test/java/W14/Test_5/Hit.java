package MultiThreadTest;

public class Hit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Son son=new Son("Wang",100);
     
     new Person("father",son,1).start();
     new Person("mother",son,1).start();
  
	}

}
