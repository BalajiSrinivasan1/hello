package javaObject;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int num=s.nextInt();
		int fact=1;
		for(int i=num;i>=1;i--) {
			fact=fact*i;
			
			
			
		}
		System.out.println(fact);
		

	}

}
