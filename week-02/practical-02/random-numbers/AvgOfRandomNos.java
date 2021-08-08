//==================================
// Foundations of Computer Science
// Student: Chirag Mahendra Thakkar
// id: a1806400
// Semester: Sem01
// Year: 2020
// Date: 17/03/2020
// Program to find average of Random Numbers
//===================================

import java.util.Random;
public class AvgOfRandomNos
{
	public static void main(String[] args)
	{
		Random ran=new Random();
		float mean;
		int sum=0,a;
		int[] nos=new int[10]; // Initializing an array with length 10

		for(int i=0;i<10;i++)
		{
			a=ran.nextInt(100); // This will give random numbers from [0,100)
			nos[i]=a;
			sum=sum+a;
		}
		
		System.out.print("The Random Numbers generated are: ");
		for(int i=0;i<10;i++)
		{
			System.out.print(nos[i]+" ");	
		}
		
		System.out.println("\nTotal Sum is " + sum);
		mean=(float)sum/10; // Type casting
		System.out.println("The mean is " + mean);
	}
}