//P8: Leap Year

import java.io.*;
import java.util.Scanner;

public class rp8
{
    public static void main(String args[])
	{
		int year;
		System.out.println("Enter Year: ");
		Scanner s = new Scanner(System.in);
		year = s.nextInt();
		if(((year%400) == 0) || ((year%4) == 0))
		{
			System.out.println(year + " is a Leap Year");
		}
		else
		{
			System.out.println(year + " is Not a Leap Year");
		}
	}
}



