//  Assignment Star Pattern 13


class Star13{

	public static void main(String args[])
	{
	
		for(int i=1;i<=5;i++)
		{
			for(int j=2;j<=i;j++)
			{
			System.out.print(" ");
			}
			for(int j=5;j>=i;j--)
			{
			System.out.print("*");
			}
	
			System.out.println();
		}
		
		for(int i=4;i>=1;i--)
		{
			for(int j=2;j<=i;j++)
			{
			System.out.print(" ");
			}
			for(int j=5;j>=i;j--)
			{
			System.out.print("*");
			}
	
			System.out.println();
		}
		
		
		
	}
}	
			
