package ProgramingClass;

import java.util.Scanner;

public class FirstDigit_Even_or_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int temp=0;
		while(n!=0) {
			temp=n%10;
			n=n/10;
			
		}
		if(temp%2==0) {
			System.out.println(temp+" is even number");
		}
		else {
			System.out.println(temp+" is odd number");
		}

	}

}
