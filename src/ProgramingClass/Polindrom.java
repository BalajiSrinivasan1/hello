package ProgramingClass;

import java.util.Scanner;

public class Polindrom {

	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the number");
       int n=sc.nextInt();
       int rev=0,g=n;
       while(n!=0) {
    	   int d=n%10;
    	   rev=rev*10+d;
    	   n=n/10;
       }
      
       if(rev==g) {
    	   System.out.println(rev);
    	   System.out.println("it is polindrome number");
       }
       else {
    	   System.out.println("it is not polindrom number");
       }
	}

}
