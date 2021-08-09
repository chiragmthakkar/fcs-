//==================================
// Foundations of Computer Science
// Student: Chirag M Thakkar
// id: a1806400
// Semester: Semester 1
// Year: 2020
// Practical Exam Number: 3
//===================================

class PowerDrill extends PowerTool{

	// Constructor
	public PowerDrill(float weight , float value){
		super(weight , value , 800);
	}

	public void useTool(int noTimes){
	 	value = value - ((float)(noTimes) * 0.03f);
	 	if(value >= 0){
	 		System.out.println("Zssh!");
	 	}
	 	else{
	 		// message
	 	}
	 }
}