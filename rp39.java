//P39: Can a number be expressed as a sum of two prime numbers

import java.io.*;
import java.util.Scanner;

public class rp39
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Positive Integer: ");
        int n = s.nextInt();
	int i, check = 0;
	prime o = new prime();
        for (i = 2; i <= n / 2; ++i)
	{
            if (o.p(i) == 1)
	    {
                if (p(n - i) == 1)
		{
                    System.out.println(n + " = " + i + " + " + (n - i));
                    check = 1;
                }
            }
        }
        if (check == 0)
	{
            System.out.println(n + " cannot be expressed as the sum of two prime numbers.");
	}
    }
}

class prime
{
    int p(int n)
    {
        int i, prime = 1;
        if (n == 0 || n == 1)
	{
            prime = 0;
        }
	else
	{
            for (i = 2; i < n; i++)
	    {
                if (n % i == 0)
		{
                    prime = 0;
                    break;
                }
            }
        }
        return prime;
    }
}