package ClosedBook;

public class LocationofElementInArray {
	public static int findIndex(int[] a,int num) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==num)
				return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] a = {2,6,4,7,0};
		int num =4;
		System.out.println(findIndex(a, num));
		
	}
}
