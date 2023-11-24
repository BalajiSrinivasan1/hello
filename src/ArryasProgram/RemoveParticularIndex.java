package ArryasProgram;

import java.util.Scanner;

public class RemoveParticularIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]= {1,2,4,5,6};
		
		for(int t:a) {
			System.out.print(t+" ");
		}
		System.out.println();
		System.out.println("enter the index");
		 int index=sc.nextInt();
		 
		 int b[]=new int[a.length-1];
		 int temp=0;
		 for(int i=0;i<a.length;i++) {
			 if(i!=index) {
				b[temp++]=a[i];
				
				 
			 }
		 }
		 System.out.println("new Array");
		 for(int t:b) {
			 System.out.print(t+" ");
		 }

	}

}
