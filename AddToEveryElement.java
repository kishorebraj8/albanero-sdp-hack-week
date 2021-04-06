import java.util.Scanner;

public class AddToEveryElement {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of elements in array-");
		int n = input.nextInt();
		int[] numbers = new int[10];
		System.out.println("Enter the elements of array-");
		for (int i = 0; i < n; i++) {
			numbers[i] = input.nextInt();
		}
		for (int i = 0; i < n; i++)
		{
			numbers[i] = numbers[i]+1;
		}
			
		for (int i = 0; i < n; i++)
		{
			System.out.println(numbers[i]);
		}
	}

}
