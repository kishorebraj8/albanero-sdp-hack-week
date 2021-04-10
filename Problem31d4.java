import java.util.Scanner;

public class Problem31d4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int m = sc.nextInt();
		int arr[][] = new int[m][];
		for (int i = 0; i < m; i++) {
			System.out.printf("Enter the length of %d sub-array: ", i);
			int n = sc.nextInt();

			arr[i] = new int[n];
		}

		for (int i = 0; i < arr.length; i++)
			for (int j = 0; j < arr[i].length; j++)
				arr[i][j] = sc.nextInt();

		System.out.println("Element inserted: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++)
				System.out.print(arr[i][j] + " ");
			System.out.println();

		}
		int max = 0;
		int[] brr = new int[m];
		int x = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (j == 0) {
					max = arr[i][j];
					brr[x] = max;
				} else {
					if (arr[i][j] > arr[i][j - 1]) {
						if (arr[i][j] > max) {
							max = arr[i][j];
							brr[x] = max;

						}
					}
				}

			}
			x++;
		}
		for (int i = 0; i < m; i++) {
			System.out.print(brr[i] + " ");
		}

	}

}
