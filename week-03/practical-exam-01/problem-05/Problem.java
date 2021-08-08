//==================================
// Foundations of Computer Science
// Student: Chirag Mahendra Thakkar
// id: a1806400
// Semester: Sem01
// Year: 2020
// Practical Exam Number: Practical-Exam-01
// Program to print the expected output
//===================================


public class Problem
{
	public static void main(String [] args)
	{
		System.out.println("This is the last line of the code!");
		int ths = 25;
		for(int i = 0; i < 10; i++)
		{
			for(int j = i; j < 10; j++)
			{
				for (int k = j; k < 10; k ++)
				{
					int value = i * j * k;
					if(value != 0)
					{
					
					if(value % ths == 0 )
							{	
								System.out.print("i: " + i);
								System.out.print(" j: " + j);
								System.out.println(" k: " + k + " - value " + value);
							}
					}
				}
			}
		}
		System.out.println("This is the first line of the code!");
	}
}