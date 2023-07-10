package Recursion;
/**
 * class Recursion contains methods based on recursion
 * @author KAMALRAJ
 *
 */
public class Recursion {
	/**
	 * fact(int x) method is used to find the factorial of a number
	 * @param x
	 * @return
	 */
	public int fact(int x) {
		if(x==0)
			return 1;
		return x*fact(x-1);
	}
	
	/**
	 * int sum varibale is used in  digitSum(num)
	 */
	private int sum;
	/**
	 * digitSum(num) is used to get sum of digit of an number
	 * @param num
	 * @return sum of digit of num which is passsed as args
	 */
	public int digitSum(int num){ 
		if(num==0)
			return 0;
		return sum +num%10+digitSum(num/10);
	 }
	
	/**
	 * int i is used in palindrome(str,length)
	 */
	private int i;
	/**
	 * String rev is used in palindrome(str,length)
	 * 
	 */
	private String rev="";
	/**
	 * palindrome(str,length) is used to find string which is passed is palindrome or not
	 * @param str
	 * @param length
	 * @return
	 */
	public String palindrome(String str,int length) {
		i=length;
		rev=rev+str.charAt(i--);
		if(rev.equals(str))
			return "palindrome";
		if(i>=0)
			return palindrome(str,i);
		return "not palindrome";
		
	} 
	/**
	 * fib(n1,n2,range) is used to print fibanocci series in console
	 * @param n1
	 * @param n2
	 * @param range
	 */
	public void fib(int n1,int n2,int range) {
		int n3=n1+n2;
		System.out.println(n1);
		n1=n2;
		n2=n3;
		range--;
		if(range>0)
			fib(n1,n2,range);
		
	}
}
