//==================================
// Foundations of Computer Science
// Student: Chirag Mahendra Thakkar
// id: a1806400
// Semester: Sem01
// Year: 2020
// Program to check whether the number is prime or not.
//===================================

import java.util.Scanner;
public class Problem02{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		// try will check if there's any error 
		try{
			//taking input from the user
			System.out.print("Please insert a number : ");
			int number = in.nextInt();
			boolean flag = true;
			for(int i = 2;i <= number / 2; i ++)
			{
				if((number % i) == 0)
				{
					flag = false;
					break;
				}
			}
			if(flag == true) System.out.print("The number " + number +" is a prime number\n");
			else System.out.print("The number " + number + " is not a prime number\n");
		}

		catch(Exception e){
			System.out.print("Error " + e);	
		}
	}
}