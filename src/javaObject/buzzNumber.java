package javaObject;

import java.util.Scanner;

public class buzzNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int num=s.nextInt();
		if(num%7==0||num%10==7) {
			System.out.println("it is the Buzz number");
		}
		else {
			System.out.println("it is not Buzz number");
		}

	}

}
