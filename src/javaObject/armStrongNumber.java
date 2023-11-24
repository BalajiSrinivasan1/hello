package javaObject;

import java.util.Scanner;

public class armStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int num=s.nextInt();
		int count=0;
		int sum=0;
		int temp=num;
		
		while(num!=0) {
			num=num/10;
			count++;
		}
		num=temp;
		while(num!=0) {
			int mult=1;
			int d=num%10;
			num=num/10;
			for(int i=1;i<=count;i++) {
				mult=mult*d;
			}
			sum+=mult;
			
		}
		
		if(temp==sum) {
			System.out.println("it is arm strong number");
		}
		else {
			System.out.println("it is not arm strong number");
		}
		
		

	}

}
