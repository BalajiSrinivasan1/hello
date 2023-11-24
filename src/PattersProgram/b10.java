package PattersProgram;

public class b10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		for(int i=1;i<=n*2;i++) {
			for(int j=1;j<n*2;j++) {
				if(i==j||i+j==n+n) {
					System.out.print(i+" ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}


	}

}
