import java.util.Scanner;

public class Problem6ArithmeticProgression {
	public static void main(String[] args) {
		
		System.out.println("Enter the value of first element, common difference,total number of sequence");
		Scanner input= new Scanner(System.in);
		int first = input.nextInt();
		int diff = input.nextInt();
		int n = input.nextInt();
		//System.out.printf("%d,%d,%d",first,diff,n);
		for (int i = 1; i <= n; i++)
	    { 
			System.out.printf("%d"+", ",first );
	    first =first + diff;
	    
	    }
	}

}
