package BasicArithmeticOperation;

import java.util.Scanner;

public class MainOfAritmeticOperation {
	private  static double value;
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Prompt p1 = new Prompt();
		System.out.println("Choose the Basic Operation that you like to perform"
				+ "\n1-Addition\n2-Subtraction\n3-Multiplication\n4-Division\n5-Power Calculation");
		int choice = scn.nextInt();
		//Based on the Choice ,Arithmetic Operation is Selected
		switch(choice){
				case 1:
					value = p1.add();
					System.out.println("Addition Ans = "+value);	
					break;
				
				case 2:
					value = p1.sub();
					System.out.println("Subtraction Ans = "+value);
					break;
				
				case 3:
					value = p1.mul();
					System.out.println("Multiplication Ans = "+value);
					break;
				
				case 4: 
					value = p1.div();
					System.out.println("Division Ans = "+value);
					break;
				
				case 5 :
					value = p1.power();
					System.out.println("PowerCaculation Ans = "+value);
					break;
		
		}
		scn.close();
	}
}
