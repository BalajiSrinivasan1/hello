package string_program;

import java.util.Arrays;

public class count_words_Using_split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="java is a programing language";
		String arr[]=s.split(" ");
		System.out.println(Arrays.toString(arr));
		int count=0;
		for(int i=0;i<arr.length;i++) {
			count++;
		}
		System.out.println(count);

	}

}
