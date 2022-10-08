package string.com;

public class String_compareTo {
	public static void main(String[] args) {
		int result;
		String str1="I am Rajshri Bhoyar";
		String str2="I am Rajshri Bhoyar";
		String str3="I am from Gondia";
		
		//compare str1 with str2
		
		result=str1.compareTo(str2);
		System.out.println(result);
		
		//compare str1 with str3
		
		result=str1.compareTo(str3);
		System.out.println(result);
		
		//compare str2 with str3
		
		result=str3.compareTo(str1);
		System.out.println(result);
	}

}
