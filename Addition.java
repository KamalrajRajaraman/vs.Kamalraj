package BasicOpenLabBook;

import java.util.Scanner;

public class Addition {
	public static int add(int a,int b) {
		int sum =a+b;
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Addition of Two Number");
		
		System.out.println("Enter the First Number");
		int firstNUmber = scn.nextInt();
		
		System.out.println("Ener the Second Number");
		int secondNumber = scn.nextInt();
		
		int sum = add(firstNUmber,secondNumber);
		System.out.println("Sum Of Two NUmber : "+sum);
		
		scn.close();
	
		
	}

}
