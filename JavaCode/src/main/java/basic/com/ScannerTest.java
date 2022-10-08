package basic.com;

import java.util.Scanner;

public class ScannerTest {
	
	public static void main(String[] args) {
		
		int a,b,c;
		System.out.println("Enter Two Numbers:");
		
		Scanner ss=new Scanner(System.in);
		a=ss.nextInt();
		b=ss.nextInt();
		c=a+b;
		System.out.println("Sum Of Two Number:"+c);
		
	}


}
