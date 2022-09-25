import java.util.Scanner;
class P5
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number of rows");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>i;j--)
			{
				System.out.print(" ");
			}

			for(int j=1;j<i*2;j++)
			{
				System.out.print("*");
			}
			if(i<n)
			System.out.println();
		}
		
	}
}
/*
OUTPUT:

Enter a number of rows
5
    *
   ***
  *****
 *******
*********


*/