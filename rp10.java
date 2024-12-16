//P10: Prime Number in an Given Range

import java.io.*;
import java.util.Scanner;

public class rp10
{
    public static void main(String args[])
	{
		int low,high,count;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Starting Value of Range: ");
		low = s.nextInt();
		System.out.println("Enter a Ending Value of Range: ");
		high = s.nextInt();
		for(int i=low;i<=high;i++)
		{
			count = 0;
			for(int j=1;j<=i;j++)
			{
				if((i%j) == 0)
				{
					count++;
				}
			}
			if(count == 2)
			{
				System.out.println(i);
			}
		}
	}
}