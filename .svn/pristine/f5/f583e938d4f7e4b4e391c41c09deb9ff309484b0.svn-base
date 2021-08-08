//==================================
// Foundations of Computer Science
// Student: Chirag M Thakkar
// id: a1806400
// Semester: Semester 1
// Year: 2020
// Program to test various sorting algorithms
//===================================
public class Main{
	public static boolean test(int[] result, int[] ans) {
		boolean answer = false;
		for(int i = 0;i<result.length ; i++){
			if(result[i] != ans[i]){
				answer = false;
				return answer;
			}
		}
		answer = true;
		return answer;
	}
	
	public static boolean compare(int[] arr1, int[] arr2){
		boolean result = false;
		MergeSort ms = new MergeSort();

		// creating temporary array
		int[] tempArray1 = new int[arr1.length];
		int[] tempArray2 = new int[arr2.length];

		// storing sorted array
		tempArray1 = ms.sort(arr1);
		tempArray2 = ms.sort(arr2);

		for(int i = 0; i < arr1.length; i++){
			if(tempArray1[i] != tempArray2[i]){
				result = false;
				return result;
			}
		}
		result = true;
		return result;
	}

	// function to find the sum of smallest two elements of an array
	public static int findSmallestSum(int[] array){
		int sum;
		// creating temporary array
		int[] sortedArray = new int[array.length];
		InsertionSort is = new InsertionSort();
		// storing sorted array
		sortedArray = is.sort(array);
		// using the last and second last element to get the sum as we have sorted in descending order
		sum = sortedArray[sortedArray.length-1] + sortedArray[sortedArray.length-2];
		return sum;
	}

	// 	public static void main(String[] args) {
	// 	int a [] = {1,55,3,4};
	// 	InsertionSort is = new InsertionSort();
	// 	int result[] = is.sort(a);
	// 	int ans[] = {55,4,3,1};
	// 	for(int i = 0;i < result.length;i++)
	// 		System.out.println(result[i]);
	// 	boolean ab = test(result , ans);
	// 	System.out.println(ab);

	// 	ab = compare(a,ans);
	// 	System.out.println("Compare -- > "+ab);
	// 	int aq = findSmallestSum(ans);
	// 	System.out.println("Smallest -- > "+aq);
	// }
}