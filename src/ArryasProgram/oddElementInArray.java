package ArryasProgram;

import java.util.Scanner;

public class oddElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new  Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int a[]=new int[size];
		boolean flag=false;
		System.out.println("enter the Arrys value");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("odd numbers");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
				flag=true;
				System.out.println(a[i]);
			}
		}
		if(flag==false) {
			System.out.println("there is no odd element");
		}

	}

}
