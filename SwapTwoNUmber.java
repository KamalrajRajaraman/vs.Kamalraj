package BasicOpenLabBook;

public class SwapTwoNUmber {
	public static void main(String[] args) {
		double a = 7.7;
		double b = 9.9;
		
		System.out.println("Before Swaping");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		double temp = a;
		a = b;
		b= temp;
		
		System.out.println("After Swaping");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
}
