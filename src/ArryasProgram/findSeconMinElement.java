package ArryasProgram;

import java.util.Arrays;

public class findSeconMinElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,1,2,3,5,7,8,10};
		Arrays.sort(a);
		int min=a[a.length-1],secmin=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				secmin=min;
				min=a[i];
			}else if(a[i]<secmin&&min!=a[i]) {
				secmin=a[i];
			}
		}
		System.out.println("second min element : "+secmin);

	}

}
