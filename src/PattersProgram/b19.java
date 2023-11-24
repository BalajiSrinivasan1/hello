package PattersProgram;

public class b19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n=4;
	        
			for(int i=1;i<=n;i++) {
				 char ch='A';
				for(int j=1;j<=n;j++) {
					if(i%2==0) {
					System.out.print(j+" ");
					
					
					}else {
						System.out.print(ch+" ");
						ch++;
					}
					
					
				}
				
				
				System.out.println();
			}

	}

}
