
public class SingletonClass {
	private static SingletonClass singletonClass=new SingletonClass();
	private SingletonClass() {
		System.out.println("This is a singleton class.");
	}
}
