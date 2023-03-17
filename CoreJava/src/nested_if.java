import java.util.Scanner;

public class nested_if 
{
	public static void main(String[] args) 
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number of A:");
		a=sc.nextInt();
		System.out.print("Enter a number of B:");
		b=sc.nextInt();
		System.out.print("Enetr a number of C:");
		c=sc.nextInt();
		if(a>b)
		{
			if(a>c)
			{
			    System.out.println("A is greater number.");
			}
			else
			{
				System.out.println("C is greater number.");
			}
		}
		else if(b>c)
		{
			System.out.println("B is greater number.");
		}
		else
		{
			System.out.println("C is greater number.");
		}
	}
}