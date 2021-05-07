class PAQ2
{
	public static void main(String[] args)
	{
		char k;
		for(int i=1;i<=5;i++)
		{
			k=65;
			for(int j=1;j<=5;j++)
			{
				if(j<=i)
				{
					System.out.print(k);
					k++;
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}	