package BasicOpenLabBook;

import java.util.Scanner;

public class ArrayInputSum {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] arr = new int[10];
		int sum=0;
		for(int i =0;i<arr.length;i++) {
			System.out.println("Enter next number");
			arr[i]=scn.nextInt();
		}
		for(int i : arr) {
			sum = sum +i;
		}
		System.out.println("Sum of Array = "+sum);
		scn.close();
	}
}
