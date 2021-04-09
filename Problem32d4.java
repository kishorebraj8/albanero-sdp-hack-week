import java.util.Scanner;

public class Problem32d4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no. of element in array : ");
		int n = s.nextInt();
		if (n < 0) {
			System.err.println("please enter integer input");
			System.exit(1);
		}
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		int flag = 1;
		for (int i = 1; i < n; i++) {
			if (arr[i - 1] != arr[i]) {
				flag++;
			}
		}
		int[] sol = new int[flag];
		sol[0] = arr[0];
		int x = 0;
		for (int i = 1; i < n; i++) {
			if (arr[i - 1] != arr[i]) {
				x++;
				sol[x] = arr[i];
			}
		}

		for (int i = 0; i < flag; i++) {
			System.out.print(" " + sol[i]);
		}

	}

}
