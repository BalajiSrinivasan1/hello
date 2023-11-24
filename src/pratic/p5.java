package pratic;

public class p5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		int num=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<n*2;j++) {
				if(i==j||i+j==n+1) {
					System.out.print(num+" ");
						
				}else {
					System.out.print("  ");
				}
			}
			if(i<(n/2)+1)
				num++;
			else
				num--;
			System.out.println();
		}


	}

}
