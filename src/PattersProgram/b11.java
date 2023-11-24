package PattersProgram;

public class b11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		int num=1;
		for(int i=1;i<=n*2;i++) {
			for(int j=1;j<n*2;j++) {
				if(i==j||i+j==n*2) {
					System.out.print(num+" ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
			if(i<n) {
				num++;
			}
			else {
				num--;
			}
		}


	}

}
