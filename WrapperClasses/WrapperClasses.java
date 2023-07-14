package WrapperClasses;

public class WrapperClasses {
	public static void main(String[] args) {
		int a =10;
		float b=20.0f;
		boolean c= true;
		System.out.println("AutoBoxing");
		Integer aa =(Integer)a;
		System.out.println(aa+" --> Address: "+aa.hashCode());
		Float bb = new Float(b);
		System.out.println(bb+" --> Address: "+bb.hashCode());
		Boolean cc = c;
		System.out.println(cc+" --> Address: "+cc.hashCode());
		System.out.println("UnBoxing");
		int aaa =aa;
		float bbb=bb;
		boolean ccc = cc;
		System.out.println(aaa);
		System.out.println(bbb);
		System.out.println(ccc);
		
	
		
	}
}
