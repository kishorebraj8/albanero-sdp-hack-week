import java.util.Scanner;

public class Problem7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of elements in array-");
		int n = input.nextInt();
		int[] numbers = new int[n];
		System.out.println("Enter the elements of array-");
		for (int i = 0; i < n; i++) {
			numbers[i] = input.nextInt();
		}
		System.out.println("enter the value of K : ");
		int k = input.nextInt();
		int count=0,l=0,r=0;
		int length=0;
		for(;r<n;r++)
		{
			if(numbers[r]==0)
			{
				count++;
			}
			while(count>k)
			{
				if(numbers[l]==0)
				{
					count--;
				}
				l++;
			}
			if(r-l+1>length)
			{
				length= r-l+1;
			}
		}
		System.out.println(length);
	}

}
