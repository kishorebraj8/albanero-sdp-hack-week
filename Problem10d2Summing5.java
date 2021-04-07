import java.util.Scanner;

public class Problem10d2Summing5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of elements in array-");
		int n = input.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements of array-");
		for (int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
		}
		int t = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (arr[i] > arr[j]) {
					t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}
			}
		}
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			sum = sum + arr[i];
		}
		System.out.println(sum);
	}

}
