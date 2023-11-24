package ProgramingClass;

import java.util.Scanner;

public class FactorialGivenRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        System.out.println("Enter the start and end of the range: ");

	        int start = sc.nextInt();
	        int end = sc.nextInt();

	        System.out.println("The factorials of the numbers in the given range are:");

	        for (int i = start; i <= end; i++) {
	            System.out.println(i + "! = " + factorial(i));
	        }

	    }

	    private static long factorial(int n) {
	        if (n == 0) {
	            return 1;
	        } else {
	            return n * factorial(n - 1);
	        }

	}

}
