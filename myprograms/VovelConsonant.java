import java.util.*;
class VovelConsonant
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a character");
		char ch=sc.next().charAt(0);
		if(ch=='A' || ch=='E' || ch=='I'|| ch=='0'||ch=='U'||ch=='a'||ch=='e'||ch=='o'||ch=='i'||ch=='u')
			{
				System.out.println(ch+"is vovel");
			}
		else
				System.out.println(ch+"is consonant");
    }
}