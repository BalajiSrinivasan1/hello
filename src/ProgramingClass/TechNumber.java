package ProgramingClass;

import java.util.Scanner;

public class TechNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("emter the number");
		int n=2025;
		int count=0,g=n,sum=0;
		while(n!=0) {
			n=n/10;
			count++;
			
		}
		if(count%2==0) {
			count=count/2;
			n=g;
			int rem=1;
			for(int i=1;i<=count;i++) {
				rem=rem*10;
				
			}
			
			//for(int i=1;i<=count;i++) {
			//int d=n%rem;
			//System.out.println(d);
			//sum+=d;
			//sum=sum+d;
			//n=n/rem;
			
			//}
			
			int d=n%rem;
			sum=sum+d;
			System.out.println(d);
			n=n/rem;
			sum=sum+n;
			System.out.println(sum);
			System.out.println(n);
			
			int pow=sum*sum;
			if(g==pow) {
				System.out.println("it is Tech number");
			}
			else {
				System.out.println("it is not Tech number");
			}
			
		}
		else {
			System.out.println("it is not Tech number");
			
		}

	}

}
