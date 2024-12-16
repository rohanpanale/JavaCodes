//P33: Octal to Decimal

import java.io.*;
import java.util.Scanner;

public class rp33
{
    public static void main(String args[])
    {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter an Octal Number: ");
		int oct = s.nextInt();
		int oct1 = oct, base = 1, dec = 0;
		while(oct >0)
		{
			dec = dec + ((oct % 10) * base);
			base = base * 8;
			oct = oct/10;
		}
		System.out.println("Octal number " + oct1 + " in decimal is " + dec);
	}
}