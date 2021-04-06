import java.util.Scanner;

public class StringGeneration {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number:-");
		int xValue = input.nextInt();
		String a = "";
		if(xValue%2==0)
		{
			for(int i=1;i<=xValue-1;i++)
			{
				a=a+'a';
			}
			a=a+'b';
		}
		else
		{
			for(int i=1;i<=xValue;i++)
			{
				a=a+'a';
			}
		}
		System.out.println(a);
		

	}

}
