// Assignment Star Pattern7

class Star7{

	public static void main(String args[])
	{
			
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
			System.out.print(" ");
			}
			for(int k1=1;k1<=i;k1++)
			{
			System.out.print("*");
			}
			for(int k1=2;k1<=i;k1++)
			{
			System.out.print("*");
			}
			
		    System.out.println();
		}
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
			 System.out.print(" ");
			}
			for(int k=4;k>=i;k--)   // For Right side triangle
			{
			System.out.print("*");
            }
			
			for(int k1=5;k1>=i;k1--)   // For Left side triangle
			{
			System.out.print("*");
            }
			
			System.out.println();
		}
	}
}	
			
