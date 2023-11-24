package PattersProgram;

public class print_S {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=5,n2=7;
		for(int i=1;i<=n2;i++) {
			for(int j=1;j<=n1;j++) {
				if((i==1&&j>=2)||(j==1&&i>=2&&i<=3)||(i==4&&j>=2&&j<=4)||(j==5&&i>=5&&i<=6)||(i==7&&j<=4)){
					System.out.print("* ");
					
					
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}


	}

}
