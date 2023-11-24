package Arrays;
import java.util.Scanner;
public class evenNumber {
	static int[] num;
	public static void main(String[] args) {
		
		num=new int[50];
		for(int i=0;i<num.length;i++) {
			num[i]=i+1;
		}
		for(int i=0;i<num.length;i++) {
			if (num[i]%2==0)
			{
				System.out.println(num[i]);
			}
		}
	}

}
