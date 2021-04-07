import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Problem1d2FindReplace {

	public static List<String> match(String[] dictionary, String pattern) {

		String hash = getHash(pattern);
		List<String> matchedWord = new ArrayList<>();

		for (String word : dictionary) {
			if (pattern.length() == word.length() && hash.equals(getHash(word))) {
				matchedWord.add(word);
			}
		}
		return matchedWord;
	}
	public static String getHash(String str) {
		Map<Character, Integer> map = new HashMap<>();
		StringBuffer sb = new StringBuffer();

		int index = 0;
		for (char c : str.toCharArray()) {

			if (!map.containsKey(c)) {
				map.put(c, index++);
			}
			sb.append(map.get(c));
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of elements in array-");
		int p = input.nextInt();
		String[] str = new String[p];
		for (int i = 0; i < p; i++) {
			str[i] = input.next();
		}
		System.out.println("Enter the pattern : ");
		String s = input.next();
		System.out.println("Matches:" + match(str, s));

	}

}
