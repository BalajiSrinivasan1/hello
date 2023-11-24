package ProgramingClass;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner s=new Scanner(System.in);
     System.out.println("enter the number");
     //int num=s.nextInt();	
     int num=132;
     int sum=0,mult=1;
     while(num>0) {
    	 //sum+=num%10;
    	 sum=sum+num%10;
    	 mult=mult*num%10;
    	 num=num/10;
     }
     if(sum==mult) {
    	 System.out.println("it is spy number");
     }
     else {
    	 System.out.println("it is not spy number");
     }
	}

}
