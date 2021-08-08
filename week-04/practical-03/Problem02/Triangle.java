//==================================
// Foundations of Computer Science
// Student: Chirag Mahendra Thakkar
// id: a1806400
// Semester: Sem01
// Year: 2020
// Program to calculate the area of the triangle 
//===================================

// Triangle is child class and Shape is Parent class
class Triangle extends Shape{

	public double area(double base, double height){
		return 0.5 * base * height;
	}
	// // Main for TESTING purpose only
	// public static void main(String args[]){
	// 	Triangle tr = new Triangle();
	// 	System.out.println("Area: "+tr.area(20,10));
		
	// }
}
