class PAQ32
{
public static void main(String[] args)
{
int l;
int k=0;
for(int i=1;i<=9;i++)
{
l=1;
int y=(i<=5)?k++:k--;
for(int j=1;j<=9;j++)
{
if(j>=k && j<=10-k && l==1)
{
System.out.print("*");
l=0;
}
else
{
System.out.print(" ");
l=1;
}
}

System.out.println();
}
}
}