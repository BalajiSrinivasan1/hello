package ArryasProgram;

import java.util.Scanner;

public class findGivenElementPolindromorNot {

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
		int count=0;
		for(int i=0;i<a.length;i++) {
			int temp=a[i];
			int rev=0;
			while(temp>0) {
				int d=temp%10;
				temp=temp/10;
				rev=rev*10+d;
				
			}
			if(a[i]==rev) {
				count=1;
				System.out.println(rev);
			}
		}
		if(count==0) {
			System.out.println("palindrom is not present");
		}

	}

}
