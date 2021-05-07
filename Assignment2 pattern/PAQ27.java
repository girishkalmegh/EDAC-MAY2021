class PAQ27
{
public static void main(String[] args)
{
int k=0;
for(int i=1;i<=9;i++)
{
int l=(i<=5)?k++:k--;
for(int j=1;j<=5;j++)
{
if(j>=6-k && j<=5)
System.out.print("*");
else
System.out.print(" ");
}

System.out.println();
}
}
}