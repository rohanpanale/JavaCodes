//P28: Binary to Decimal conversion

import java.io.*;
import java.util.Scanner;

public class rp28
{
    public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Binary Number: ");
		int bin = s.nextInt();
		int bin1 = bin;
		int base = 1, dec = 0;
		while(bin > 0)
		{
			int temp = bin%10;
			dec = dec + (temp * base);
			base = base * 2;
			bin = bin/10;
		}
		System.out.println("The conversion of Binary number " + bin1 + " to Deciamal is " + dec);
	}
}