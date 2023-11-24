package ProgramingClass;

import java.util.Scanner;

public class buzzNumberRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the strting range");
		int s=sc.nextInt();
		System.out.println("enter the end Range");
		int e=sc.nextInt();
		for(int i=s;i<=e;i++) {
			if(i%7==0 || i%10==7) {
				System.out.println(i);
			}
			
		}

	}

}
