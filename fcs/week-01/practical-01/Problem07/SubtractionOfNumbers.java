// Student ID: a1806400
// Student name: Chirag Mahendra Thakkar
// Date: 11/03/2020
// Practical01-Problem07
// Program to display subtraction of two numbers

import java.util.Scanner;
public class SubtractionOfNumbers
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
		number_c = number_a-number_b;
		System.out.println("The subtraction of " + number_a + " and " + number_b + " is " + number_c);
	}
}

