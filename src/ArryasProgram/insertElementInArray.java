package ArryasProgram;

import java.util.Scanner;

public class insertElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]= {1,2,4,5,6};
		System.out.println("enter the insert number");
		for(int t:a) {
			System.out.print(t+" ");
		}
		System.out.println();
		System.out.println("enter the value");
		int ele=sc.nextInt();
		System.out.println("enter the index");
		 int index=sc.nextInt();
		 
		 int b[]=new int[a.length+1];
		 int temp=0;
		 for(int i=0;i<b.length;i++) {
			 if(i==index) {
				 b[i]=ele;
			 }else {
				 b[i]=a[temp++];
			 }
		 }
		 System.out.println("new Array");
		 for(int t:b) {
			 System.out.print(t+" ");
		 }

	}

}
