package test;

public class Hit {

	public static void main(String[] args)
	{
		Son son = new Son(100);
		Parent father = new Parent("father",1,son);
		Parent mother = new Parent("mother",1,son);
		father.start();
		mother.start();
	}
}