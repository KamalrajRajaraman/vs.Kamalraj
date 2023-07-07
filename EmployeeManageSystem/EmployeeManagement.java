package EmployeeManageSystem;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class EmployeeManagement {
	private Scanner scn = new Scanner(System.in);
	private LinkedHashMap<Integer,HashMap> l1 = new LinkedHashMap<>();
	
	private int id;
	//create method is used to create employee record 
	public void create() {
		System.out.print("Enter Numbers for id : ");
		int id = scn.nextInt();
		System.out.print("Enter words for name : ");
		String name = scn.next();
		System.out.print("Enter Numbers for age : ");
		int age = scn.nextInt();
		System.out.print("Enter words for designation : " );
		String designation = scn.next();
		System.out.print("Enter Numbers for salary : " );
		double salary = scn.nextInt();
		LinkedHashMap  a1 = new LinkedHashMap();
		a1.put("id", id);
		a1.put("name",name);
		a1.put("age",age);
		a1.put("designation",designation);
		a1.put("Salary",salary);
		
		l1.put(id,a1);
		System.out.println("Succesfully Created");
		
	}
	
	public void display() {
		//display all employee record 
		System.out.println(l1);
	}
	
	public void searchId(int id) {
		//search a employee using id 
		System.out.println(l1.get(id));
	}
	
	public  void callId() {
		//callId() is used to prompt the user to enter the id
		System.out.println("Enter the id to get employee detail");
		id = scn.nextInt();
	}
	
	public  void update(){
		//update used update the records
		System.out.println("Enter\n1.name Change\n2.age change \n3.designation change \n4.salary change");
		int value = scn.nextInt();
		switch(value) {
			case 1 :
				callId();
				System.out.println("Name to be replced");
				String name = scn.next();
				updateName(id, name);
				break;
			case 2 :
				callId();
				System.out.println("age to be replced");
				int age = scn.nextInt();
				updateAge(id, age);
				break;
			case 3 :
				callId();
				System.out.println("Designation to be replced");
				String designation = scn.next();
				updateDesignation(id, designation);
				break;
			case 4 :
				callId();
				System.out.println("salary to be replced");
				int salary = scn.nextInt();
				updateSalary(id, salary);
				break;
		}
	}
	
	public void updateName(int id,String name) {
		HashMap h2 = l1.get(id);
		h2.replace("name", name);	
		System.out.println("Name updated...");
	}
	
	public void updateAge(int id,int age) {
		HashMap h2 = l1.get(id);
		h2.replace("age", age);	
		System.out.println("Age updated...");
	}
	
	public void updateDesignation(int id,String designation) {
		HashMap h2 = l1.get(id);
		h2.replace("designation",designation);	
		System.out.println("Desination updated...");
	}
	
	public void updateSalary(int id,int salary) {
		HashMap h2 = l1.get(id);
		h2.replace("Salary",salary);
		System.out.println("Salary updated...");
	}
	
	public void delete() {
		callId();
		l1.remove(id);
		System.out.println("Deleted Successfullly");
	}
	
}
