package BasicOpenLabBook;

import java.util.Scanner;

public class AreaOfCircle {
	public static double areaOfCircle(double radius) {
		return (22/7)*radius*radius;
	}
	public static double circumference(double radius) {
		return 2*(22/7)*radius;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the radius of the Circle");
		double radius = scn.nextDouble();
		double area = areaOfCircle(radius);
		System.out.println("Area of Circle = "+area);
		double circumference = circumference(radius);
		System.out.println("circumference of circle = " + circumference);
		scn.close();
	}
}
