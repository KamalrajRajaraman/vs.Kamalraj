package Person;
/**
 * 
 * @author KAMALRAJ
 * 
 *
 */
public class MainOfPerson {
	public static void main(String[] args) {
		System.out.println("Created Person class Object using NO args Constructor and Used getters and setters method");
		Person p1 = new Person();
		p1.setName("kamal");
		p1.setAge(24);
		p1.setAddress("10,m s pillai nagar");
		System.out.println("Name : "+p1.getName());
		System.out.println("Age : "+p1.getAge());
		System.out.println("Address : "+p1.getAddress());
		System.out.println("----------------------------------");
		
		System.out.println("Created Person class Object using args Constructor and used getters method");
		System.out.println("----------------------------------");
		
		Person p2 = new Person("kowsalya",21,"madurai");
		System.out.println("Name : "+p2.getName());
		System.out.println("Age : "+p2.getAge());
		System.out.println("Address : "+p2.getAddress());
		System.out.println("----------------------------------");
		
		System.out.println("Empolyee and override methods");
		System.out.println("----------------------------------");
		Empolyee e2 = new Empolyee("bakiya",22,"cuddalore",102,12000.00);
		System.out.println("Name : "+e2.getName());
		System.out.println("Age : "+e2.getAge());
		System.out.println("Address : "+e2.getAddress());
		System.out.println("----------------------------------");
		System.out.println("Empolyee details |\n"+e2);
		System.out.println("----------------------------------");
		
		Person p3 = new Person();
		Person p4 = new Person("a",1,"america");
		Person p5 = new Person();
		System.out.println("----------------------------------");
		System.out.println("Person Object Count");
		System.out.println("----------------------------------");
		System.out.println("Count :"+Person.count);
		
	}
}
