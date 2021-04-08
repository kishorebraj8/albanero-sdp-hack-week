import java.util.Scanner;

public class Problem28d3 {
	public static void main(String[] args) {
		System.out.println("Enter the 7 bit Parity: ");
		Scanner input = new Scanner(System.in);
		int par = input.nextInt();
		int p;
		int[] arr = new int[9];
		int i = 6;

		while (par != 0) {
			p = par % 10;
			arr[i] = p;
			i--;
			par = par / 10;
		}
		int flag = 0;
		for (int j = 0; j < 7; j++) {
			if (arr[j] == 1) {
				flag++;
			}
		}
		if (flag % 2 != 0) {
			arr[7] = 1;
		} else {
			arr[7] = 0;
		}
		for (int k = 0; k < 8; k++) {
			System.out.printf("%d", arr[k]);
		}

	}

}
