public class Student {
    private static Student student =new Student();
    private String name;
    private int age;
    private double height;
    private Student()
    {
        name = null;
        age = 0;
        height =0.0;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public double getHeight()
    {
        return height;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public void setHeight(double height)
    {
        this.height=height;
    }
    public static Student getInstance()
    {
        return student;
    }
    public static void main(String[] args) {
    	Student student=getInstance();
    	student.setName("Hunkchen");
    	student.setAge(19);
    	student.setHeight(190.0);
    	System.out.println("the name of Student :"+student.getName());
    	System.out.println("the age of Student :"+student.getAge());
        System.out.println("the height of Student :"+student.getHeight());
}
}
