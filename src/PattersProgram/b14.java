package PattersProgram;

public class b14 {

	public static void main(String[] args) {
		int n=4;
		
//		for(int i=1;i<=n;i++) {
//			int num=i;
//			 int  temp=n-1;
//			for(int j=1;j<=n;j++) {
//				
//			  
//				if(i>=j) {
//					System.out.print(num+" ");
//				}else {
//					System.out.print("  ");
//				}
//				num+=temp;
//				temp--;
//				
//			}
//			System.out.println();
//		}
		
		for(int i=1;i<=n;i++) {
			int num=i;
			
			for(int j=1;i>=j;j++) {
				
				System.out.print(num+" ");
				num=num+n-j;
				
			}
			System.out.println();
		}

	}

}
