package MatrixArray;

import java.util.Iterator;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		int a[][]=new int [3][3];
		System.out.println("Enter Number:");
		Scanner s = new Scanner(System.in);
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("\n Matrix Element:");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(a[i][j]+" ");
			}System.out.println();
		}
	}

}
