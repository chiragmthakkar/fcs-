//==================================
// Foundations of Computer Science
// Student: Chirag Mahendra Thakkar
// id: a1806400
// Semester: Sem01
// Year: 2020
// Date: 18/03/2020
// Write a program to create a user interface that perform addition operations.
// For every operation performed, the user should decided between a) sum again or b) exit.
//===================================

import java.util.Scanner;
public class UsingUserInterface
{
	public static void main(String args[])
	{
		while( true )
		{
			System.out.println( "Welcome dear user! " );
			System.out.println( "Would you like to: " );
			System.out.println( "a) sum again" );
			System.out.println( "b) exit" );
			System.out.print( "Option: " );
			Scanner in = new Scanner(System.in);
			char userInput = in.next().charAt( 0 ); // charAt(0) gives the value of the character at 0th position

			if( userInput == 'a')
			{
				System.out.print( "Please, insert your first number : " );
				int firstNumber = in.nextInt();
				System.out.print( "Please, insert your second number : " );
				int secondNumber = in.nextInt();
				int sum = firstNumber + secondNumber;
				System.out.println( "Thankyou for your enquiry, the sum of " + firstNumber + " and " + secondNumber + " is " + sum );
			}
			else if ( userInput == 'b' )
			{
				System.out.println( "Thankyou! Have a good day" );
				break;
			}
			else
			{
				System.out.println( "Please enter valid output" );
			}
		}
	}
}
