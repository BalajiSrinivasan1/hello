package ProgramingClass;

import java.util.Scanner;

public class gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		int n1=sc.nextInt();
		System.out.println("enter the second number");
		int n2=sc.nextInt();
		int g=0;
		for(int i=1;i<=n1;i++) {
			if(n1%i==0 && n2%i==0) {
				g=i;
			}
		}
		System.out.println(g);

	}

}
