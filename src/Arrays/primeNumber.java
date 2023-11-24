package Arrays;

public class primeNumber {
	static int[] num;

	public static void main(String[] args) {

		num = new int[50];
		for (int i = 0; i < num.length; i++) {
			num[i] = i + 1;
			int count = 0;
			for (int j = 1; j <= num[i]; j++) {
				if (num[i] % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println(num[i]);

			}
		}

	}

}
