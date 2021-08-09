//==================================
// Foundations of Computer Science
// Student: Chirag M Thakkar
// id: a1806400
// Semester: Semester 1
// Year: 2020
// Program to test the algos and find the max value in a given array
//===================================

import java.util.Scanner;
public class Main{
	// method to check the Search algo and return true if the result and the user given ans is same else return false
	private static boolean test(int result , int ans){
		if(result == ans){
			return true;
		}
		else return false;
	}

	// method to find the index of maximum value in the array
	private static int findMaxVal(int array[]){
		// storing the 1st element as the largest number
		int maxVal = array[0];
		// index of the max value
		int maxValIndex = 0;
		for(int i = 0 ; i < array.length ; i++){
			if(array[i] >= maxVal){
				maxVal = array[i];
				maxValIndex = i;
			}
		}
		// returning the index of the largest number
		return maxValIndex;
	}

	public static void main(String[] args) {
		int result , ans , numberSearched;
		boolean elementFound = false;

		BinarySearch bs = new BinarySearch();
		LinearSearch ls = new LinearSearch();

		// Taking elements of the array from the user
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of elements in the integer array: ");
		int noOfElements = in.nextInt();
		int array[] = new int[noOfElements];

		for(int i = 0; i < array.length ; i++){
			System.out.print("Enter element at the index " + i +" - ");
			array[i] = in.nextInt();
		}

		// Test case 1
		System.out.println("\nTesting Binary Search (Case-1)");
		System.out.print("Enter the number to be searched : ");
		
		// storing the number to be searched
		numberSearched = in.nextInt();

		System.out.print("Enter the index of the number searched : ");
		
		// storing the index of the number searched
		ans = in.nextInt();
		
		// Binary search will return the index of the array
		result = bs.search(array , numberSearched);

		// calling test method to test the result 
		elementFound = test(result , ans);
		
		if(elementFound == true)
			System.out.println("The BinarySearch search is correct");
		else
			System.out.println("The BinarySearch search is incorrect");	


		// Test case 2 ( testing Linear Search )
		System.out.println("\nTesting Linear Search (Case-2) ");
		System.out.print("Enter the number to be searched : ");
		// storing the number to be searched
		numberSearched = in.nextInt();

		System.out.print("Enter the index of the number searched : ");
		// storing the index of the number searched
		ans = in.nextInt();
		result = ls.search(array , numberSearched);
		elementFound = test(result , ans);
	
		if(elementFound == true)
			System.out.println("The LinearSearch search is correct");
		else
			System.out.println("The LinearSearch search is incorrect");


		// Test case 3
		System.out.println("\nTesting Binary Search (Case-3)");
		System.out.print("Enter the number to be searched : ");
		// storing the number to be searched
		numberSearched = in.nextInt();

		System.out.print("Enter the index of the number searched : ");
		// storing the index of the number searched
		ans = in.nextInt();
		
		// Binary search will return the index of the array
		result = bs.search(array , numberSearched);

		// calling test method to test the result 
		elementFound = test(result , ans);
		
		if(elementFound == true)
			System.out.println("The BinarySearch search is correct");
		else
			System.out.println("The BinarySearch search is incorrect");	
		
		// Code to find max value in an array
		System.out.println("\nFinding maximum value in an int array. Please enter unique values. ");
		System.out.print("\nEnter the number of elements in the integer array: ");
		int noElements = in.nextInt();
		int arrayMax[] = new int[noElements];

		// getting the elements of the array from the user
		for(int i = 0; i < arrayMax.length ; i++){
			System.out.print("Enter element at the index " + i +" - ");
			arrayMax[i] = in.nextInt();
		}
		
		int index = findMaxVal(arrayMax);
		System.out.println("\nThe max element is present at index " + index);
	}
}