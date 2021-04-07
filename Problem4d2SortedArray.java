import java.util.Scanner;

public class Problem4d2SortedArray {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of elements in array-");
		int n = input.nextInt();
		if (n == 0) {
			System.out.println("[]");
		} else if (n > 0) {
			int[] numbers = new int[100];
			System.out.println("Enter the elements of array-");
			for (int i = 0; i < n; i++) {
				numbers[i] = input.nextInt();
			}
			int t = 0;
			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {
					if (numbers[i] > numbers[j]) {
						t = numbers[i];
						numbers[i] = numbers[j];
						numbers[j] = t;
					}
				}
			}
			int i = 0;
			System.out.printf("[");
			while (i < n) {
				if (i < n - 1) {
					System.out.printf("%d, ", numbers[i]);
				} else if (i == n - 1) {

					System.out.printf("%d" + "]", numbers[i]);
				}
				i++;
			}

		} else {
			System.err.println("Number must be positive");
		}
	}

}
