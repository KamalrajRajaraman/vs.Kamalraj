package BasicOpenLabBook;

import java.util.Scanner;

public class PrintANumber {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number to be Printed");
		int num = scn.nextInt();
		System.out.println("The number you Entered : "+num);
		scn.close();
	}
}
