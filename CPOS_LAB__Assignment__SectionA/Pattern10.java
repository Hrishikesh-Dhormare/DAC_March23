//  Assignment Pattern 10


class Pattern10{

	public static void main(String args[])
	{
	
		char alpha ='E';
		for(int i=1;i<=5;i++)
		{
			char temp = alpha;
			for(int j=4;j>=i;j--)
			{
			System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
			System.out.print((alpha)+" ");
			alpha++;
			}
			alpha = temp;
			System.out.println();
			alpha--;
		}
	}
}	
			
