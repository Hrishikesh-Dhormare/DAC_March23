// Assignment Star Pattern 10

class Star10{

	public static void main(String args[])
	{
			
		for(int i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{
			System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
			System.out.print("*");
			}
			for(int j1=4;j1>=i;j1--)
			{
			System.out.print("*");
			}
			
			
			
			System.out.println();
		}
		
	}
}	
