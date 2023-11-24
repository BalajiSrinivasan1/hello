package PattersProgram;

public class c5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int n=4;
		
		for(int i=1;i<=n;i++){
			int ch=64+i;
			for(int j=1;j<=n;j++) {
				
					System.out.print((char)ch+" ");
					ch=ch+n;
				}
				
				System.out.println();
			}

		}

	}


