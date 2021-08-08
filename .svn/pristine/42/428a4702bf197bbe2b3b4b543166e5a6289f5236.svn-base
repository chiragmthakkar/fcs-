//==================================
// Foundations of Computer Science
// Student: Chirag Mahendra Thakkar
// id: a1806400
// Semester: Sem01
// Year: 2020
// Program to calculate the area of the rectangle with given constraints
//===================================

import java.util.Scanner;
// ReactangleArea is the child class and Rectangle is parent class
class RectangleArea extends Rectangle{
	public int[] read_input(){

	 	Scanner in = new Scanner(System.in);
	 	System.out.println("Input: ");
	 	String temp = in.nextLine();
		String[] dimensions = temp.split("\\s+"); // Splitting the string and storing in the array
		
		int a[] = new int[2];
		a[0] = Integer.parseInt(dimensions[0]);
		a[1] = Integer.parseInt(dimensions[1]);
		return a; // returning array
	}

	public static void main(String[] args) {
		RectangleArea ra = new RectangleArea();
		int a[] = ra.read_input();
		// to check for width greater 1 and height should be less than 1000
		if(a[0] >= 1 && a[1] < 1000){
			ra.setDimensions(a);
			System.out.println("Output");
			ra.display();
			System.out.println(ra.area());	
		}
		else{
			System.out.println("Please enter proper values.");
		}
		

		
	}
}