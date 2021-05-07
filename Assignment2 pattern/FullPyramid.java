class FullPyramid
{
public static void main(String[] args)

{
int k;
for(int i=1;i<=6;i++)
{
k=1;
for(int j=1;j<=11;j++)
{
if(j>=7-i && j<=5+i && k==1)
{
System.out.print("*");
k=0;
}
else
{
System.out.print(" ");
k=1;
}
}
System.out.println();
}
}
}