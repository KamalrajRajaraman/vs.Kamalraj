package BasicOpenLabBook;

import java.util.Scanner;

public class AreaOfRectangle {
	
	public static double areaOfReactangle(double length,double breath) {
		return  length*breath;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the length of the rectangle");
		double length = scn.nextDouble();
		
		System.out.println("Enter the breath of the rectangle");
		double breath = scn.nextDouble();
		
		double area = areaOfReactangle(length, breath);
		System.out.println("Area of Recatngle = "+area);
		
		scn.close();
	}

}
