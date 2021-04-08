import java.util.Scanner;

public class Problem25d3 {
	public static void main(String[] args) {
		System.out.println("Enter the string : ");
		Scanner input = new Scanner(System.in);
		String s = input.next();
		s = s.toLowerCase();
		int x = s.length();
		char arr[] = s.toCharArray();

		int flag = 0;
		for (int i = 0; i < x; i++) {
			for (int j = i + 1; j < x; j++) {
				if (arr[i] == arr[j]) {
					flag++;
				}
			}
		}
		if (flag > 0) {
			System.out.println("false");
		} else {
			System.out.println("true");
		}
	}

}
