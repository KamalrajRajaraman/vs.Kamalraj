package BasicOpenLabBook;

import java.util.Scanner;

public class ReverseNumber {
	static int reverseNumber(int num) {
		int result=0;
		while(num>0) {
			int temp = num%10;
			result = result*10+temp;
			num = num /10;
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number to be reversed");
		int num = scn.nextInt();
		int reverseNum = reverseNumber(num);
		System.out.println("The reverse of "+num+" is "+reverseNum);
		scn.close();
	}
}
