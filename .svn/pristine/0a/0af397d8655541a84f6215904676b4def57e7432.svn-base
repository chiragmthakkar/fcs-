//==================================
// Foundations of Computer Science
// Student: Chirag Mahendra Thakkar
// id: a1806400
// Semester: Sem01
// Year: 2020
// Program to perform the arithmetic operations of a complex number.
//===================================

import java.lang.*;
import java.util.*;
import java.util.Scanner;
public class ComplexCalculator{
	public static String sum(String first, String second){
		String a[] = first.split("\\+|i"); //spliting the complex number into real and imaginary parts and storing them in an array for the 1st complex number
		String b[] = second.split("\\+|i"); //spliting the complex number into real and imaginary parts and storing them in an array for the 2nd complex number
		int real = Integer.parseInt(a[0]) + Integer.parseInt(b[0]); // adding the real parts
		int img = Integer.parseInt(a[1]) + Integer.parseInt(b[1]); // adding the imaginary parts
		String temp = real + " + " + img + "i"; // Concatinating the addition of real and imaginary parts
		return temp;
	};

	public static String subtract(String first, String second){
		String a[] = first.split("\\+|i"); //spliting the complex number into real and imaginary parts and storing them in an array for the 1st complex number
		String b[] = second.split("\\+|i"); //spliting the complex number into real and imaginary parts and storing them in an array for the 2nd complex number
		int real = Integer.parseInt(a[0]) - Integer.parseInt(b[0]); // adding the real parts
		int img = Integer.parseInt(a[1]) - Integer.parseInt(b[1]); // adding the imaginary parts
		String temp = real + " + (" + img + ") i"; // Concatinating the addition of real and imaginary parts
		return temp; // returning the resultant complex number
	};

	public static String multiply(String first, String second){
		String a[] = first.split("\\+|i"); //spliting the complex number into real and imaginary parts and storing them in an array for the 1st complex number
		String b[] = second.split("\\+|i"); //spliting the complex number into real and imaginary parts and storing them in an array for the 2nd complex number
		
		// Concatinating the addition of real and imaginary parts
		String temp = (Integer.parseInt(a[0]) * Integer.parseInt(b[0]) - Integer.parseInt(a[1]) * Integer.parseInt(b[1]) ) + "+" + ((Integer.parseInt(a[0]) * Integer.parseInt(b[1])) + (Integer.parseInt(a[1])*Integer.parseInt(b[0])))+"i"; 
		return temp; // returning the resultant complex number
	};

	public static String divide(String first, String second){
		String a[] = first.split("\\+|i"); //spliting the complex number into real and imaginary parts and storing them in an array for the 1st complex number
		String b[] = second.split("\\+|i"); //spliting the complex number into real and imaginary parts and storing them in an array for the 2nd complex number
		Float denominator = (Float.parseFloat(b[0]) * Float.parseFloat(b[0])) + (Float.parseFloat(b[1]) * Float.parseFloat(b[1])); // calculating the denominator
		Float realNum = (Float.parseFloat(a[0]) * Float.parseFloat(b[0])) + (Float.parseFloat(a[1]) * Float.parseFloat(b[1])); // calculating the numerator of the real part
		Float real = realNum / denominator; //calculating the real part of the result
		Float imgNum = ((Float.parseFloat(b[0]) * Float.parseFloat(a[1])) - (Float.parseFloat(a[0]) * Float.parseFloat(b[1]))); // calculating the numerator of the imaginary part
		Float img = imgNum / denominator; //calculating the imaginary part of the result
		String temp = real + " + " + img + "i";
		return temp; // returning the resultant complex number
	};

	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		// taking complex number as input from the user
		System.out.print("Enter the 1st number : ");
		String first = in.next();
		System.out.print("Enter the 2nd number : ");
		String second = in.next();

		// asking for operaation to be performed
		System.out.println("Enter the option to perform the operation :\n a. Add\n b. Subtract\n c. Multiplication\n d. Division");
		System.out.print("Option : ");
		char option = in.next().charAt(0);
		if (option == 'a'){
			String temp = sum(first , second); // calling the method sum
			System.out.println(temp);
		}
		else if(option == 'b'){
			String temp = subtract(first , second); // calling the method subtract
			System.out.println(temp);	
		}
		else if(option == 'c'){
			String temp = multiply(first , second); // calling the method multiply
			System.out.println(temp);	
		}
		else if(option =='d'){
			String temp = divide(first , second); // calling the method divide
			System.out.println(temp);		
		}
		else System.out.println("Please select right option");
	}
}