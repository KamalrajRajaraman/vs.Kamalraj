package AccessModifier;

public class A {
	private int a =10;
	public int b =20;
	int c =30;
	protected int d =40;
	
	private  void m1() {
		System.out.println("hi m1");
	}
	public  void m2() {
		System.out.println("hi m2");
	}
	static void m3() {
		System.out.println("hi m3");
	}
	protected  void m4() {
		System.out.println("hi m4");
	}
}
