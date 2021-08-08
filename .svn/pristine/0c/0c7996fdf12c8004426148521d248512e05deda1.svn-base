//==================================
// Foundations of Computer Science
// Student: Chirag Mahendra Thakkar
// id: a1806400
// Semester: Sem01
// Year: 2020
// Program to calculate salary and annual salary for the Lecturer
//===================================

// Lecturer is child class and Person is parent class
class Lecturer extends Person {
    private double salary ;
    private String[] disciplines;

    // Accessors or Getters
	public double getSalary(){
		return this.salary;
	}

	public String[] getDisciplines(){
		return this.disciplines;
	}
	
	// Mutators or Setters
	public void setSalary(double salary){
		this.salary = salary;
	}

	public void setDisciplines(String[] disciplines){
		this.disciplines = disciplines;
	}

    // METHOD annualSalary 
    public double annualSalary(){
        double annualSalaryCal = 12 * this.salary;
        return annualSalaryCal;
    }

    public void displayDisciplines(String[] disciplines){
        System.out.println("Disciplines are as follows: ");
        for(int i = 0 ;i < disciplines.length; i++){
            System.out.println(disciplines[i]); // displaying disciplines
        }
    }

 //   Main for TESTING OLY
    public static void main(String args[]){
        Lecturer l = new Lecturer();
        double lecSalary = 50000;
        l.setSalary( lecSalary ); // setting salary as 50000
        String[] userDisciplines = { "Physics" , "Chemsitry" , "Biology" , "History" , "Geography" };
        l.setDisciplines( userDisciplines ); // setting disciplines
        System.out.println("Salary: " + l.getSalary()); // getting annual salary 
        String[] disp = l.getDisciplines(); // getting disciplines
        System.out.println("Annual Salary: " + l.annualSalary()); // calling function annualSalary
    }
}