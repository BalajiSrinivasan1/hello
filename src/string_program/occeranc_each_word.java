package string_program;

import java.util.Arrays;

public class occeranc_each_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="     hii java     hii Student Hii pepole";
		String s1[]=s.split(" ");
		System.out.println(Arrays.toString(s1));
		for(int i=0;i<s1.length;i++) {
			int count=1;
			if(s1[i]!="") {
			for(int j=i+1;j<s1.length;j++) {
				if(s1[i].equalsIgnoreCase(s1[j])) {
					count++;
					s1[j]=" ";
				}
			}
			if(count>0&&s1[i]!=" ") {
				System.out.println(s1[i]+"- "+count);
			}
			}
		}

	}

}
