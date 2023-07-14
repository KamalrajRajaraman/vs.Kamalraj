package StringHandling;

public class StringHandling {
	public static void main(String[] args) {
		String str ="Kamal";
		
		String str2 ="raj";
		System.out.println("String str length : "+str.length());
		System.out.println("String str2 length : "+str2.length());
		String str3 = str.concat(str2);
		System.out.println("Concatenated String : "+str3);
		String str4 =str.substring(1,3);
		System.out.println(str4);
		if(str3.contains(str)) {
			str3= str3.replace(str, str.toUpperCase());
		}
		System.out.println(str3);
		
		String str5 ="Kamal";
		System.out.println(str.equals(str5));
		System.out.println(str.compareTo(str5));
		
	}
}
