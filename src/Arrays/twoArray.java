package Arrays;
import java.util.Scanner;
public class twoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int[][] ref=new int[3][4];
		for(int i=0;i<ref.length;i++) {
			System.out.println("enter the element in row "+(i+1));
			for(int j=0;j<ref[i].length;j++) {
				ref[i][j]=s.nextInt();
				
			}
		}
		for(int i=0;i<ref.length;i++) {
			for(int j=0;j<ref[i].length;j++) {
				System.out.print(ref[i][j]+" ");
			}
			System.out.println();
		}

	}

}
