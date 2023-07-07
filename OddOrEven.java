package BasicOpenLabBook;

import java.util.Scanner;

public class OddOrEven {
	
	static String oddOrEven(int num) {
		if(num%2==0)
			return "Even";
		return "Odd";
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a Number to Find Odd or Even");
		int num =scn.nextInt();
		String result = oddOrEven(num);
		System.out.println(num+" is "+result);
		scn.close();
	}
}
