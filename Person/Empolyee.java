package Person;

public class Empolyee extends Person{
	
	private int empolyeeId;
	private double salary;
	
	
	public Empolyee(String name,int age,String address,int empolyeeId,double salary) {
		super(name,age,address);
		this.empolyeeId = empolyeeId;
		this.salary=salary;
	}
	
	@Override
	public String getName() {
		return super.getName();
	}
	@Override
	public Object getAddress() {
		return super.getAddress();
	}
	@Override
	public Object getAge() {
		return super.getAge();
	}
	
	@Override
	public String toString() {
		return "name : "+this.getName()
				+ "\nAge : "+this.getAge()
				+ "\nAddress : "+this.getAddress()
				+"\nEmpolyeeID : "+this.empolyeeId
				+"\nSalary :"+this.salary;
	}
	
	
}
