package ProgramingClass;

import java.util.Scanner;

public class primeNumberBetweenRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the start range");
		int s=sc.nextInt();
		System.out.println("enter the end range");
		int e=sc.nextInt();
		for(int i=s;i<=e;i++) {
			int c=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					c++;
				}
				
			}
			if(c==2) {
				System.out.println(i);
			}
		}

	}

}
