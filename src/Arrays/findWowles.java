package Arrays;

public class findWowles {

	public static void main(String[] args) {
		char ch[] = new char[26];
		int c = 65;
		for (int i = 0; i < ch.length; i++) {
			ch[i] = (char) c;
			c++;
			if (ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') {
				System.out.println(ch[i]);
			}
		}

	}

}
