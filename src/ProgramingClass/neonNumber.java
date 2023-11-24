package ProgramingClass;

import java.util.Scanner;

public class neonNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int sqr=n*n;
		int sum=0;
		while(sqr!=0) {
			int r=sqr%10;
			sum+=r;
			sqr=sqr/10;
		}
		if(sum==n) {
			System.out.println("it is neon number");
		}
		else {
			System.out.println("it is not neon number");
		}

	}

}
