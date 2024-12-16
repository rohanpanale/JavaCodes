//P16: Fibonacci Series upto nth term

import java.io.*;
import java.util.Scanner;

public class rp16
{
    public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the term until which Fibonacci Series: ");
		int n = s.nextInt();
		int first = 0, second = 1;
		System.out.println(first + "\n" + second);
		for(int i=1;i<(n-1);i++)
		{
			int third = first + second;
			System.out.println(third);
			first = second;
			second = third;
		}
	}
}



