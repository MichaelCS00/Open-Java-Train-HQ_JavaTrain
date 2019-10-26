package family;
import java.util.Scanner;
public class father {
	String surname;
	String name;
	String sex;
	double height;
	void display() {
		System.out.println("姓氏"+":"+surname);
		System.out.println("姓名"+":"+name);
		System.out.println("性别"+":"+sex);
		System.out.println("身高"+":"+height);
	}
	void get() {
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.println("请输入姓氏");
		this.surname=input.nextLine();
		System.out.println("请输入姓名");
		this.name=input.nextLine();
		System.out.println("请输入性别");
		this.sex=input.nextLine();
		System.out.println("请输入身高");
		this.height=input.nextDouble();
	}
}
class son extends father{
	public static void main(String[]args) {
		son s =new son();
		s.get();
		s.display();
	}
}