public class Father {
     private String surname;
     public String name;
     String sex;
     double height;

   public void Get(){
	    Scanner input = new Scanner(System.in);
		System.out.println("请输入姓氏:");
		this.surname = input.nextLine();
		System.out.println("请输入姓名:");
		this.name = input.nextLine();
		System.out.println("请输入性别:");
		this.sex = input.nextLine();
		System.out.println("请输入身高:");
		this.height = input.nextDouble();
		
   }
    void Display(){
			System.out.println("姓氏:" + surname);
			System.out.println("姓名:" + name);
			System.out.println("性别:" + sex);
			System.out.println("身高:" + height);
		}
   
}
class Son extends Father{
	public static void main(String[]args) {
		Son s = new Son();
		s.Get();
		s.Display();
	}
}
