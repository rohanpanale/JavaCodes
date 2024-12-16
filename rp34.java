//P34: Quadrant of Given Coordinate

import java.io.*;
import java.util.Scanner;

public class rp34
{
    public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the x Coordinate: ");
		int x = s.nextInt();
		System.out.println("Enter the y Coordinate: ");
		int y = s.nextInt();
		if(x == 0 && y == 0)
		{
			System.out.println("Coordinate ( " + x + " , " + y + " ) is the Origin");
		}
		else if(x > 0 && y > 0)
		{
			System.out.println("Coordinate ( " + x + " , " + y + " ) lies in the First Quadrant");
		}
		else if(x < 0 && y > 0)
		{
			System.out.println("Coordinate ( " + x + " , " + y + " ) lies in the Second Quadrant");
		}
		else if(x < 0 && y < 0)
		{
			System.out.println("Coordinate ( " + x + " , " + y + " ) lies in the Third Quadrant");
		}
		else if(x > 0 && y < 0)
		{
			System.out.println("Coordinate ( " + x + " , " + y + " ) lies in the Fourth Quadrant");
		}
	}
}