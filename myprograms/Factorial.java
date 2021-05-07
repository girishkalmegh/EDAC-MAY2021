class Factorial
{
	public static void main(String[] args)
	{
		int n=5;
		int fact=1;
		if(n==0||n==1)
		{
			System.out.println("1");
		}
		else
		{
			for(int i=1;i<=n;i++)
				fact=fact*i;
		}
		System.out.println(fact);	
	}
}	
				