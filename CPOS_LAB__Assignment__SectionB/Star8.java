// Assignment Star Pattern 8


class Star8{

	public static void main(String args[])
	{
			
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
			System.out.print("*");
			}
		
		System.out.println();
		}
		
		// Lower Side
		for(int i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{
			System.out.print("*");
			}
				
		System.out.println();
		}	
	}
}	
			
