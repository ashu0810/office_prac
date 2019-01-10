package pr_cl1 ;

public class Cl_b extends cl_A {
	
	public Cl_b(){
	
		this(1);
		System.out.println("Child Default");
		
	}
	
	public Cl_b(int a){
		System.out.println("Child 1 Parameter");
		
	}
	public Cl_b(int a, int b){
		this();
		System.out.println("Child 2 Parameter");
		}
	
	public Cl_b(int a, int b, int c){
		
		this(1,2);
		System.out.println("Child 3 Parameter");
		
			}
	
	public static void main(String[] args) {
	
		Cl_b cp=new Cl_b(1,2,3); 
		Integer r=Integer.parseInt("amount");	}
}
