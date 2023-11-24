package javaObject;

import java.util.Scanner;

public class primeInRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the start renge");
		int start=s.nextInt();
		System.out.println("enter the end range");
		int end=s.nextInt();
		int count=0;
		for(int i=start;i<=end;i++) {
			int c=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0)
					c++;
			}
			if(c==2)
				count++;
		}
		System.out.println("between range prime count is "+count);
		

	}

}
