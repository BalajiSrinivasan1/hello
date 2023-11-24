package ArryasProgram;

import java.util.Arrays;

public class findSecondLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,1,1,2,2,2,3,3,4,4,4,4,5,5,5,5,5};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		int max=a[0],secmax=0;
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				secmax=max;
				max=a[i];
			}
		else if(a[i]>secmax&&max!=a[i]) {
				secmax=a[i];			
				}
	}
		System.out.println("second max element : "+secmax);

	}

}
