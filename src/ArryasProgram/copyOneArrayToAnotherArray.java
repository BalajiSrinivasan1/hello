package ArryasProgram;

import java.util.Arrays;
import java.util.Scanner;

public class copyOneArrayToAnotherArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Array size");
		int size=sc.nextInt();
		int a[]=new int [size];
		System.out.println("enter the array element");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int b[]=new int [size];
		for(int i=0;i<size;i++) {
			b[i]=a[i];
		
		}
		System.out.println("copy  array ");
		for(int i=0;i<size;i++) {
			System.out.println(b[i]);
		}
	
		

	}

}
