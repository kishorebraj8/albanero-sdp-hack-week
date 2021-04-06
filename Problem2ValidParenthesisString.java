import java.util.Scanner;

public class Problem2ValidParenthesisString {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = input.nextLine();
		// System.out.println(str);
		int n = str.length();
		int temp = 0, depth = 0;
		for (int i = 0; i < n; i++) {
			if (str.charAt(i) == '(') {
				temp++;
				if (temp > depth) {
					depth = temp;
				}
			} else if (str.charAt(i) == ')') {
				if (temp > 0) {
					temp--;
				} else {
					System.out.println("Not VPS");
					System.exit(1);
				}
			}
		}
		if (temp != 0) {
			System.out.println("Not VPS");
			System.exit(1);

		}
		System.out.println(depth);

	}

}
