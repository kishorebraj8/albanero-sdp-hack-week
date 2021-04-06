import java.util.Scanner;

public class Problem8ArrayMaxSum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of elements in array-");
		int n = input.nextInt();
		int[] numbers = new int[n];
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
		for (int i = 0; i < n; i++) {
			System.out.println(numbers[i]);
		}

		System.out.println("Enter the value of K :");
		int k = input.nextInt();

		for (int i = 0; i < k; i++) {
			if (numbers[i] == 0) {
				break;
			} else {
				numbers[i] = numbers[i] * (-1);
			}
		}

		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum = sum + numbers[i];
		}
		System.out.println(sum);

	}
}
