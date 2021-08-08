//==================================
// Foundations of Computer Science
// Student: Chirag Mahendra Thakkar
// id: a1806400
// Semester: Sem01
// Year: 2020
// Date: 17/03/2020
// Program to print stars accrding to the random number generated
//===================================

import java.util.Random;
public class Repetitions
{
	public static void main(String[] args)
	{
		Random ran = new Random();
		int sum=0;

		// Outer loop will run for 10 times as we need 10 random numbers
		for(int i = 0;i < 10;i++)
		{
			// We need random numbers from 0-20
			int randomNo = ran.nextInt(20); 
			sum += randomNo;
			System.out.print("Number (" + randomNo+") : ");
			
			// Inner loop will run for every random number generated and for n i.e, randomNo of times
			for(int j = 0;j < randomNo;j++)
			{
				System.out.print("*");
			}
			System.out.println("");

		}
	}
}