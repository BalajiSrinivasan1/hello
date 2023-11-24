package PattersProgram;

public class b13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int num;
		for(int i=1;i<=n;i++) {
			num=i;
			for(int j=1;j<=n;j++) {
				System.out.print(num+" ");
				num+=n;
			}				
			System.out.println();
		}
	}

}
