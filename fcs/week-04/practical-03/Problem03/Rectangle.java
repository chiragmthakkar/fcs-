//==================================
// Foundations of Computer Science
// Student: Chirag Mahendra Thakkar
// id: a1806400
// Semester: Sem01
// Year: 2020
// Program to calculate the area of the Recatangle
//===================================

// Rectangle is a child class and Shape is parent class
class Rectangle extends Shape{
	private int width;
	private int height;
	
	// Mutators or Setters
	public void setDimensions(int[] dimensions){
		width = dimensions[0];
		height = dimensions[1];
	}
	
	//METHOD display
	public void display(){
		System.out.println(this.width + " " + this.height);
	}
	// METHOD area
	public int area(){
		return this.width * this.height;
	}

}
