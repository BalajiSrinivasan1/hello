package string_program;

public class reverseString_each_word_with_using_split{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="good morning pepoles";
		String s1[]=s.split(" ");
		String res="";
		for(int i=0;i<s1.length;i++) {
			String temp=s1[i];
			for(int j=temp.length()-1;j>=0;j--) {
				res+=temp.charAt(j);
			}
			res+=" ";
		}
		System.out.println(res);
		
	}

}
