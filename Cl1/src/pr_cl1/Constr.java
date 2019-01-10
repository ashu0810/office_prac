package pr_cl1;

public class Constr {
	public Constr() 
	{
			this(1,2,3);			
			System.out.println("Default Const");
			
	}
			public Constr(int a)
			{
			this();
			System.out.println("One Parameterized");
			}
			public Constr(int a,int b)
			{
			this(1);
			System.out.println("Two parameterized");
			}
			public Constr(int a, int b,int c)
			{
			System.out.println("Three Parameterized");
			}
			public static void main(String[]args)
			{
			Constr ref=new Constr(1,1);
			}

	
	
}
