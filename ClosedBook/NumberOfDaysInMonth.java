package ClosedBook;

import java.util.Scanner;

public class NumberOfDaysInMonth {
	public static void main(String[] args) {
		Scanner scn  = new Scanner(System.in);
		System.out.println("Enter  \n1.Jan\n2.feb"
				+ "\n3.mar"
				+ "\n4.apr"
				+ "\n5.may"
				+ "\n6.jun"
				+ "\n7.jul"
				+ "\n8.aug"
				+ "\n9.sept"
				+ "\n10.oct"
				+ "\n11.nov"
				+ "\n12.dec"
				+ "to find days in the month");
		int num = scn.nextInt();
		System.out.println(numberOfDayInMonth(num));
		scn.close();
		
	}
	public static boolean leapYear() {
		Scanner scn  = new Scanner(System.in);
		System.out.println("enter the year to find days in feb");
		int num = scn.nextInt();
		scn.close();
		if(num%4==0) {
			
			return true;
		}
		
		return false;
	}
	public static int numberOfDayInMonth(int month) {
		switch(month) {
		case 1:return 31;
		case 2:return leapYear()?29:28 ;
		case 3:return 31;
		case 4:return 30;
		case 5:return 31;
		case 6:return 30;
		case 7:return 31;
		case 8 :return 31;
		case 9 :return 30;
		case 10:return 31;
		case 11:return 30;
		case 12:return 31;
		}
		return 0;
	}
	
}
