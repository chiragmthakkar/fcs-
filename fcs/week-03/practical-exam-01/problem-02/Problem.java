//==================================
// Foundations of Computer Science
// Student: Chirag Mahendra Thakkar
// id: a1806400
// Semester: Sem01
// Year: 2020
// Practical Exam Number: Practical-Exam-01
// Program to print count down from 101 to 89
//===================================

public class Problem
{
	public static void main(String[] args)
	{
		System.out.print("[");
		for(int i = 101; i >= 89; i--)
		{
			if(i == 89)
			{
				System.out.print(i);	
			}
			else
			{
				System.out.print(i + ",");
			}
			
		}
		System.out.println("]");
	}
}