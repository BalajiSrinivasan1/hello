package string_program;

public class converTo_lowerCaseToUpperCase_without_using_Inbuild_Methode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="balaJI";
		String res="";
		
	for(int i=0;i<str.length();i++) {
		int n=str.charAt(i);
		if(n>=97&&n<=122) {
		char c=(char)(n-32);
		res=res+c;
		
		}else {
			res=res+str.charAt(i);
		}
		
	}
	System.out.println(res);


	}

}
