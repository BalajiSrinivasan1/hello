package javaObject;

import java.util.Scanner;

public class ReversGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int g=n;
		String num="";
		int num1=0;
		while(n!=0) {
			num+=n%10;
			n=n/10;
		}
		System.out.println(num);
		n=g;
		while(n!=0) {
			int r=n%10;
			num1=num1*10+r;
			n=n/10;
			
		}
		System.out.println(num1);

	}

}
