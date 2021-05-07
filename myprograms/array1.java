import java.util.*;
class array1
{
	public static void main(String args[])
	{    int add=0;
		int array[]=new int[6];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array elements");
		
		for(int i=0;i<array.length;i++)
		{
			array[i]=sc.nextInt();
			add=add+array[i];
		}
		
		//for(int i=0;i<array.length;i++)
		//{
			System.out.print(add);
		//}
	}
}