package ArryasProgram;

import java.util.Scanner;

public class averageOfArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new  Scanner(System.in);
		System.out.println("enter the number");
		int size=sc.nextInt();
		int sum=0;
		int a[]=new int[size];
		System.out.println("enter the Arrys value");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
			
		}
		System.out.println("average of array id :"+sum/size);
		

	}

}
