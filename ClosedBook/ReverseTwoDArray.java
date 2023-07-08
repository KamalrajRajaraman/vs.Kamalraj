package ClosedBook;


public class ReverseTwoDArray {
	public static void main(String[] args) {
		int[][] a = {{1,2},{3,4}};
		reverse2DArray(a);
		print2DArray(a);
	
	}
	public static void reverse2DArray(int[][] a) {
		for(int k=0;k<a.length;k++) {
			int i=0;
			int j=a[i].length-1;
			while(i<j) {
				int temp =a[k][i];
				a[k][i]=a[k][j];
				a[k][j]=temp;
				i++;
				j--;
				
			}
		}
		
		
	}
	
	public static void print2DArray(int[][] a) {
		for(int i=0;i<a.length;i++) {
			for(int j = 0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			if(i!=a.length-1)
				System.out.print(",");
		}
	}
	
}
