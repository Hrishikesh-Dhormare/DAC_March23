//  Assignment Pyramid Pattern 4


class Pyramid4{

	public static void main(String args[])
	{
	
		for(int i=1;i<=9;i++)
		{
			for(int j=8;j>=i;j--)
			{
			System.out.print("  ");
			}
			for(int k=1;k<=i;k++)
			{
			System.out.print(" "+k);
			}
			for(int k1=i-1;k1>0;k1--)
			{
			System.out.print(" "+k1);
			}
			
			
			System.out.println();
			
		}
			
	}
}	