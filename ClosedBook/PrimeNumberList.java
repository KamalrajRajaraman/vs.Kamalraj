package ClosedBook;



public class PrimeNumberList {
	public static void main(String[] args) {
		int num1 = 1;
		int num2 =100;
		printPimeBetween(num1, num2);
	}
	
	public static void printPimeBetween(int num1,int num2) {
		for(int i =num1;i<=num2;i++) {
			int a =1;
			int count=0;
			while(a<=i/2) {
				if(i%a==0)
					count++;
				a++;
			}
			if(count==1)
				System.out.println(i);
		}
	}
	
}
