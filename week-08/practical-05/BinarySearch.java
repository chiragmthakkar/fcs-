//==================================
// Foundations of Computer Science
// Student: Chirag M Thakkar
// id: a1806400
// Semester: Semester 1
// Year: 2020
// Program to implement Binary Search
//===================================

import java.util.Scanner;
public class BinarySearch extends MySearchAlg{

	// function to sort array (used insertion sort)
	public int[] sort(int[] array){
		int j, key;
		// creating a copy of original array
		int tempArray[] = new int[array.length];
		for(int i = 0; i < array.length; i++)
			tempArray[i] = array[i];

        for (int i = 1; i < tempArray.length; i++) { 
            // storing the i-th element as the key
            key = tempArray[i]; 
            j = i - 1; 

            /* elements in the array that are greater 
            than the key are moved one position ahead
            than their current position. */
            while (j >= 0 && tempArray[j] > key) { 
                tempArray[j + 1] = tempArray[j]; 
                j = j - 1; 
            } 
            tempArray[j + 1] = key; 
        }
        return tempArray;
	}

	
	// function to perform Binary search on a sorted array
	public int searchSorted(int[] sortedArray, int left , int right , int findNum){
		// declaring the middle element
		int mid;
		if(right >= left){
			mid = left +  ((right - left) / 2);
			// if the element searched is present in the middle
			if(sortedArray[mid] == findNum)
				return mid;

			/* if the element searched is small than the element at the mid,
			   then we have to search elements to the left of the mid */
			if(sortedArray[mid] > findNum)
				return searchSorted(sortedArray, left, mid - 1 , findNum);

			/* if the element searched is greater than the element at the mid,
			   then we have to search elements to the right of the mid */
			if(sortedArray[mid] < findNum)
				return searchSorted(sortedArray, mid + 1, right, findNum);
		}
		// if the element to be searched is not present
		return -1;
	}


	// function to search for a given number in the array
	public int search(int[] array, int findNum){

		// sorting the input array. Here the i/p array gets sorted so we stored original array
		int sortedArray[] = sort(array);
		int index = searchSorted(sortedArray , 0 , sortedArray.length - 1 , findNum);
		
		// to check the index of the element in the given(unsorted) array.
		// -1 means the element is not present
		if(index == -1)
			return index; 
		else{
			for(int i = 0; i < array.length; i++){
				// checking the index at which the searched number is present
				if(array[i] == findNum){
					//index = i;
					return i;
				}
			 }
		}
		// returning the index at which the element is present
		return -1;
	}

//	FOR TESTING ONLY
	// public static void main(String[] args) {
	// 	BinarySearch bs = new BinarySearch();
	// 	Scanner in = new Scanner(System.in);
	// 	System.out.print("Enter the number of elements in the integer array: ");
	// 	int noOfElements = in.nextInt();
	// 	int a[] = new int[noOfElements];

	// 	// getting the numbers in the array
	// 	for(int i = 0; i < a.length ; i++){
	// 		System.out.print("Enter element at the index " + i +" - ");
	// 		a[ i ] = in.nextInt();
	// 	}

	// 	System.out.print("Enter the number to be searched : ");
	// 	// storing the number to be searched
	// 	int find = in.nextInt();

	// 	// calling search function
	// 	int t = bs.search(a , find);

	// 	if(t == -1)
	// 		System.out.println("Number " + find + " is not present");
	// 	else
	// 		System.out.println("Number " + find + " is  present at index " + t);
	// }

}

