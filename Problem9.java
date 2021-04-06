import java.util.Scanner;

public class Problem9 {

	static int maxProfit(int price[], int start, int end) {
		if (end <= start)
			return 0;
		int profit = 0;
		for (int i = start; i < end; i++) {
			for (int j = i + 1; j <= end; j++) {
				if (price[j] > price[i]) {
					int curr_profit = price[j] - price[i] + maxProfit(price, start, i - 1)
							+ maxProfit(price, j + 1, end);
					profit = Math.max(profit, curr_profit);
				}
			}
		}
		return profit;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of elements in array-");
		int n = input.nextInt();
		int[] price = new int[n];
		System.out.println("Enter the elements of array-");
		for (int i = 0; i < n; i++) {
			price[i] = input.nextInt();

		}
		System.out.print(maxProfit(price, 0, n - 1));

	}
}
