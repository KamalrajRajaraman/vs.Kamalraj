package ClosedBook;

import java.util.Scanner;

public class PrimeOrNot {
	static String primeOrNot(int num) {
		int a =1;
		int count=0;
		while(a<=num/2){
			if(num%a==0)
				count++;
			a++;
		}
		if(count==1)
			return "Prime";
		return "not Prime";
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number to check it is prime or not");
		int num =scn.nextInt();
		String result = primeOrNot(num);
		System.out.println(num + " is "+result);
		scn.close();
	}
}
