//P35: Permutations

import java.io.*;
import java.util.Scanner;

public class rp35
{
    public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number of People: ");
		int n = s.nextInt();
		System.out.println("Enter the Number of Seats: ");
		int r = s.nextInt();
		factorial x = new factorial();
		int per = (x.fact(n))/(x.fact(n-r));
		System.out.println("Permutations in which " + n + " people can occupy " + r + " seats is a classroom is " + per);
	}
}

class factorial
{
	int fact(int a)
	{
		int i , f = 1;
		for(i=a ; i>0 ; i--)
		{
			f = f * i;
		}
		return f;
	}
}