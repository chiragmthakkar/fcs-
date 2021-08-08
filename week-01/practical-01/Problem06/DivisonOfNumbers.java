// Student ID: a1806400
// Student name: Chirag Mahendra Thakkar
// Date: 11/03/2020
// Practical01-Problem06
// Program to display division of two numbers

import java.util.Scanner;
public class DivisonOfNumbers
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		int number_a,number_b;
		float number_c;
		System.out.print("Enter number a : ");
		number_a = in.nextInt();
		System.out.print("Enter number b : ");
		number_b = in.nextInt();
		number_c = (float)number_a / number_b; // Typecasting integer values
		System.out.println("The divison of " + number_a + " and " + number_b + " is " + number_c);
	}
}

