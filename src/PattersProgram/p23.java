package PattersProgram;

public class p23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		for(int i=1;i<n*2;i++) {
			for(int j=1;j<=n;j++) {
				if(j==n||i+j==n+1||i-j==n-1) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
	}

}
