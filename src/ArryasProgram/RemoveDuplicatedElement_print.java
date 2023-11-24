package ArryasProgram;

import java.util.Arrays;

public class RemoveDuplicatedElement_print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,2,2,3,4,4,2,1,2};
Arrays.sort(a);
System.out.println(Arrays.toString(a));
		
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=i;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
				}
			}
			
			if(count==1) {
				System.out.println(a[i]);
			}
		}


	}

}
