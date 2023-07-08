package QuadraticFunctions;

public class Abc {
	private int a;
	private int b;
	private int c;
	public Abc() {
		//a constructor with no parameters (setting a, b, and c to 1)
		a=1;
		b=1;
		c=1;
	}
	public Abc(int a,int b,int c) {
		//three extractors that return the values of a, b, and c, respectively 

		this.a=a;
		this.a=b;
		this.c=c;
	}
	
	
	//three extractors that return the values of a, b, and c, respectively
	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
	public int getC() {
		return c;
	}
	
	
	public void setAbc(int a,int b,int c) {
		/*a modifier that requires three parameters, one each to give new 
		values to a, b, and c*/

		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	public int quadraticFunction(int x) {
		/*a compute method that takes a parameter x and that returns the 
		value f(x) for the given values of a, b, and c*/
		return a*x*x+b*x+c;
	}
	public static void main(String[] args) {
		Abc a1 = new Abc();
		int result1 = a1.quadraticFunction(2);
		System.out.println("result 1 : "+result1);
		
		Abc a2 = new Abc(2,3,4);
		int result2 = a2.quadraticFunction(2);
		System.out.println("result 2 : "+result2);
		
		a2.setAbc(10,9,8);
		System.out.println("value of a :"+a2.getA());
		System.out.println("value of b:"+a2.getB());
		System.out.println("value of c:"+a2.getC());
		
	}
}
