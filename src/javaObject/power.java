package javaObject;

import java.util.Scanner;

public class power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the base value");
		int b=s.nextInt();
		System.out.println("enter the power value");
		int p=s.nextInt();
		int mult=1;
		for(int i=1;i<=p;i++) {
			mult=mult*b;
			
		}
		System.out.println(mult);

	}

}
