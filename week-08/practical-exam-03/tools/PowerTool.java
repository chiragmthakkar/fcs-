//==================================
// Foundations of Computer Science
// Student: Chirag M Thakkar
// id: a1806400
// Semester: Semester 1
// Year: 2020
// Practical Exam Number: 3
//===================================

abstract class PowerTool extends Tool{
	// represents the power rating of the tool in watts. 
	int power;

	public PowerTool(float weight , float value , int power){
		super(weight, value);
		this.power = power;
	}

	// fn to get power
	public int getPower(){
		return this.power;
	}

}