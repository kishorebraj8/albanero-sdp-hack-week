import java.util.Scanner;

public class Problem3ArraySum {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of elements in array-");
		int n = input.nextInt();
		int[] numbers = new int[10];
		System.out.println("Enter the elements of array-");
		for (int i = 0; i < n; i++) {
			numbers[i] = input.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum = sum + numbers[i];
		}
		if(sum%2==0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}

	}
}
