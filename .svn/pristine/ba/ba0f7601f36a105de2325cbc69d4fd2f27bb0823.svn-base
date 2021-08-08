//==================================
// Foundations of Computer Science
// Student: Chirag Mahendra Thakkar
// id: a1806400
// Semester: Sem01
// Year: 2020
// Program to check whether a number is greater than the other
//===================================

import java.util.Scanner;
public class Problem03{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		// try will check if there's any error 
		try{
			//taking input from the user
			System.out.print("Please insert a number : ");
			int first=in.nextInt();
			//taking input from the user
			System.out.print("Please insert a number : ");
			int second=in.nextInt();
			int bigger;
			if(second == first){
				bigger = 0; // assigned to 0 if both of them are equal
			}
			else if(first > second){
				bigger = first;
			}
			else bigger = second;

			if (bigger == 0)
				System.out.println("Both the numbers are equal");
			else
				System.out.print("The bigger number is "+bigger+"\n");
		}
		// in case if there is any error it will go into catch and print the message below
		catch(Exception e){
			System.out.println("Please enter numbers only !");
		}
	}
}