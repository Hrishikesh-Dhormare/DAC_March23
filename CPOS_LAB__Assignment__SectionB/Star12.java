//  Assignment Star Pattern 12


class Star12{

	public static void main(String args[])
	{
	
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
			System.out.print("*");
			}
			
			System.out.println();
		}
		
		for(int i1=2;i1<=5;i1++)
		{
			for(int j=1;j<=i1;j++)
			{
			System.out.print("*");
			}
			
			System.out.println();
		}
	}
}	
