import java.util.Scanner;

public class Problem5OutlierNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of elements in array-");
		int n = input.nextInt();
		int[] numbers = new int[n];
		System.out.println("Enter the elements of array-");
		for (int i = 0; i < n; i++) {
			numbers[i] = input.nextInt();

		}

		int count = 0;
		for (int i = 0; i < n; i++) {
			if (numbers[0] % 2 == 0) {
				count++;
			}
		}

		if (count > 1) {
			for (int i = 0; i < n; i++) {
				if (numbers[i] % 2 != 0) {
					System.out.println(numbers[i]);
				}
			}

		} else {
			for (int i = 0; i < n; i++) {
				if (numbers[i] % 2 == 0) {
					System.out.println(numbers[i]);
				}
			}

		}

	}
}
