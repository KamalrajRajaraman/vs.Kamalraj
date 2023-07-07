package BasicOpenLabBook;

import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args) {
		int number=0;
		int sum = 0; 
		Scanner sc = new Scanner(System.in); 
		 
		System.out.println("Please Enter any integer Value below 10: "); 
		number = sc.nextInt(); 
			 
		while (number <= 10) { 
			sum = sum + number; 
			number++; 
		} 
		 System.out.format("Sum of the Numbers From the While Loop is: "+ sum);
		 sc.close();
	}
	
	
}
