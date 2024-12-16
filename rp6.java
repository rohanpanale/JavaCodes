//P6: Greater of Two Integers

import java.io.*;
import java.util.Scanner;

public class rp6
{
    public static void main(String args[])
	{
       int a,b;
	   Scanner s = new Scanner(System.in);
	   System.out.println("Enter the First Integer: ");
	   	a = s.nextInt();
	   System.out.println("Enter the Second Integer: ");
		b = s.nextInt();
		if(a==b)
		{
			System.out.println("Both are Equal");
		}
		else if(a>b)
		{
			System.out.println(a + " is Greater than " + b);
		}
		else
		{
			System.out.println(b + " is Greater than " + a);
		}
	}
}