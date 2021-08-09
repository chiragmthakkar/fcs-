//==================================
// Foundations of Computer Science
// Student: Chirag Mahendra Thakkar
// id: a1806400
// Semester: Sem01
// Year: 2020
// Practical Exam Number: Practical-Exam-01
// Program to get the details of any shape
//===================================

class Shape{
 	private double width;
 	private double height;
 	private double radius;
    private double length;
     
    // Basic Constructor
	public Shape(){
        width = 0;
        height = 0;
        radius = 0;
        length = 0;
	}

	// Parametrised Constructor
	public Shape(double width , double height , double radius , double length){
        this.width = width;
        this.height = height;
        this.radius = radius;
        this.length = length;
	}

	// Accessors or Getters
	public double getWidth(){
		return this.width;
	}

	public double getHeight(){
		return this.height;
	}

    public double getRadius(){
		return this.radius;
	}

	public double getLength(){
		return this.length;
	}

	// Mutators or Setters
	public void setWidth(double width){
		this.width = width;
	}

	public void setHeight(double height){
		this.height = height;
    }
    
	public void setRadius(double radius){
		this.radius = radius;
    }
    
	public void setLength(double length){
		this.length = length;
    }
    
    // Main for testing
    // public static void main(String args[]){
    //     Shape a = new Shape();
    //     a.setWidth(11);
    //     a.setHeight(10);
    //     a.setRadius(10);
    //     a.setLength(25);
    //     System.out.println(a.getWidth());
    //     System.out.println(a.getHeight());
    //     System.out.println(a.getRadius());
    //     System.out.println(a.getLength());
    // }



}