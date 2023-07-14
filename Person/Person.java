package Person;
/**
 * 
 * @author KAMALRAJ
 * person class has name, age, address parameters.When ever we want to store these like parameters use can
 * make use of this class
 *
 */
public class Person extends Persons {
	/**
	 * Instance variable name container is used to store name of person Object
	 */
	private String name;
	/**
	 * Instance variable age container is used to store age of person Object
	 */
	
	private int age;
	/**
	 * Instance variable address container is used to store address of person Object
	 */
	private String address;
	/**
	 * getName is Overridden from Person Class ,which is used to get name of the Person
	 */
	static  int count;
	@Override
	public String getName() {
		return this.name;
	}
	/**
	 * setName is Overridden from Person Class ,which is used to set name of the Person
	 */
	@Override
	public void setName(Object name) {
		this.name = (String)name;
		
	}
	/**
	 * getAge is Overridden from Person Class ,which is used to get age of the Person
	 */
	@Override
	public Object getAge() {
		
		return this.age;
	}
	/**
	 * setAge is Overridden from Person Class ,which is used to set age of the Person
	 */
	@Override
	public void setAge(Object age) {
		this.age=(int)age;
		
	}
	/**
	 * getAddress is Overridden from Person Class ,which is used to get address of the Person
	 */
	@Override
	public Object getAddress() {	
		return this.address;
	}
	
	/**
	 *setAddress is Overridden from Person Class ,which is used to set address of the Person
	 */

	@Override
	public void setAddress(Object address) {
		this.address =(String)address;
		
	}
	/**
	 * Person Class Has No arguments constructor is to create OBjects without initiating Instance Variables
	 */
	public Person() {
		count++;
	}
	/**
	 * Person Class Has arguments constructor is to create OBjects with initiating Instance Variables
	 */
	public Person(String name,int age,String address) {
		count++;
		this.name = name;
		this.age = age;
		this.address=address;
	}

}
