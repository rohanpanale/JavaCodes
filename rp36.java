//P36: Maximum Number of Handshakes

import java.io.*;
import java.util.Scanner;

public class rp36
{
    public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number of People: ");
		int n = s.nextInt();
		int h = (n * (n-1))/2;
		System.out.println("Maximum Number of Handshakes between " + n + " people are " + h);
	}
}