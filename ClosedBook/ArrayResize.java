package ClosedBook;

import java.util.Arrays;

public class ArrayResize {
	public static int[] resizeArray(int[] a,int size) {
		int[] b =a;
		a= new int[size];
		for(int i=0;i<b.length;i++) {	
				a[i]=b[i];	
		}
		return a;
		
	}
	public static void main(String[] args) {
		int[] a = {1,2,3};
		System.out.println(Arrays.toString(a));
		a=resizeArray(a, 6);
		System.out.println(Arrays.toString(a));
	}
}
