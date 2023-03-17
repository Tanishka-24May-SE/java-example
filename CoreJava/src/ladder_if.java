import java.util.Scanner;

public class ladder_if 
{
	public static void main(String[] args) 
	{
		int srno,s1,s2,s3,s4,total;
		String sname;
		double per;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Student Roll No:");
		srno=sc.nextInt();
		System.out.print("Enter Student Name:");
		sname=sc.next();
		System.out.print("Enter Marks Of Subject 1:");
		s1=sc.nextInt();
		System.out.print("Enter Marks Of Subject 2:");
		s2=sc.nextInt();
		System.out.print("Enter Marks of Subject 3:");
		s3=sc.nextInt();
		System.out.print("Enter Marks of Subject 4:");
		s4=sc.nextInt();
		
		total=s1+s2+s3+s4;
		per=total/4;
		
		System.out.println("*****Final Result of Sudent*****");
		System.out.println("Roll No:" +srno);
		System.out.println("Name:" +sname);
		System.out.println("Total:" +total);
		System.out.println("Persentage:" +per);
		
		if(per>=70)
		{
			System.out.println("Distriction");
		}
		else if(per>=60)
		{
			System.out.println("First class");
		}
		else if(per>=50)
		{
			System.out.println("Second class");
		}
		else if(per>=40)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail..!!");
		}
	}
}