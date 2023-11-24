package javaObject;

import java.util.Scanner;

public class gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the first number ");
		int num1=s.nextInt();
		System.out.println("ener the second number");
		int num2=s.nextInt();
		int gcd=0;
		for(int i=1;i<=num1;i++) {
			if(num1%i==0&&num2%i==0) {
				gcd=i;
			}
		}
		System.out.println("comman factor is "+gcd);

	}

}
