package javaObject;

import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int num=s.nextInt();
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
			
		}
		
		if(count==2) {
			System.out.println("it is prime number");
		}
		else {
			System.out.println("it is not prime number");
		}

	}

}
