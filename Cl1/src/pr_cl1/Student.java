package pr_cl1;

public class Student {
	int age;
	
	int roll_no=4;
	
	public void display1()
	{
		System.out.println("Welcome All");
	}
	public void display2()
	{
		System.out.println("Hi All");
	}
	
	public static void main(String[] args) {

		Student deepak=new Student();
		deepak.roll_no=87;
		deepak.age=23;
		deepak.display1();
		deepak.display2();
		System.out.println(deepak.age);
		System.out.println(deepak.roll_no);
		Student deep=new Student();
		deep.roll_no=8;
		deep.age=20;
		System.out.println(deep.age+"," +deep.roll_no);
		deep.display1();
		deep.display2();
	}
	

}