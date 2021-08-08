//==================================
// Foundations of Computer Science
// Student: Chirag Mahendra Thakkar
// id: a1806400
// Semester: Sem01
// Year: 2020
// Program to display working of ATM machine having 20 and 50 notes.
//===================================


import java.util.Scanner;
public class Main
{
	public static void run( int withdrawAmount )	
	{
		// declaring variables to store 50 & 20 notes
		int balance,outstandingAmount,twentyNotes=0,fiftyNotes=0,lastFifty;

		if ( (withdrawAmount % 10 ) == 0) // to check whether it will pass the criteria of 20 and 50's multiple
		{
			if(withdrawAmount > 50)
			{
				fiftyNotes = withdrawAmount / 50; // stores number of 50 notes to be given
				outstandingAmount = withdrawAmount % 50; // stores the amount after the multiples of 50 are deducted

				if(outstandingAmount == 0) // will be zero if the amount is divisible by 50
				{
					System.out.println("Here is " + fiftyNotes + " $50 notes and "+ twentyNotes+" $20 notes" );
				}
				else if(outstandingAmount % 20 == 0) // checks if it is divisible by 20
				{
					twentyNotes = outstandingAmount / 20; // stores the number of 20 notes
					System.out.println("Here is " + fiftyNotes + " $50 notes and "+ twentyNotes+" $20 notes" );
				}
				else
				{
					fiftyNotes = fiftyNotes - 1; // to go back to last number multiple of 50
					lastFifty = fiftyNotes * 50; // to get the last amount, which is multiple of 50
					balance = withdrawAmount - lastFifty; // to get the difference between the amount to be withdrawn and last multiple of 50
					if(balance % 20 == 0) // checks whether the reamining balance is divisible by 20
					{
						twentyNotes = balance / 20;
						System.out.println("Here is " + fiftyNotes + " $50 notes and "+ twentyNotes+" $20 notes" );
					}
				}
			}
			else if(withdrawAmount < 50) // for amount less than 50
			{
				if(withdrawAmount % 20 == 0) // checks for multiples of 20
				{
					twentyNotes = withdrawAmount / 20;
					System.out.println("Here is " + fiftyNotes + " $50 notes and "+ twentyNotes+" $20 notes" );
				}
				else
				{
					System.out.println("Sorry, the value you input cannot be withdrew");
				}
			}
		}
		else
			{
				System.out.println("Sorry, the value you input cannot be withdrew");
			}
}

	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the amount : ");
		int withdrawAmount = in.nextInt();
		run(withdrawAmount); // calling function run

	}

}