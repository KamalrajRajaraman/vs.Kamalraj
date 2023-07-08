package ClosedBook;

import java.util.Arrays;

public class ArraySort {
	
	public static void sort(int[] a) {
		for(int i =0; i < a.length;i++) {
			for(int j = i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] a = {2,6,4,7,0};
		sort(a);
		System.out.println(Arrays.toString(a));
	}
}
