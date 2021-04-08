import java.util.Scanner;

public class Problem24d3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int n = input.nextInt();
		System.out.println("Enter the number of columns : ");

		int m = input.nextInt();
		System.out.println("Enter the elements: ");
		int[][] array = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				array[i][j] = input.nextInt();
			}
			System.out.println(" ");
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (array[i][j] == 1) {
					array[i][j] = 0;
				} else {
					array[i][j] = 1;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%d ", array[i][j]);
			}
			System.out.println(" ");
		}
	}

}
