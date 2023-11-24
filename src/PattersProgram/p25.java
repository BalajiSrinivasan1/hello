package PattersProgram;

public class p25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		for(int i=1;i<3*2;i++) {
			for(int j=1;j<=n;j++) {
				if(i+j>=n+1||i<=j) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
