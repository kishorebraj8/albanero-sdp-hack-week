import java.util.*;

public class Problem21d3 {
	public static void main(String[] args) {
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of elements in the linkedlist : ");
		int x = input.nextInt();

		System.out.println("Enter the elements : ");
		for (int i = 0; i < x; i++) {
			l1.add(input.nextInt());
		}
		int[] arr = l1.stream().mapToInt(i -> i).toArray();
		LinkedList<Integer> even = new LinkedList<Integer>();
		LinkedList<Integer> odd = new LinkedList<Integer>();
		for (int i = 0; i < x; i++) {
			if (i % 2 == 0) {
				odd.add(arr[i]);
			} else {
				even.add(arr[i]);
			}
		}
		odd.addAll(even);
		System.out.println(odd);

	}

}
