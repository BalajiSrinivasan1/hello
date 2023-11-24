package ProgramingClass;

import java.util.Scanner;

public class buzzNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		if(n%7==0 || n%10==7) {
			System.out.println("it is Buzz Number");
		}
		else {
			System.out.println("it is not Buzz Number");
		}
		

	}

}
