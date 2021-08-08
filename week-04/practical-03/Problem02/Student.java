//==================================
// Foundations of Computer Science
// Student: Chirag Mahendra Thakkar
// id: a1806400
// Semester: Sem01
// Year: 2020
// Program to calculate marks and average marks for the Student
//===================================

// Student is child class and Person is parent class
class Student extends Person{
	private double[] marks = new double[5];
	private String[] disciplines = new String[5];

	// Accessors or Getters
	public double[] getMarks(){
		return this.marks;
	}

	public String[] getDisciplines(){
		return this.disciplines;
	}
	
	// Mutators or Setters
	public void setMarks(double[] marks){
		this.marks = marks;
	}

	public void setDisciplines(String[] disciplines){
		this.disciplines = disciplines;
	}

	// METHOD averageMarks
	public double averageMarks( double[] marks){
		double sum = 0;
		double avg = 0;

		for (double i : marks){
			sum += i;
		}
		avg = sum / (marks.length); // calculating average of marks
		return avg;
	}
	// METHOD displayDisciplines
	public void displayDisciplines(String[] disciplines){
		for(int i = 0 ;i < disciplines.length; i++){
			System.out.println(disciplines[i]); // displaying disciplines
		}
	}
	// FOR TESTING PURPOSE ONLY
	// public static void main(String args[]){
	// 	Student s = new Student();
	// 	double ax[] = {100,82,83,69,78}; // marks in each subject
	// 	s.setMarks(ax); // calling Mutator

	// 	// avg 
	// 	double avg = s.averageMarks(ax);
	// 	System.out.println("Average of the marks: "+avg);

	// 	// disciplines or subjects
	// 	String b[] = {"Physics", "Chemistry", "Maths", "History" , "Geography"};
	// 	s.setDisciplines(b); // calling Mutator
	// 	String bx[] = s.getDisciplines(); // calling Accessor
	// 	s.displayDisciplines(bx);

	// }



}




