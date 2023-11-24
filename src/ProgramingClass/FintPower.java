package ProgramingClass;

import java.util.Scanner;

public class FintPower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the base value");
		int n=sc.nextInt();
		System.out.println("enter the power value");
		int m=sc.nextInt();
		int mult=1;
		for(int i=1;i<=m;i++) {
			mult=mult*n;
		}
		System.out.println(mult);

	}

}
