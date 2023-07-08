package AccessModifier;

public class B {
	public static void main(String[] args) {
		A a1 = new A();
		System.out.println(a1.a);
		System.out.println(a1.b);
		System.out.println(a1.c);
		System.out.println(a1.d);
		a1.m1();
		a1.m2();
		a1.m3();
		a1.m4();
		
	}
}
