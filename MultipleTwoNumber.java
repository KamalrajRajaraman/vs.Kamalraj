package BasicOpenLabBook;

import java.util.Scanner;

public class MultipleTwoNumber {
	public static int multiply(int a , int b) {
		int result=a*b;
		return result;
		
	}
	public static void main(String[] args) {
		Scanner scn  = new Scanner(System.in);
		System.out.println("Multiplicaion of Two Number");
		
		System.out.println("Enter First Number");
		int num1 = scn.nextInt();
		
		System.out.println("Enter Second Number");
		int num2 =scn.nextInt();
		
		int mul = multiply(num1, num2);
		System.out.println("Multiple of "+num1+" and "+num2+" is : " +mul);
		scn.close();
	}
}
