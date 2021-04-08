import java.util.Scanner;

public class Problem30d3 {
	public static void main(String[] args) {
		System.out.println("Enter the number: ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int p;
		int[] arr = new int[n];
		int i = 0;

		while (n != 0) {
			p = n % 10;
			arr[i] = p;
			i++;
			n = n / 10;
		}
		int z = 0;
		for (int j = 0; j < i; j++) {
			z = z + arr[j];
		}
		int mean = 0;
		mean = z / i;
		System.out.printf("%d", mean);
	}

}
