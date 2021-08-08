//==================================
// Foundations of Computer Science
// Student: Chirag M Thakkar
// id: a1806400
// Semester: Semester 1
// Year: 2020
// Program to execute Quick sort
//===================================

// Child class QuickSort extends parent class MySortAlg

public class QuickSort extends MySortAlg{
	public int[] sort(int[] array){
		int first = 0;
		int last = array.length - 1;
		split(array, first , last);
		return array;
	}

	private void split(int array[], int first, int last){
		if(first < last){
			int middle = partition(array , first , last);
			
			/* Recursively sorting elements till middle and
			   from middle to last*/
			split(array , first , middle - 1);
			split(array , middle + 1 , last);
		}
	}

	private int partition(int array[], int first , int last){
		int key = array[last];
		// index of smaller element
		int i = first - 1;

		for(int j = first; j < last ; j++){
			// if the current element is greater than the key
			if(array[j] > key){
				i++;
				//swap array[i] and array[j]
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}

		// swap array[i+1] and array[last] i.e key
		int temp = array[i + 1];
		array[i + 1] = array[last];
		array[last] = temp;

		return i+1;
	}
}