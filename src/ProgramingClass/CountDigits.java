package ProgramingClass;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int count = 0;
		
		while(n>0) {
			n=n/10;
			count++;
		}
		System.out.println(count);

	}

}
