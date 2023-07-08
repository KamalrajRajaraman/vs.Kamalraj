package ClosedBook;

import java.util.Scanner;

public class Average {
	public static double averageOf(int num) {
		int a =1;
		int sum =0;
		while(a<=num) {
			sum=sum+a;
			a++;
		}
		return sum/num;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter n number to find average");
		int num = scn.nextInt();
		double average = averageOf(num);
		System.out.println(average);
		scn.close();
		
	}
}
