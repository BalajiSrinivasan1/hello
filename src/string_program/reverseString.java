package string_program;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="balaji";
		String res="";
		for(int i=str.length()-1;i>=0;i--) {
			res=res+str.charAt(i);
		}
		System.out.println(res);

	}

}
