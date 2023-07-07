package BasicOpenLabBook;

import java.util.Scanner;

public class PrimeNumber {
	
	public static String primeNUmber(int num ) {
		int a=1;
		int count =0;
		while(a<=num/2) {
			if(num%a==0)
				count++;
			a++;
		}
		if(count==1) {
			return "Prime";
		}
		return "Not Prime";
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number to find it is Prime");
		int num = scn.nextInt();
		String result = primeNUmber(num);
		System.out.println(num+" is "+result);
		scn.close();
		
	}
}
