package ArryasProgram;

import java.util.Scanner;

public class findSmalestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int a[]=new int[size];
	
		System.out.println("enter the element");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int min=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("smalest element is : "+min);

	}

}
