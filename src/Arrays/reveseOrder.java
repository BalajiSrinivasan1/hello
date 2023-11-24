package Arrays;

import java.util.Iterator;
import java.util.Scanner;

public class reveseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size");
		int size=s.nextInt();
		int ar[]=new int[size];
		System.out.println("enter the number");
		for (int i = 0; i < ar.length; i++) {
			ar[i]=s.nextInt();
			
		}
		System.out.println("reverse order");
		for (int i =ar.length-1; i>=0; i--) {
			System.out.println(ar[i]);
			
		}

	}

}
