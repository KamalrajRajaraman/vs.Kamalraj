package Arrays;

import java.util.Scanner;

public class ArrayOperations{
	static Scanner scn =new Scanner(System.in);
	
	public static void initalizeArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the next Value to be inserted");
				arr[i]=scn.nextInt();
		}		
	}


	public static  void traverseAndDisplay(int[] arr) {	
		for(int num : arr) {
			System.out.println(num);
		}		
	}

	
	public static int  arraySum(int[] arr) {
		int sum=0;
		for(int num:arr) {
			sum = sum +num;
		}
		return sum;
	}

	
	public static double arrayAverage(int[] arr) {
		return arraySum(arr)/arr.length;
		
	}


	public static int  arrayMax(int[] arr) {
		arraySorting(arr);
		return arr[arr.length-1];
		
	}


	public static int arrayMin(int[] arr) {
		arraySorting(arr);
		return arr[0];
		
	}


	public static void arraySorting(int[]  arr) {
		for(int i =0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
	}

	
	public static String arraySearch(int[] arr,int num) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num)
				return i+"";
		}
		return "Number is not Found";
	}


	public static void arrayModification(int[] arr,int index,int num) {
		arr[index]=num;
	}
	

}
