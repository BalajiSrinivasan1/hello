package string_program;

import java.util.Arrays;

public class anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="top",s1="pot";
		if(s.length()!=s1.length()) {
			System.out.println("not a anagram");
		}else {
			char ch[]=s.toCharArray();
			char ch1[]=s1.toCharArray();
			Arrays.sort(ch);
			Arrays.sort(ch1);
			boolean flag=false;
			for(int i=0;i<ch.length;i++) {
				if(ch[i]==ch1[i]) {
					flag=true;
				}else {
					flag=false;
					break;
				}
			}
			if(flag==true) {
				System.out.println("it is an anagram");
			}else {
				System.out.println("it is not anagram");
			}
		}

	}

}
