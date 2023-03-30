  // Left Side Right Angled Triangle
  
    import java.util.Scanner;
    class Star2
    {
		public static void main(String args[])
		{
		
			System.out.println("Enter the no.of rows : ");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			
			for(int i=1;i<=n;i++)  // Itteration for No. of Rows
			{   
				for(int k=n-1;k>=i;k--)  //space triangle
				{
				System.out.print(" ");
				}
				
				for(int j=1;j<=i;j++)  // Itteration for No. of Columns
					{
					  System.out.print("*");
					}
					  System.out.println();
			}		
		}
    }		
