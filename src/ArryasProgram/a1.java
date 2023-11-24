package ArryasProgram;

import java.util.Scanner;

public class a1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new  Scanner(System.in);
		System.out.println("enter the number");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter the Arrys value");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("displaying Array element");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}

	}

}
