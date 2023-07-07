package Arrays;

import java.util.Scanner;

public class MainOfArray {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] a = new int[6];
		ArrayOperations.initalizeArray(a);		
		System.out.println("Sum of Array : "+ArrayOperations.arraySum(a));
		System.out.println("Max of Array: "+ArrayOperations.arrayMax(a));
		System.out.println("Mix of Array: "+ArrayOperations.arrayMin(a));
		System.out.println("Average of Array :"+ArrayOperations.arrayAverage(a));
		System.out.println("Enter the number to get its index number");
		int num =scn.nextInt();
		System.out.println("Index of NUmber :"+ArrayOperations.arraySearch(a, num));
		ArrayOperations.arrayModification(a, 0, 100);
		ArrayOperations.arraySorting(a);
		ArrayOperations.traverseAndDisplay(a);
		scn.close();
	}
}
