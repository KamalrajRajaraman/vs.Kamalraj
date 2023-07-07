package BasicArithmeticOperation;

import java.util.Scanner;

public class Prompt {
	protected static Scanner scn = new Scanner(System.in);
	private static  double num1;
	private static  double num2;
	private static BasicArithmeticOperations b1 = new BasicArithmeticOperations();
	public static void setNum() {
		/*setNUM() is used to get the value from user and set two input numbers*/
		System.out.println("Enter the First Number");
		num1 =scn.nextInt() ;
		System.out.println("Enter the Second Number");
		num2 =scn.nextDouble();
	}
	public double add() {
		setNum();
		return b1.addition(num1, num2);
	}
	
	public double sub() {
		setNum();
		return b1.subtraction(num1, num2);
	}
	public double mul() {
		setNum();
		return b1.multiplication(num1, num2);
		
	}
	public double div() {
		System.out.println("Here first Number is divident and Second NUmber is divisor");
		setNum();
		while(num2==0) {
			System.out.println("Divisor Should Not Be Zero,Enter a valid NUmber");
			setNum();
		}
		return b1.division(num1, num2);
	}
	public double power() {
		System.out.println("Here first Number is Base and Second NUmber is Power");
		setNum();
		return b1.powerCalculation(num1, num2);
	}
}
