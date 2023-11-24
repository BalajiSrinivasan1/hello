package PattersProgram;

public class printName {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int n1=5,n2=7;
		for(int i=1;i<=n2;i++) {
			for(int j=1;j<=n1;j++) {
				if(i==1&&j<=4||j==1||i==7&&j<=4||j==5&&j>=2&&j<=3||j==5&&i>=2&&i<=3||j==5&&i>=5&&i<=6||i==4&&j<=4){
					System.out.print("* ");
					
					
				}else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			//A
			for(int j=1;j<=n1;j++) {
				if((i==1&&j>=2&&j<n1&&j>1)||(j==1&&i>=2&&i<=n2)||j==n1&&i>=2&&i<=n2||i==4){
					System.out.print("* ");
					
					
				}else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			//L
			
			for(int j=1;j<=n1;j++) {
				if(j==1||i==7){
					System.out.print("* ");
					
					
				}else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			//A
			for(int j=1;j<=n1;j++) {
				if((i==1&&j>=2&&j<n1&&j>1)||(j==1&&i>=2&&i<=n2)||j==n1&&i>=2&&i<=n2||i==4){
					System.out.print("* ");
					
					
				}else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			//J
			for(int j=1;j<=n1;j++) {
				if(i==1||j==3&&i<=6||i==7&&j<=2){
					System.out.print("* ");
					
					
				}else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			//I
			
			for(int j=1;j<=n1;j++) {
				if(i==1||j==3||i==7){
					System.out.print("* ");
					
					
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
			Thread.sleep(3000);
		}

	}

}
