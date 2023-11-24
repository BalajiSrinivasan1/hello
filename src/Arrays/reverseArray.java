package Arrays;

public class reverseArray {

	public static void main(String[] args) {
		int num[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println("before reverse");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");

		}
		System.out.println();
		System.out.println("After reverse");
		for (int i = num.length - 1; i >= 0; i--) {
			System.out.print(num[i] + " ");
		}
		
	}

}
