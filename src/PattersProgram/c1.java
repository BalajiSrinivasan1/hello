package PattersProgram;

public class c1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		char ch='A';
		for(int i=1;i<=n;i++){
			for(int j=1;j<n*2;j++) {
				if(i+j>=n+1&&j-i<n) {
					System.out.print(ch+" ");
				}else {
					System.out.print("  ");
				}
			}
			ch++;
			System.out.println();
		}

	}

}
