package ClosedBook;

import java.util.Scanner;

public class FindNumber {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number to find is palindrome");
		int num = scn.nextInt();
		String resultPalindriome = isPalindrome(num);
		System.out.println(num + " is "+resultPalindriome);
		System.out.println("Enter number to find is Amstrong");
		int num1 = scn.nextInt();
		String resultAmstrong = isAmstrongNumber(num1);
		System.out.println(num1 + " is "+resultAmstrong);
		System.out.println("Enter number to find is Perfect Number");
		int num2 = scn.nextInt();
		String resultPerfect = isPerfectNumber(num2);
		System.out.println(num2 + " is "+resultPerfect);
		scn.close();
		
	}
	
	public static String isPalindrome(int num) {
		int result=0;
		int numC =num;
		while(num>0) {
			int temp=num%10;
			result = result*10+temp;
			num = num/10;
		}
		return result==numC?"Prime":"not Prime";
	}
	public static int digitCount(int num) {
		int count=0;
		while(num>0) {
			count++;
			num = num/10;
		}
		return count;
	}
	public static int powerCal(int base,int power) {
		int result=1;
		while(power>0) {
			result=result*base;
			power--;
		}
		return  result;
	}
	
	public static String isAmstrongNumber(int num) {
		int result=0;
		int numC=num;
		int digit = digitCount(num);
		while(num>0) {
			int temp=num%10;
			result = result + powerCal(temp, digit);
			num = num/10;
		}
		return numC==result?"Amstrong Number":"Not Amstrong Number";
		
	}
	public static String isPerfectNumber(int num) {
		int a=1;
		int sum =0;
		while(a<=num/2) {
			if(num%a==0)
				sum=sum+a;	
			a++;
		}
		return sum==num?"Perfect Number":"Not Perfect Number";
	}
	
}
