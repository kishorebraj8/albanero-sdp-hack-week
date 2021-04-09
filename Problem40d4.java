import java.util.Scanner;

public class Problem40d4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string s: ");
		String str1 = input.next();
		System.out.println("Enter the string t: ");
		String str2 = input.next();
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		int a = str1.length();
		int b = str2.length();
		int[] arr3 = new int[a];

		for (int i = 0; i < a; i++) {
			arr3[i] = b + 1;
			for (int j = 0; j < b; j++) {
				if (arr1[i] == arr2[j]) {
					arr3[i] = j;
					break;
				}
			}
		}

		int flag = 0;
		for (int i = 0; i < a; i++) {
			if (arr3[i] == b + 1) {
				flag++;
			}
			for (int j = i + 1; j < a; j++) {
				if (arr3[j] < arr3[i]) {
					flag++;
				}
			}
		}
		if (flag == 0) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

}
