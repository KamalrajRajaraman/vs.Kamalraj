package ClosedBook;

public class DetailOfElement {
	public static void main(String[] args) {
		int[] a = {2,6,4,7,0,2};
		int num =2;
		System.out.println("index of element : "+findIndex(a, num));
		System.out.println("occurence of element : "+occurence(a, num));
		
	}
	public static int findIndex(int[] a,int num) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==num)
				return i;
		}
		return -1;
	}
	public static int occurence(int[] a,int num) {
		int count =0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==num)
				count++;
		}
		return count;
		
	}
}
