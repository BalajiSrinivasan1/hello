package ProgramingClass;

import java.util.Scanner;

public class strongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		//int n=sc.nextInt();
		int n=145;
		int g=n;
		int res=0;
		
		while(n>0) {
			int mult=1;
		int	temp=n%10;
			n=n/10;
			for(int i=1;i<=temp;i++) {
				mult=mult*i;
				
			}
			System.out.println(mult);
			
			//res+=mult;
			res=res+mult;
			
		}
		if(res==g) {
			System.out.println("it is strong number");
		}
		else {
			System.out.println("it is not strong number");
		}
		System.out.println(res);
	}

}
