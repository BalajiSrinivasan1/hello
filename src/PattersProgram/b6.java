package PattersProgram;

public class b6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i%2==0) {
					System.out.print(0+" ");
				}else {
					System.out.print(1+" ");
				}
			}
			System.out.println();
		}

	}

}
