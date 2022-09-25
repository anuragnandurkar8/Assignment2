import java.util.Scanner;
class P7
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number of rows want to print");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i*2;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=n;i>0;i--)
		{
			if(i==n)	continue;
			for(int j=i;j<=n;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<i*2;j++)
			{
				System.out.print("*");
			}
			if(i>1)
			System.out.println();
		}
		
	}
}
/*


Enter a Number of rows want to print
15
               *
              ***
             *****
            *******
           *********
          ***********
         *************
        ***************
       *****************
      *******************
     *********************
    ***********************
   *************************
  ***************************
 *****************************
  ***************************
   *************************
    ***********************
     *********************
      *******************
       *****************
        ***************
         *************
          ***********
           *********
            *******
             *****
              ***
               *

*/