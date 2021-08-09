//==================================
// Foundations of Computer Science
// Student: Chirag Mahendra Thakkar
// id: a1806400
// Semester: Sem01
// Year: 2020
// Practical Exam Number: Practical-Exam-01
// Program to get the area of the rectangle
//===================================

// Rectangle is a child class and Shape is a Parent class
class Rectangle extends Shape{

	public double area(double length, double height){
		return length * height;
	}
	// //Main for TESTING only
	// public static void main(String args[]){
	// 	Rectangle r = new Rectangle();
	// 	System.out.println("Area: "+r.area(10,20));
	// }
}
