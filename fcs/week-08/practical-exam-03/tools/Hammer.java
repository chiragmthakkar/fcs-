//==================================
// Foundations of Computer Science
// Student: Chirag M Thakkar
// id: a1806400
// Semester: Semester 1
// Year: 2020
// Practical Exam Number: 3
//===================================

class Hammer extends HandTool{
	 public Hammer(float weight , float value){
	 	// calling sharp attribute from the parent class
	 	super(weight, value, false);
	 }

	 public void useTool(int noTimes){
	 	value = value - ((float)(noTimes) * 0.01f);
	 	if(value >= 0){
	 		System.out.println("Bang!");
	 	}
	 	else{
	 		// message 
	 	}
	 }
}