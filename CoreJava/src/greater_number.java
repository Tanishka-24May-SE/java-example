import java.util.Scanner;

public class greater_number 
{
	public static void main(String[] args) 
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number of A:");
		a=sc.nextInt();
		System.out.print("Enter a number of B:");
		b=sc.nextInt();
		if(a>b)
		{
			System.out.println("A is greater number.");
		}
		else
		{
			System.out.println("B is greater number.");
		}
	}
}