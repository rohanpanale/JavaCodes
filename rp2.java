//P2: Even or Odd Integer

import java.io.*;
import java.util.Scanner;

public class rp2
{
    public static void main(String args[])
	{
		int n;
		System.out.println("Enter an Integer: ");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		if((n%2)==0)
		{
			System.out.println(n + " is an Even Integer");
		}
		else
		{
			System.out.println(n + " is an Odd Integer");
		}
	}
}