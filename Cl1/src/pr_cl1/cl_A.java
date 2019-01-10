package pr_cl1;

public class cl_A {
	public cl_A(){
		this(1,2);
		System.out.println("Parent Default");
		}
	public cl_A(int a){
		this();
		System.out.println("Parent 1 Parameter");
		}
	public cl_A(int a, int b){
		System.out.println("Parent 2 Parameter");
		}
	public cl_A(int a, int b, int c){
		this(1);
		System.out.println("Parent 3 Parameter ");
			}
 

}
