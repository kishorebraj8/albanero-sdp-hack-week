import java.util.Scanner;

public class Problem7d2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int n = input.nextInt();
		System.out.println("Enter the number of columns : ");

		int m = input.nextInt();
		System.out.println("Enter the elements : ");
		int[][] array = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				array[i][j] = input.nextInt();
			}
		}
		int sum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (array[i][j] % 2 == 0) {
					sum = sum + array[i][j];
				}
			}
		}
		System.out.println(sum);

	}

}
