package PattersProgram;

public class printA{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=5,n2=7;
		for(int i=1;i<=n2;i++) {
			
			for(int j=1;j<=n1;j++) {
				if((i==1&&j>=2&&j<n1&&j>1)||(j==1&&i>=2&&i<=n2)||j==n1&&i>=2&&i<=n2||i==4){
					System.out.print("* ");
					
					
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
