//P7: Greater of three Integers

import java.io.*;
import java.util.Scanner;

public class rp7
{
    public static void main(String args[])
	{
       int a,b,c;
	   Scanner s = new Scanner(System.in);
	   System.out.println("Enter the First Integer: ");
	   	a = s.nextInt();
	   System.out.println("Enter the Second Integer: ");
		b = s.nextInt();
		System.out.println("Enter the Third Integer: ");
		c = s.nextInt();
		if(a==b && b==c)
		{
			System.out.println("All three are Equal");
		}
		else if((a>b && b>c) || (a>b && b==c) || (a==b && b>c))
		{
			System.out.println(a + " is Greatest");
		}
		else if((b>a && a>c) || (b>a && a==c) || (b==a && a>c))
		{
			System.out.println(b + " is Greatest");
		}
		else if((c>b && b>a) || (c>b && b==a) || (c==b && b>a))
		{
			System.out.println(c + " is Greatest");
		}
	}
}