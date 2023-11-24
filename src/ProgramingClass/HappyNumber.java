package ProgramingClass;

import java.util.Scanner;

public class HappyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		
		while(true) {
			int sum=0;
		while(n>0) {
			int d=n%10;
			sum+=d*d;
			n=n/10;
			
		}
		n=sum;
		if(sum==1) {
			System.out.println("it is Happy number");
			break;
			
		}else if(sum==4) {
			//System.out.println(sum);
			System.out.println("sad Number");
			break;
		}
		}

	}
	

}
