package pr_cl1;

public class Poly {
	public void poly1(int a, int b){System.out.println("test");}
	
	public void poly1(int a, float b){
		System.out.println("i,f");
	}
	
	public void poly1(int a, int b, int c){}
	
	public void poly1(int a, int b, float c){}

	public static void main(String[] args) {
		Poly nw=new Poly();
		nw.poly1(12, 25);
		
	}
}
