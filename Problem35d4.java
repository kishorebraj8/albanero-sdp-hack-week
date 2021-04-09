import java.util.Scanner;

public class Problem35d4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter num1: ");
		int a = input.nextInt();
		System.out.println("Enter the num2: ");
		int b = input.nextInt();
		int i = 0;
		int p = 0;

		while (a != 0) {
			p = a % 10;
			i = i + p;
			a = a / 10;
		}
		int j = 0;
		int q = 0;

		while (b != 0) {
			q = b % 10;
			j = j + q;
			b = b / 10;
		}
		if (i == j) {
			System.out.println(true);
		} else
			System.out.println(false);
	}

}
