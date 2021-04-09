import java.util.Scanner;

public class Problem36d4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of stairs: ");
		int n = input.nextInt();
		if (n < 3) {
			System.out.println(n);
		} else {
			int first = 1;
			int second = 2;
			int current = 0;
			for (int i = 2; i < n; i++) {
				current = first + second;
				first = second;
				second = current;
			}

			System.out.printf("%d", current);
		}
	}

}
