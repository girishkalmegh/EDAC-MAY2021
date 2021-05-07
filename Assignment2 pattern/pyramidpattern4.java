class Pyramidpattern4
{

public static void main(String[] args)
{
int k;
for(int i=1;i<=9;i++)
{
k=1;
for(int j=1;j<=17;j++)
{
if(j>=10-i && j<=8+i)
{
System.out.print(k);

int a=(j<9)?k++:k--;
}
else
System.out.print(" ");
}

System.out.println();
}
}
}