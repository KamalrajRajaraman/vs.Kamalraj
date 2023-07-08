package ClosedBook;

public class NumberToWords {
	public static void main(String[] args) {
		System.out.println(numberToWords(123));
	}
	
	
	public static  String numberToWords(int num) {
		String result="";
		while(num>0) {
			int temp = num%10;
			result = getWords(temp)+" "+result;
			num=num/10;
		}
		return result;
		
	}
	public static String getWords(int num) {
		switch(num) {
		case 0:return "zero";
		case 1:return "one";
		case 2:return "two";
		case 3:return "third";
		case 4:return "four";
		case 5:return "five";
		case 6:return "six";
		case 7:return "seven";
		case 8 :return "eight";
		case 9 :return "nine";
		}
		return "not found";

	}
	
}
