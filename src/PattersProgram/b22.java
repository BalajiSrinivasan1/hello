package PattersProgram;

public class b22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		char ch='A';
		for(int i=1;i<2*n;i++) {
			
			for(int j=1;j<2*n;j++) {
				if(i==j||i+j==n+n) {
					System.out.print(ch+" ");
					
				}else {
					System.out.print("  ");
				}
				
				
			}
			
			if(i<n) {
				ch++;
			}else {
				ch--;
			}
			System.out.println();
			
			
		}

	}

}
