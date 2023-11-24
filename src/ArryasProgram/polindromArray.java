package ArryasProgram;

import java.util.Scanner;

public class polindromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter the value");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
			
		}
		int temp=0,temp1=a.length-1,t=0,count=0;
		while(t<a.length) {
			t++;
			if(a[temp]==a[temp1]) {
				count++;
			}
			temp++;
			temp1--;
		}
		if(count==a.length) {
			System.out.println("it is polindrom");
		}else {
			System.out.println("it is not polindrom");
		}
	}

}
