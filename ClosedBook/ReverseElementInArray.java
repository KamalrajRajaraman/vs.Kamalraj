package ClosedBook;

import java.util.Arrays;

public class ReverseElementInArray {
	public static void reverseArray(int[] a) {
		int i=0;
		int j = a.length-1;
		while(i<j) {
			int temp =a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
	}
	public static void main(String[] args) {
		int[] a = {2,6,4,7,10};
		reverseArray(a);
		System.out.println(Arrays.toString(a));
	}
}
