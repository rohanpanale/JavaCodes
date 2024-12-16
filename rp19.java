//P19: Factors of a Number

import java.io.*;
import java.util.Scanner;

public class rp19
{
    public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter an Integer: ");
		int num = s.nextInt();
		System.out.println("Factors of " + num + " are: ");
		for(int i=1;i<=num;i++)
		{
			if((num%i) == 0)
			{
				System.out.println(i);
			}
		}
	}
}