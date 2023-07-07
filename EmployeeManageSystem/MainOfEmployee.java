package EmployeeManageSystem;

import java.util.Scanner;


public class MainOfEmployee {
	private static Scanner scn = new Scanner(System.in);
	private static int choice;
	public static void getChoice() {
		System.out.println("Enter\n1.Create new empolyee record"
				+ "\n2.diplay all employee details"
				+ "\n3.search empolyee using id"
				+ "\n4.update the details of empolyee"
				+ "\n5.Delete a employee record "
				+ "\n6.Exit the menu ");
		choice = scn.nextInt();
	}
	public static void main(String[] args) {
		EmployeeManagement o1 = new EmployeeManagement();
		getChoice();
		while(choice!=6)
			switch(choice) {
				case 1:
					o1.create();
					getChoice();
				    break;
				case 2:
					o1.display();
					getChoice();
				    break;
				case 3:
					System.out.println("Enter the id to get employee detail");
					int id = scn.nextInt();
					o1.searchId(id);
					getChoice();
				    break;
				       
				case 4:
					o1.update();
					getChoice();
				    break;
				case 5:
					o1.delete();
					getChoice();
				    break;
			}
		
	}
}
