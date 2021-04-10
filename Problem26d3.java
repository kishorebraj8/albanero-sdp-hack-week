import java.util.Scanner;

public class Problem26d3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = input.nextInt();
		if (n < 0) {
			System.out.println("false");
		} else {
			int p;
			int[] arr = new int[100];
			int i = 0;

			while (n != 0) {
				p = n % 10;
				arr[i] = p;
				i++;
				n = n / 10;
			}
			int flag = 0;
			for (int j = 0; j < i; j++) {
				for (int k = j + 1; k < i; k++) {
					if (arr[j] == arr[k]) {
						flag++;
					}

				}
			}
			if (flag == 1) {
				System.out.println("true");

			} else {
				System.out.println("false");
			}
		}
	}
}
