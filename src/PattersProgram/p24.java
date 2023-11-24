package PattersProgram;

public class p24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		for(int i=1;i<n*2;i++) {
			for(int j=1;j<n*2;j++) {
				if(i>=j&&i+j<=n+3||i+j>=n+3&&i<=j) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
