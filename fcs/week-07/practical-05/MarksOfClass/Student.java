//==================================
// Foundations of Computer Science
// Student: Chirag M Thakkar
// id: a1806400
// Semester: Semester 1
// Year: 2020
// Java Program to declare a Student type, its accessors and mutators.
//===================================

public class Student{
	private String name;
	private int physic, chemistry, math;
	private float average;

	public Student(String name, int physic, int chemistry, int math){
		this.name = name;
		this.physic = physic;
		this.chemistry = chemistry;
		this.math = math;
		this.average = (physic + chemistry + math)/3f;
		this.average = Math.round(this.average * 100.0) / 100.0f;
	}

	// Mutator for Name
	public void setName(String name){
		this.name = name;
	}

	// Accessor for name
	public String getName(){
		return this.name;
	}

	// Mutator for Average
	public void setAverage(float average){
		this.average = average;
	}

	// Accessor for average
	public float getAverage(){
		return this.average;
	}

	// Mutator for Math
	public void setMath(int math){
		this.math = math;
	}

	// Accessor for math
	public int getMath(){
		return this.math;
	}

	// Mutator for Physic
	public void setPhysic(int physic){
		this.physic = physic;
	}

	// Accessor for physic
	public int getPhysic(){
		return this.physic;
	}

	// Mutator for Chemistry
	public void setChemistry(int chemistry){
		this.chemistry = chemistry;
	}

	// Accessor for chemistry
	public int getChemistry(){
		return this.chemistry;
	}
}