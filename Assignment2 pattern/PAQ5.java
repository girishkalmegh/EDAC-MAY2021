class PAQ5
{
	public static void main(String[] args)
	{
		char k=65;
		for(int i=1;i<=5;i++)
		{
			
			for(int j=1;j<=5;j++)
			{
				if(j<=i)
				{
					
				System.out.print(k);
					
				}
				else
					System.out.print(" ");
				
			}
			System.out.println();
			k++;
		}
	}
}	