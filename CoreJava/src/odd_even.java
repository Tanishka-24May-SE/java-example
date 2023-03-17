import java.util.Scanner;

public class odd_even 
{
	public static void main(String[] args) 
	{
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		a=sc.nextInt();
		if(a%2==0)
		{
			System.out.println("A is Even number.");
		}
		else
		{
			System.out.println("A is Odd number.");
		}
	}
}