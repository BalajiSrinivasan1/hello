package ArryasProgram;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int a[]=new int[size];
		int b[]=new int[size];
		System.out.println("enter the value");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
			
		}
		int temp=0;
		for(int i=a.length-1;i>=0;i--) {
			b[temp++]=a[i];
		}
		System.out.println("reverse Array");
		for(int t:b) {
			System.out.print(t+" ");
		}

	}

}
