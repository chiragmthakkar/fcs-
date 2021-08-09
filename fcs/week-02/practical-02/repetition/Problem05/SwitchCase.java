//==================================
// Foundations of Computer Science
// Student: Chirag Mahendra Thakkar
// id: a1806400
// Semester: Sem01
// Year: 2020
// Date: 17/03/2020
// Using switch statements, please identify the different ranges. Hence, follow the suggested markers:
// o, for numbers between (0,5];
// x, for numbers between (5, 10];
// s, for numbers between (10, 15];
// *, for numbers bigger than 15;
//===================================

import java.util.Random;
public class SwitchCase
{
	public static void main( String[] args )
	{
		Random ran = new Random();
		String marker = "";
		int ranNumber;

		for(int i = 0; i < 10; i++)
		{
			ranNumber = ran.nextInt( 20 );
			if( ranNumber > 0 && ranNumber <= 5 )
			{
				marker = "o";
			}
			else if ( ranNumber > 5 && ranNumber <= 10 )
			{
				marker = "x";
			}
			else if ( ranNumber > 10 && ranNumber <= 15 )
			{
				marker = "s";
			}
			else if ( ranNumber > 15 )
			{
				marker = "*";
			}

			switch( marker ) // switch case takes an expression
			{
				
				case "o":
					System.out.print( "Number (" + ranNumber + ") : " );
					for( int j = 0; j < ranNumber; j++ )
					{
						System.out.print( "o" );
					}
					break;

				case "x":
					System.out.print( "Number (" + ranNumber + ") : " );
					for( int j = 0; j < ranNumber; j++ )
					{
						System.out.print( "x" );
					}
					break;

				case "s":
					System.out.print( "Number (" + ranNumber + ") : " );
					for( int j = 0; j < ranNumber; j++ )
					{
						System.out.print( "s" );
					}
					break;

				case "*":
					System.out.print( "Number (" + ranNumber + ") : " );
					for( int j = 0; j < ranNumber; j++ )
					{
						System.out.print( "*" );
					}
					break;
			}
			System.out.println("");
		}
	}
}