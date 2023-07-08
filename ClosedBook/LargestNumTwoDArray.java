package ClosedBook;

public class LargestNumTwoDArray {
	public static void main(String[] args) {
		int[][] a = {{2,6,7},{99,1000},{300,400,5}};
		printLargest2DArray(a);
	}
	
	public static int large(int[] a) {
		int large =a[0];
		for(int j = 0;j<a.length;j++) {
			for(int k=j+1;k<a.length;k++) {
				if(a[j]<a[k])
					large=a[k];		
			}
		}
		return large;
	}
	public static void printLargest2DArray(int[][] a) {
		
		for(int i=0;i<a.length;i++) {
			System.out.println(i+"th index largest element :"+large(a[i]));	
		}
	}
	
}
