package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class givenLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<String> names=new ArrayList();
		
		int count=0;
		
		while(count!=5) {
			System.out.println("enter the name");
			String n=sc.next();
			names.add(n);
			count++;
			
			
		}
		for(int i=0;i<names.size();i++) {
			String name=names.get(i);
			if(name.length()<=6) {
				System.out.println(name);
			}
			
		}

	}

}
