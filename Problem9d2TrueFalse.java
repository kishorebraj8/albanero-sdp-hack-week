import java.util.Scanner;

public class Problem9d2TrueFalse {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of elements in array-");
		int p = input.nextInt();
		int[] arr = new int[p];
		System.out.println("Enter the elements of array-");
		for (int i = 0; i < p; i++) {
			arr[i] = input.nextInt();
		}
		System.out.println("Enter the value of n : ");
		int n = input.nextInt();
		int flag = 0;
		for (int i = 0; i < p; i++) {
			for (int j = i+1; j < p; j++) {

				if (arr[i] + arr[j] == n) {
					flag++;
				}
			}
		}
		if (flag > 0) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

}
