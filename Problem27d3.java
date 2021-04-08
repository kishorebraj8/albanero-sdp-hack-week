import java.util.Scanner;

public class Problem27d3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the num value: ");
		int num = input.nextInt();
		System.out.println("Enter the length value: ");
		int len = input.nextInt();
		int[] arr = new int[len + 1];
		int q = 0;

		for (int i = 1; i <= len; i++) {
			q = num * i;
			arr[i - 1] = q;

		}
		for (int i = 0; i < len; i++)
			System.out.printf("%d ", arr[i]);
	}

}
