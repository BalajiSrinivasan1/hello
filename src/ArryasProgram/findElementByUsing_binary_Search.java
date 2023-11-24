package ArryasProgram;

import java.util.Arrays;
import java.util.Scanner;

public class findElementByUsing_binary_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]= {10,3,5,1,30,40};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		int low=0,high=a.length-1;
		boolean flag=false;
		System.out.println("enter the target");
		int target=sc.nextInt();
		int mid=0;
		while(low<=high) {
			mid=(low+high)/2;
			if(a[mid]==target) {
				flag=true;
				System.out.println("Target present in "+mid+" index");
				break;
			}else if(a[mid]>target) {
				high=mid-1;
			}else if(a[mid]<target) {
				low=mid+1;
			}
		}
		if(flag=false) {
			System.out.println("element is not present");
		}
		

	}

}
