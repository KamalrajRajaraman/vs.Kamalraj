package BasicOpenLabBook;

import java.util.Scanner;

public class Vowel {
	static String  isVowel(char ch) {
		if(ch=='a'|ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'|ch=='U')
			return "Vowels";
		return "Consonant";
			
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a Character to check it is Vowel");
		char ch = scn.next().charAt(0);
		String result = isVowel(ch);
		System.out.println(ch+" is "+result);
		scn.close();
	}
}