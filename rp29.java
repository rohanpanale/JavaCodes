//P29: Binary to Octal conversion

import java.io.*;
import java.util.Scanner;

public class rp29
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
		base =1;
		System.out.println(dec);
		int oct = 0;
		while(dec > 0)
		{
			int temp1 = dec%8;
			oct = (oct) + (temp1 * base);
			base = base * 10;
			dec = dec/8;
		}
		System.out.println("The conversion of Binary number " + bin1 + " to Octal is " + oct);
	}
}