class patt8{
	
	public static void main(String args[]){
	
		for (int i=5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");//one spaces 
				
				
			}
			
			for(int j=5;j>=i;j--)
			{
				System.out.print(j+" ");//star & space
				
				
			}
			System.out.println();
		}
	}
	
}


/*
OUTPUT:
     5
    5 4
   5 4 3
  5 4 3 2
 5 4 3 2 1

*/