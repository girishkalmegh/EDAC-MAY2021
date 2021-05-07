import java.util.*;
class array2
{
	public static void main(String args[])
	{   
	    Scanner sc=new Scanner(System.in);
		int array[][]=new int[3][3];
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array.length;j++)
			{  
		        
				array[i][j]=sc.nextInt();
	        }
		}
		
		/*for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array.length;j++)
			{
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}*/
		for(int x[]:array)
		{
			for(int y:x)
			{
				System.out.print(y+" ");
			}
			System.out.println();
		}
				
		
	}
}
	
			