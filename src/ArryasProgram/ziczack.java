package ArryasProgram;

import java.util.Scanner;

public class ziczack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first Arry size");
		int size1=sc.nextInt();
		int a[]=new int [size1];
		System.out.println("enter the Array element");
		for(int i=0;i<size1;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("enter the second Array size");
		int size2=sc.nextInt();
		int b[]=new int [size2];
		System.out.println("enter the Array element");
		for(int i=0;i<size2;i++){
			b[i]=sc.nextInt();
		}
		int temp=0,temp1=0;
		int c[]=new int [a.length+b.length];
		for(int i=0;i<c.length;i++) {
			if(temp<a.length) {
				c[i++]=a[temp++];
				
			}if(temp1<b.length) {
				c[i]=b[temp1++];
				
			}
		}
		System.out.println("new Array");
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}


	}

}
