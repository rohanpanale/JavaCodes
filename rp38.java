//P38: Replace 0 with 1

import java.io.*;
import java.util.Scanner;

public class rp38
{
    public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter an Integer: ");
		int num = s.nextInt();
		int num1 = num;
		int number[] = new int[100], count = -1;
		while(num > 0)
		{
			int temp = num%10;
			if(temp == 0)
			{
				temp = 1;
			}
			count++;
			number[count] = temp;
			num = num/10;
		}
		System.out.println("Replacing all 0 with 1 the number " + num1 + " becomes ");
		while(count >= 0)
		{
			System.out.print(number[count]);
			count--;
		}
	}
}