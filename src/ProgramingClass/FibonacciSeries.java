package ProgramingClass;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the range");
		int rang=sc.nextInt();
		int a=0,b=1,c=0;
		for(int i=1;i<=rang;i++) {
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}

	}

}
