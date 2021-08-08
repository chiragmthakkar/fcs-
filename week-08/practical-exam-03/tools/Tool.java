//==================================
// Foundations of Computer Science
// Student: Chirag M Thakkar
// id: a1806400
// Semester: Semester 1
// Year: 2020
// Practical Exam Number: 3
//===================================

abstract class Tool implements Asset{
	// stores the weight of the Tool in grams.
	public float weight ;
	// stores the current value of the Tool in cents.
	public float value ;

	public Tool(float weight , float value){
		this.weight = weight;
		this.value = value;
	}

	// Accessor for value
	public float getValue(){
		return this.value;
	}

	// Accessor for weight
	public float getWeight(){
		return this.weight;
	}

	public void setValue(float value){
		value = this.value;
	}

	public void setWeight(float weight){
		weight = this.weight;
	}

	// abstract method (so no body)  useTool; 
	public abstract void useTool(int times);
}