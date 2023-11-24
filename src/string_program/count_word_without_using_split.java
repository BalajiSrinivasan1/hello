package string_program;

import java.util.Arrays;

public class count_word_without_using_split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=" java is a programing  language";
		int count=0;
		
		for(int i=0;i<s.length();i++) {
			if(i==0&&s.charAt(i)!=' '||s.charAt(i)!=' '&&s.charAt(i-1)==' ') {
				count++;
			}
		}
		System.out.println(count);
		
	

	}

}
