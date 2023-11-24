package PattersProgram;

public class b18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int n=4;
	        
			for(int i=1;i<=n;i++) {
				 char ch='A';
				for(int j=1;j<=n;j++) {
					if(i==1||j==1||i==n||j==n) {
					System.out.print(ch+" ");
					
					}else {
						System.out.print("  ");
					}
					ch++;
					
				}
				
				
				System.out.println();
			}

	}

}
