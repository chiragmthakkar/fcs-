//==================================
// Foundations of Computer Science
// Student: Chirag Mahendra Thakkar
// id: a1806400
// Semester: Sem01
// Year: 2020
// Date: 17/03/2020
// Program to find whether a number is greater than or less than 10. If the random number is bigger or equal to 10, it should be assigned to >=, otherwise <.
//===================================

import java.util.Random;
import java.lang.Math; // To use the round() function
public class GreaterOrLessThan
{
	public static void main( String[] args )
	{
		Random ran = new Random();
		int sum = 0;

		// Outer loop will run for 10 times as we need 10 random numbers
		for( int i = 0; i < 10; i++ )
		{
			// We need random numbers from 0-20
			int randomNo = ran.nextInt( 20 ); 
			sum += randomNo;
			System.out.print( "Number (" + randomNo+") : " );

			// this if condition will check for even numbers
			if ( randomNo >= 10 )
			{
				// Inner loop will run for every random number generated and for n i.e, randomNo of times
				for( int j = 0; j < randomNo; j++ )
				{
					System.out.print( ">=" );
				}

			}
			// if it is not even it will by default enter in else

			else
			{
				for( int j = 0; j < randomNo; j++ )
				{
					System.out.print( "<" );
				}
			}
			System.out.println("");
		}

		float avg = (float) sum / 10; // Storing average of the numbers
		int roundedAvg = Math.round( avg ); // Math.round() rounds off the number passed
		System.out.print( "Average (" + roundedAvg+") : " );
		for( int k = 0; k < roundedAvg; k++)
			{
				System.out.print( "*" );
			}
		System.out.println("");
	}
}