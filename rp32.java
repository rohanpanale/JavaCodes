//P32: Octal to Binary

import java.io.*;
import java.util.Scanner;

public class rp32
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
		int bin[] = new int[100], count = -1;
		while(dec > 0)
		{
			count++;
			bin[count] = dec%2;
			dec = dec/2;
		}
		System.out.println("Octal Number " + oct1 + " in Binary is ");
		while(count >= 0)
		{
			System.out.print(bin[count]);
			count--;
		}
	}
}