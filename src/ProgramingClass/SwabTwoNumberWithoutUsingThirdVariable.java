package ProgramingClass;

import java.util.Scanner;

public class SwabTwoNumberWithoutUsingThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the two number");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		System.out.println("before the swaping");
		System.out.println(n1);
		System.out.println(n2);
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		System.out.println("after the swaping");
		System.out.println(n1);
		System.out.println(n2);
		

	}

}
