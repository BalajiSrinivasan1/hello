package ArryasProgram;

public class print_dupilicteElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,2,2,3,4,4,2,2};
		
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=1+i;j<a.length;j++) {
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
