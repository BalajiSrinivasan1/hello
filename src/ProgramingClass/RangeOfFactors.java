package ProgramingClass;

import java.util.Scanner;

public class RangeOfFactors {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.print(i+" factors is :");
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					System.out.print(j+" ");
				}
				
			}
			System.out.println();
		}

	}

}
