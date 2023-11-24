package ProgramingClass;

import java.util.Scanner;

public class rangeOfMultificationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the starting range");
		int s=sc.nextInt();
		System.out.println("enter the ending range");
		int e=sc.nextInt();
		for(int i=s;i<=e;i++) {
			
			System.out.println("table of "+i);
			for(int j=1;j<=10;j++) {
				System.out.println(i+"x"+j+"="+i*j);
			}
		}

	}

}
