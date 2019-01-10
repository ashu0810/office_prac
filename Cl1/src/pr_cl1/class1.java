package pr_cl1;

public class class1 {
	public int add(int a, int b) {
		int c;
		c=a+b;
		System.out.println("Add result=" +c);
		return c;
		}
	public int sub(int a, int b) {
		int c;
		c=a-b;
		System.out.println("Sub result=" +c);
		return c;
		}
	
	public int mul(int a, int b) {
		int c;
		c=a*b;
		System.out.println("mul result=" +c);
		return c;
		}
	public void div(int a, int b) {
		int c;
		c=a/b;
		System.out.println("Final result=" +c);
		
		}
 public static void main(String[] args) {
	class1 ref=new class1();
	int sum_result=ref.add(10, 2);
	int sub_result=ref.sub(sum_result, 2);
	int add_result=ref.add(sub_result, 2);
	int mul_result=ref.mul(add_result, 2);
    ref.div(mul_result, 2);
	
}
}
