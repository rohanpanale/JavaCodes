//P30: Decimal to Binary

import java.io.*;
import java.util.Scanner;

public class rp30
{
    public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter an Integer ");
		int dec = s.nextInt();
		int dec1 = dec;
		int bin[] = new int[20], count = -1;
		while(dec > 0)
		{
			int temp = dec%2;
			count++;
			bin[count] = (temp);
			dec = dec/2;
		}
		System.out.println(dec1 + " in Binary is ");
		while(count > -1)
		{
			System.out.print(bin[count]);
			count--;
		}
	}
}