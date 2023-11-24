package pratic;

public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		for(int i=1;i<=n;i++) {
			int sum=n+1;
			for(int j=1;j<n*2;j++) {
				if(i+j>n&&j-i<n&&i+j==sum) {
					System.out.print("* ");
					sum+=2;
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
