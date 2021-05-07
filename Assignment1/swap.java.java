import java.util.*;
import java.lang.*;

class swap
{
public static void main(String args [])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter two number:");
int i=sc.nextInt();
int j=sc.nextInt();
int temp;

temp=i;
i=j;
j=temp;
System.out.println("i:"+i);
System.out.println("j:"+j);
}
}
