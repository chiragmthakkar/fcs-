//==================================
// Foundations of Computer Science
// Student: Chirag M Thakkar
// id: a1806400
// Semester: Semester 1
// Year: 2020
// Program to implement Linear Search
//===================================

import java.util.Scanner;
public class LinearSearch extends MySearchAlg{
	// function to search for a given number in the array
	public int search(int[] array, int num){
		for(int i = 0; i < array.length ; i++){
			if(num == array[i]){
				// returning the index at which the number is present
				return i;
			}
		}
		// -1 means the number is not present
		return -1;
	}

	// public static void main(String[] args) {
	// 	LinearSearch ls = new LinearSearch();
	// 	Scanner in = new Scanner(System.in);
	// 	System.out.println("Enter the number of elements in the interger array: ");
	// 	int num_element = in.nextInt();
	// 	int a[] = new int[num_element];
	// 	System.out.println("Enter the elements in the integer array: ");
		
	// 	for(int i = 0; i < a.length ; i++){
	// 		a[ i ] = in.nextInt();
	// 	}

	// 	System.out.println("Enter the number to be searched : ");
	// 	int find = in.nextInt();
	// 	int t = ls.search(a , find);

	// 	if(t == -1)
	// 		System.out.println("Number " + find + " is present");
	// 	else
	// 		System.out.println("Number " + find + " is  present at index " + t);
	// }
}