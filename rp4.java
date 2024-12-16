//P4: Sum of first n natural numbers

import java.io.*;
import java.util.Scanner;

public class rp4
{
    public static void main(String args[])
	{
       int n,i,sum=0;
	   System.out.println("Enter the Positive Integer until which Sum is required: ");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		for(i=1;i<=n;i++)
		{
			sum = sum + i ;
		}
		System.out.println("Sum of Natural Numbers until " + n + " = " + sum);
    }
}