package BasicOpenLabBook;

import java.util.Scanner;

public class AreaOfSquare {
	public static double areaOfSquare(double side) {
		return side*side;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the side Square");
		double side = scn.nextDouble();
		double area = areaOfSquare(side);
		System.out.println("Area of Square = "  + area );
		scn.close();
	}
}
