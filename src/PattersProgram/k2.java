package PattersProgram;

public class k2 {

	public static void main(String[] args) {
		int n=3;
		int m=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				if(i<=j&&i+j<=n+3) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
