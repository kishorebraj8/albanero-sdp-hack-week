import java.util.Scanner;

public class Problem6d2 {
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
			int count = 0;
			int sum = 0;
			for (int i = 0; i < n; i++) {
				if (numbers[i] > 0) {
					count++;
				} else {
					sum = sum + numbers[i];
				}
			}
			System.out.printf("[%d, %d]", count, sum);
		} else {
			System.err.println("Number must be positive");
		}
	}

}
