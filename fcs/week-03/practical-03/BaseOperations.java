//==================================
// Foundations of Computer Science
// Student: Chirag Mahendra Thakkar
// id: a1806400
// Semester: Sem01
// Year: 2020
// Program to create methods in the class
//===================================

import java.util.Scanner;
public class BaseOperations{
	// function definition for integer array
	static void printArray(int [] array){
		for(int i = 0; i < array.length; i ++){
		System.out.print(array[i] + " ");
		}
		System.out.println("");
	};
	// function definition for String array
	static void printArray(String [] array){
		for(int i = 0; i < array.length; i ++){
		System.out.print(array[i] + " ");
		}
		System.out.println("");
	};
	// function definition for Float array
	static void printArray(Float [] array){
		for(int i = 0; i < array.length; i ++){
		System.out.print(array[i] + " ");
		}
		System.out.println("");
	};

	static int [] reverseArray(int [] array){
		int temp[] = new int[array.length];
		int j = array.length - 1;
		for(int i = 0; i < array.length; i ++ ){
			temp[i] = array[j];
			j--;
		}
		return temp; // returning the reverse of the integer function
	};
	 static String [] reverseArray(String [] array){
	 	String temp[] = new String[array.length];
		int j = array.length - 1;

		for(int i = 0; i < array.length; i ++ ){
			temp[i] = array[j];
			j--;
		}
		return temp; // returning the reverse of the String function

	 };

	 static Float [] reverseArray(Float [] array){
	 	Float temp[] = new Float[array.length];
		int j = array.length - 1;

		for(int i = 0; i < array.length; i ++ ){
			temp[i] = array[j];
			j--;
		}
		return temp; // returning the reverse of the Float function
	 };

	public static void main(String[] args) {
		int intArr[] = {1,2,3,4};
		String strArr[] = {"I","am","a","boy"};
		Float fltArr[] = {1.01f,2.01f,3.09f,4.01f};
		printArray(intArr); //calling print function for integer array
		printArray(strArr); //calling print function for String array
		printArray(fltArr); //calling print function for Float array

		int revIntArr[] = reverseArray(intArr);
		printArray(revIntArr);
		String revStrArr[] = reverseArray(strArr);
		printArray(revStrArr);
		Float revFltArr[] = reverseArray(fltArr);
		printArray(revFltArr);
	}
}