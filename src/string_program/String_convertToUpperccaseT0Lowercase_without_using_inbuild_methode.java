package string_program;

public class String_convertToUpperccaseT0Lowercase_without_using_inbuild_methode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="BalAJI";
		String res="";
		
	for(int i=0;i<str.length();i++) {
		int n=str.charAt(i);
		if(n>=65&&n<=90) {
		char c=(char)(n+32);
		res=res+c;
		
		}else {
			res=res+str.charAt(i);
		}
		
	}
	System.out.println(res);

	}

}
