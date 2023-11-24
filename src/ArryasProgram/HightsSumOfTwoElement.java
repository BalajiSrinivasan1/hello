package ArryasProgram;

import java.util.Scanner;

public class HightsSumOfTwoElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("enter the size");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter the element");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(sum<a[i]+a[j]) {
					sum=a[i]+a[j];
				}
			}
			
		}
		System.out.println("highest sum of two element is "+sum);

	}

}
