package ProgramingClass;

import java.util.Scanner;

public class Auto_MorphicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int sqr=n*n;
		
		while(n!=0) {
			if(n%10==sqr%10) {
				sqr=sqr/10;
				n=n/10;
			}
			else {
				break;
			}
		}
		if(n==0) {
			System.out.println("it is Auto morphic Number");
		}else {
			System.out.println("it is not Auto Morphic Number");
		}

	}

}
