import java.util.Scanner;

public class Problem33d4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of string: ");
		int a = input.nextInt();
		String[] arr = new String[a];
		String[] soln = new String[a];
		int x = 0;
		for (int i = 0; i < a; i++) {
			arr[i] = input.next();
		}
		for (int i = 0; i < a; i++) {
			x = arr[i].length();
			char[] arr1 = new char[x];
			arr1 = arr[i].toCharArray();
			char[] arr2 = new char[x];
			for (int j = 0; j < x; j++) {
				if (j == 0) {
					arr2[j] = Character.toUpperCase(arr1[j]);
				} else {
					arr2[j] = Character.toLowerCase(arr1[j]);
				}
			}
			String str = new String(arr2);
			soln[i] = str;

		}
		for (int j = 0; j < a; j++) {
			System.out.print(" " + soln[j]);
		}
	}

}
