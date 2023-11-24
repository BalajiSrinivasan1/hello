package ProgramingClass;

import java.util.Scanner;

public class FindXylem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int outer=0;
		int inner=0;
		outer=n%10;
		n=n/10;
		while(n>9) {
			//inner+=n%10;
			inner=inner+n%10;
			n=n/10;
		}
		outer+=n;
		if(inner==outer) {
			System.out.println("it is xylem number");
		}
		else {
			System.out.println("it is not xylem number");
		}
		

	}

}
