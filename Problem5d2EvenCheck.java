import java.util.Scanner;

public class Problem5d2EvenCheck {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of elements in array-");
		int n = input.nextInt();
		int[] numbers = new int[100];
		System.out.println("Enter the elements of array-");
		for (int i = 0; i < n; i++) {
			numbers[i] = input.nextInt();
		}
		System.out.printf("[");
		for (int i = 0; i < n; i++) {
			if (numbers[i] % 2 == 0) {
				if (i < n - 1) {
					System.out.printf("%d, ", numbers[i]);
				} else if (i == n - 1) {
					System.out.printf("%d" + "]", numbers[i]);
				}
			}
		}
	}

}
