package ProgramingClass;

import java.util.Scanner;

public class FibonacciSeriesTargetPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the range");
		int rang=sc.nextInt();
		System.out.println("enter the position");
		int p=sc.nextInt();
		int a=0,b=1,c=0;
		int pos=0;
		for(int i=1;i<=rang;i++) {
			if(p==i) {
				pos=a;
			}
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
			
		}
		System.out.println(p+" position value is ="+pos);
		


	}

}
