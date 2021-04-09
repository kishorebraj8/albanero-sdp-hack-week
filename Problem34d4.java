import java.util.Scanner;
import java.lang.Math;

public class Problem34d4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter num1: ");
		int a = input.nextInt();
		System.out.println("Enter the num2: ");
		int b = input.nextInt();

		int len = String.valueOf(a).length();
		int len2 = String.valueOf(b).length();

		int i = 0;
		int p = 0;
		int n = 0;
		int[] arr = new int[len];
		int[] arr2 = new int[len2];

		while (a != 0) {
			p = a % 10;
			arr[n] = p;
			n++;
			i = i + p;
			a = a / 10;

		}
		int j = 0;
		int q = 0;
		int m = 0;

		while (b != 0) {
			q = b % 10;
			arr2[m] = q;
			m++;
			j = j + q;
			b = b / 10;

		}

		int diff = 0;
		diff = i - j;
		diff = Math.abs(diff);
		if (len != len2) {
			System.err.println("Both integers will be exactly the same length");
			System.exit(1);
		}
		for (int x = 0; x < len; x++) {
			if (arr[x] > arr2[x]) {
				System.err.println("All digits in num2 have to be higher than their counterparts in num1.");
				System.exit(1);
			}
		}
		System.out.printf("result: %d", diff);
	}

}
