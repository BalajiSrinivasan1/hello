package string_program;

public class reverse_String_without_Using_split_methode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="good morning pepole";
		s+=" "; 
		String rev="";
		String str="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch!=' ') {
				str+=ch;
			}else {
				for(int j=str.length()-1;j>=0;j--) {
					rev+=str.charAt(j);
				}
				rev+=" ";
				str="";
			}
			
		}
		System.out.println(rev);

	}

}
