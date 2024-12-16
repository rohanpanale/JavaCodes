//P31: Decimal to Octal

import java.io.*;
import java.util.Scanner;

public class rp31
{
    public static void main(String args[])
    {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter an Integer: ");
		int dec = s.nextInt();
		int dec1 = dec, oct = 0, base = 1;
		while(dec > 0)
		{
			int temp = dec%8;
			oct = oct + (temp * base);
			dec = dec/10;
			base = base * 10;
		}
		System.out.println(dec1 + " in Octal is " + oct);
	}
}



