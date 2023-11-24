package javaObject;

import java.util.Scanner;

public class newone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s=new Scanner(System.in);
       System.out.println("enter the starting range");
       int start=s.nextInt();
       System.out.println("enter the end range");
       int end=s.nextInt();
       int count=0;
       for(int i=start;i<=end;i++) {
    	   if(i%2==0) {
    		   count++;
    		  
    	   }
       }
       System.out.print("number of even number :");
       System.out.println(count);
	}

}
