package javaObject;

import java.util.Scanner;

public class buzzNumberRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the start range");
		int start=s.nextInt();
		System.out.println("enter the end range");
		int end=s.nextInt();
		
		for(int i=start;i<=end;i++) {
			if(i%7==0||i%10==7) {
				System.out.println(i);
			}
		
		}
	
	}

}
