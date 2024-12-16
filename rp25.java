//P25: Highest Common Factor

import java.io.*;
import java.util.Scanner;

public class rp25
{
    public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter First Integer: ");
		int num1 = s.nextInt();
		System.out.println("Enter Second Integer: ");
		int num2 = s.nextInt();
		int hcf = 0;
		for(int i=1;i<num1 && i<num2;i++)
		{
			if(((num1%i) == 0) && ((num2%i) == 0))
			{
				hcf = i;
			}
		}
		System.out.println("Highest Common Factor for " + num1 + " and " + num2 + " is " + hcf);
	}
}