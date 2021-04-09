import java.util.Scanner;

public class Problem39d4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int a = input.nextInt();
		System.out.println("Enter the elements of array: ");
		int[] arr = new int[a];
		for (int i = 0; i < a; i++) {
			arr[i] = input.nextInt();
		}
		int max = 0, e = 0;
		for (int i = 0; i < a; i++) {
			e = e + arr[i];
			if (max < e) {
				max = e;
			}
			if (e < 0) {
				e = 0;
			}
		}
		System.out.println(max);
	}

}
