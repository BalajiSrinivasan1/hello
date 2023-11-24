package ProgramingClass;

import java.util.Scanner;

public class perfectSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int r=0;
		for(int i=1;i<=n;i++) {
			if(i*i==n) {
				r++;
				System.out.println(i+" is the perfect square of "+n);
				break;
			}
			
		}
		if(r==0) {
			System.out.println(n+" thire is no perfect square");
		}

	}

}
