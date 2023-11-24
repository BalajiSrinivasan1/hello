package ArryasProgram;

import java.util.Scanner;

public class ElementPresent_or_not_using_LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		
		
		System.out.println("enter the Element");
		int ele=sc.nextInt();
		boolean flag=true;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==ele) {
				flag=true;
				System.out.println("element is present at "+i+" index");
				break;
			}else {
				flag=false;
				
			}
		}
		if(flag==false) {
			System.out.println("element is not present in Array");
		}
		
		

	}

}
