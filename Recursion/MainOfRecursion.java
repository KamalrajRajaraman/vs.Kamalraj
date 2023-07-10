package Recursion;

import java.util.Scanner;

public class MainOfRecursion {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Recursion r1 = new Recursion();
		System.out.println("Enter\n1. Factorial Calculation"
				+ "\n2.Fibonacci Series"
				+ "\n3.Sum of Digits"
				+ "\n4.Palindrome Check");
		int choice = scn.nextInt();
		switch(choice) {
			case 1:
				System.out.println("Enter a number to find fact");
				int x = scn.nextInt();
				System.out.println(r1.fact(x));
			    break;
			case 2:
				System.out.println("Enter n1,n2,range to find fib");
				int n1 = scn.nextInt();
				int n2 = scn.nextInt();
				int range= scn.nextInt();
				r1.fib(n1, n2, range);
			    break;
			case 3:
				System.out.println("Enter a number to find Sum of digit");
				int num = scn.nextInt();
				System.out.println(r1.digitSum(num));
			    break;
			       
			case 4:
				System.out.println("Enter a String to find palindrome or not");
				String str = scn.next();
				System.out.println(r1.palindrome(str,str.length()-1));
			    break;
		}
	}
}
