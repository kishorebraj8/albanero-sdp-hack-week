import java.util.Scanner;

public class Problem38d4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int a = input.nextInt();
		int[] arr = new int[a];

		System.out.println("Enter the cost of stairs: ");

		for (int k = 0; k < a; k++) {
			arr[k] = input.nextInt();
		}

		int temp = 0;
		if (arr[0] < arr[1]) {
			temp = arr[0];
		} else
			temp = arr[1];

		for (int j = 4; j < a; j++) {
			if (arr[j - 2] < arr[j - 1]) {
				temp = temp + arr[j - 2];
			} else {
				temp = temp + arr[j];
			}

		}
		System.out.println(temp);

	}

}
