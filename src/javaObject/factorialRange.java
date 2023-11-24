package javaObject;

import java.util.Scanner;

public class factorialRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the start range");
		int start=s.nextInt();
		System.out.println("enter the end range");
		int end=s.nextInt();
		int fact=1;
		for(int i=start;i<=end;i++) {
			fact=fact*i;
		
			
			
		}
		System.out.println(fact);

	}

}
