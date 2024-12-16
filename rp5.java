//P5: Sum of natural numbers between given Range

import java.io.*;
import java.util.Scanner;

public class rp5
{
    public static void main(String args[])
	{
       int low,high,i,sum=0;
	   Scanner s = new Scanner(System.in);
	   System.out.println("Enter the Starting Value of Range: ");
	   	low = s.nextInt();
	   System.out.println("Enter the Ending Value of Range: ");
		high = s.nextInt();
		for(i=low;i<=high;i++)
		{
			sum = sum + i ;
		}
		System.out.println("Sum of Natural Numbers from " + low + " to " + high + " = " + sum);
    }
}