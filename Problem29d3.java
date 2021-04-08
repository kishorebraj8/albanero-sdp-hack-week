import java.util.Scanner;

public class Problem29d3 {
	public static void main(String[] args) {
		System.out.println("Enter the number: ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int p;
		int[] arr = new int[n];
		int i = 0;

		while (n != 0) {
			p = n % 10;
			arr[i] = p * p;
			i++;
			n = n / 10;
		}
		for (int k = i - 1; k >= 0; k--) {
			System.out.printf("%d", arr[k]);
		}

	}

}
