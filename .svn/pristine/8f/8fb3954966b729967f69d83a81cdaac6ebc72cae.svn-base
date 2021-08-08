//==================================
// Foundations of Computer Science
// Student: Chirag M Thakkar
// id: a1806400
// Semester: Semester 1
// Year: 2020
// Program to execute Insertion sort
//===================================

// Child class InsertionSort extends parent class MySortAlg

public class InsertionSort extends MySortAlg{
	public int[] sort(int[] array){ 
		int j , key;
        for (int i = 1; i < array.length; i++) { 
            // storing the i-th element as the key
            key = array[i]; 
            j = i - 1; 

            /* elements in the array that are less 
            than the key are moved one position ahead
            than their current position. */
            while (j >= 0 && array[j] < key) { 
                array[j + 1] = array[j]; 
                j = j - 1; 
            } 
            array[j + 1] = key; 
        }
        return array;
    }
}