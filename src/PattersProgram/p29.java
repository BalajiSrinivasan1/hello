package PattersProgram;

public class p29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		for(int i=1;i<=n;i++) {
			int sum=n+1;
			for(int j=1;j<n*2;j++) {
				if(i+j>=n+1&&j-i<=n-1&&i+j==sum){
					System.out.print("* ");
					sum=sum+2;
					
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		

	}

}
