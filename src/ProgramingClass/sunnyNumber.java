package ProgramingClass;

import java.util.Scanner;

public class sunnyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
	//	int n=sc.nextInt();
		int n=80;
		n=n+1;
		//n++;
		int r=0;
		for(int i=1;i<=n;i++) {
			if(i*i==n) {
				r++;
				System.out.println(--n+" it is sunny number");
				break;
			}
			
		}
		if(r==0) {
			System.out.println(--n+" it not sunny number");
		}
		

	}

}
