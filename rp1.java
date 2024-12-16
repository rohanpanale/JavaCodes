//P1: Positive or Negative Integer

import java.io.*;
import java.util.Scanner;

public class rp1
{
    public static void main(String args[])
	{
		int n;
		System.out.println("Enter an Integer: ");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		if(n>=0)
		{
			System.out.println(n + " is an Positive Integer");
		}
		else
		{
			System.out.println(n + " is an Negative Integer");
		}
	
    }
}