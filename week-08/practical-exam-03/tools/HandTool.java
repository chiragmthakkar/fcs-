//==================================
// Foundations of Computer Science
// Student: Chirag M Thakkar
// id: a1806400
// Semester: Semester 1
// Year: 2020
// Practical Exam Number: 3
//===================================

abstract class HandTool extends Tool{
	boolean sharp = true;

	public HandTool(float weight , float value , boolean sharp ){
		// calling super constructor and using weight and value from the parent class
		super(weight , value);
		this.sharp = sharp;
	}

	// function to check for sharp
	public boolean isSharp(){
		return sharp;
	}

}