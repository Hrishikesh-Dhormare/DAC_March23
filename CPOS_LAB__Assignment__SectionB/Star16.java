//  Assignment Star Pattern 16


class Star16{

	public static void main(String args[])
	{
	
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)  //for space
			{
			System.out.print(" ");
			}
			for(int k=5;k>=i;k--)  //for triangle
			{
				if(i==1 || k==5 || k==i)   // for hallow space
				{
				System.out.print("*");
				}
				else
				System.out.print(" ");	
			}
			
			
			System.out.println();
		}
	}
}	
