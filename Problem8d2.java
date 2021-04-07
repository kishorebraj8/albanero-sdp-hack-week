import java.util.Scanner;

public class Problem8d2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of n : ");
		int n = input.nextInt();
		int[] arr = new int[100];
		int flag = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				flag++;
				arr[flag - 1] = i;
			}
		}

		for (int i = 0; i < flag; i++) {
			System.out.printf("%d ", arr[i]);
		}

	}

}
