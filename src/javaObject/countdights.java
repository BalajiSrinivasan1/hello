package javaObject;

import java.util.Scanner;

public class countdights {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		int sum=0;
		int count=0;
		while(n!=0) {
			count++;
			n=n/10;
		}
		System.out.println("count of digit is "+count);
		System.out.println("enter the number");
		n=s.nextInt();
		while(n!=0)
		{
			sum+=n%10;
				
			n=n/10;
		}
			System.out.println(sum);

	}

}
