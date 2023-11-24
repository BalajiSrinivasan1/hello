package ProgramingClass;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc=new Scanner(System.in);
		//System.out.println("enter the number");
		int n=1634;
		int g=n;
		int count=0;
		int res=0;
		while(n!=0) {
			n=n/10;
			count++;
		}
		n=g;
		while(n!=0) {
			int temp=n%10;
			n=n/10;
			int mult=1;
			for(int i=1;i<=count;i++) {
				mult=mult*temp;
			}//System.out.println(mult);
			res+=mult;
		}
		
		if(res==g) {
			System.out.println("it is amstrong number");
		}
		else {
			System.out.println("it is not amstrong number");
		}
		

	}

}
