package string_program;

public class occerance_count_RepetedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="apple";
		String s1="";
		
		for(int i=0;i<s.length();i++) {
			int count=1;
			
			if(s1.indexOf(s.charAt(i))==-1) {
			for(int j=i+1;j<s.length();j++) {
				
				if(s.charAt(i)==s.charAt(j)) {
					count++;
					
				}
				}
			System.out.println(s.charAt(i)+"-"+""+count);
			s1=s1+s.charAt(i);
				
				
			}
			
			
		}

	}

}
