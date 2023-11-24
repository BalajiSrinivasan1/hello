package string_program;

public class count_vowles_consunas_number_specialCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Java@123".toLowerCase();
		int vowleCount=0,conCount=0,numberCount=0,specialCharacter=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='a'&&ch<='z') {
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
					vowleCount++;
				}else {
				conCount++;
				}
			}
			else {
				if(ch>='0'&&ch<='9') {
					numberCount++;
				}
				else {
					specialCharacter++;
				}
				
			}
		}
		System.out.println(vowleCount);
		System.out.println(conCount);
		System.out.println(numberCount);
		System.out.println(specialCharacter);
		

	}

}
