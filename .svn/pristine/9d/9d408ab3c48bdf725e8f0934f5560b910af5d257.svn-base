//==================================
// Foundations of Computer Science
// Student: Chirag M Thakkar
// id: a1806400
// Semester: Semester 1
// Year: 2020
// Program to execute Merge sort
//===================================

// Child class MergeSort extends parent class MySortAlg

public class MergeSort extends MySortAlg{ 
    // Merges two subarrays of array[]. 
    // First subarray is array[first to middle] 
    // Second subarray is array[middle+1 to last] 
    private void merge(int array[], int first, int middle, int last) 
    { 
        // Find sizes of two subarrays to be merged 
        int s1 = middle - first + 1; 
        int s2 = last - middle; 
  
        // Creating temporary arrays
        int left[] = new int [s1]; 
        int right[] = new int [s2]; 
  
        // Copying data to temporary arrays
        for (int i = 0; i < s1; i++){
            left[i] = array[first + i]; 
        }

        for (int j = 0; j < s2; j++){
            right[j] = array[middle + 1 + j]; 
        }
  
        // Initial indexes of first and second subarrays 
        int i = 0, j = 0; 
  
        // Initial index of merged subarry array 
        int k = first; 
        while (i < s1 && j < s2) 
        { 
            if (left[i] >= right[j]) 
            { 
                array[k] = left[i]; 
                i++; 
            } 
            else
            { 
                array[k] = right[j]; 
                j++; 
            } 
            k++; 
        } 
  
        // Copying remaining elements of left[] if any
        while (i < s1) 
        { 
            array[k] = left[i]; 
            i++; 
            k++; 
        } 
  
        // Copying remaining elements of right[] if any
        while (j < s2) 
        { 
            array[k] = right[j]; 
            j++; 
            k++; 
        } 
    } 

    private void split(int[] array , int first , int last){
        if(first < last){
            int middle = (first + last) / 2;

            // splitting array into single elements
            split(array , first , middle);
            split(array , middle + 1 , last);

            // merging arrays
            merge(array, first , middle , last);

        }
    }
  
     
    public int[] sort(int array[]) 
    { 
        // initialize the variable of first and last
    	int first = 0;
    	int last = array.length-1;

        // function call
        split(array , first ,last);
        return array;
    } 
} 