package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class aList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList ar=new ArrayList();
		System.out.println("enter the name");
		boolean repat=true;
		int count=0;
		while(repat) {
			count++;
			ar.add(sc.next());
			if(count==10) {
				repat=false;
			}
		}
		for(Object o:ar) {
			String str=(String)o;
			if(str.indexOf('v')==-1 && str.indexOf('V')==-1) {
				System.out.println(str);
			}
		}

	}

}
