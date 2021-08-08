//==================================
// Foundations of Computer Science
// Student: Chirag Mahendra Thakkar
// id: a1806400
// Semester: Sem01
// Year: 2020
// Program to get the details of the Electric bike
//===================================


class ElectricBike extends Bicycle{
	private int battery;
	
	// Basic Constructor
	public ElectricBike(){
		battery = 0;
	}

	// Parameterised Constructor
	public ElectricBike(int battery){
		this.battery = battery;
	}


	// Accessor
	public int getBattery(){
		return this.battery;
	}

	// Mutator
	public void setBattery(int battery){
		this.battery = battery;
	}

	public void chargeBike(){

	}
}