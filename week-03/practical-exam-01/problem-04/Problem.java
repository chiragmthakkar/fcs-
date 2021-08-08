//==================================
// Foundations of Computer Science
// Student: Chirag Mahendra Thakkar
// id: a1806400
// Semester: Sem01
// Year: 2020
// Practical Exam Number: Practical-Exam-01
// Program to print count down from 50 to 3 and print accordingly
//===================================

public class Problem
{
	public static void main(String[] args)
	{
		String expression="";
		for( int i = 50; i >= 3; i-- )
		{
			if((i%3)==0)
			{
				if(i>=1 && i<10)
				{
					for(int j=0;j<i;j++)
					{
						System.out.print("*");	
					}
					System.out.println("");
					
				}
				else if(i>=10 && i<20)
				{
					for(int j=0;j<i;j++)
					{
						System.out.print("=");	
					}
					System.out.println("");
					
				}
				else if(i>=30 && i<50)
				{
					if(i==33)
					{
						for(int j=0;j<i;j++)
						{
							System.out.print("3");	
						}
						System.out.println("");

					}
					else 
					{
						for(int j=0;j<i;j++)
					{
						System.out.print("o");	
					}
					System.out.println("");	
					}
					
					
				}
				else if(i>=20 && i<30)
				{
					for(int j=0;j<i;j++)
					{
						System.out.print("x");	
					}
					System.out.println("");
					
				}
			}
		}
	}
}