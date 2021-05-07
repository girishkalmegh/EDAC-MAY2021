class Pallindrom
{
	public static void main(String args[])
	{
		int n=1568;
		int k=n;
		int r=0;
		while(n>0)
		{
			 r=r*10+(n%10);
			n/=10;
		}
		if(k==r)
		{
			System.out.println("pallindrom");
		}
		else
	    {
			System.out.println("not pallindrom");
		}
	}
}