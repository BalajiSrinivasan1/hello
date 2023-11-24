package ArryasProgram;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new  Scanner(System.in);
		System.out.println("enter the number");
		int size=sc.nextInt();
		int a[]=new int[size];
		int sum=0;
		System.out.println("enter the Arrys value");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println("sum of element");
		System.out.println(sum);


	}

}
