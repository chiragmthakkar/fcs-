//==================================
// Foundations of Computer Science
// Student: Chirag Mahendra Thakkar
// id: a1806400
// Semester: Semester 1
// Year: 2020
// Practical Number: 04
// Program to find the number of handshakes in a party. 
//===================================
import java.util.Random;

class ShakingParty{
	// number of people in the party.
	private int nPeople;
	// count of the handshakes
	private int count;

	public ShakingParty(){

		// randomly generating number of people in the party.
		Random r = new Random();
		// an integer number from 0-9 will be generated.
		this.nPeople = r.nextInt(10); 
		// calling the countHandShakes function
		this.count = countHandShakes(this.nPeople); 
		
		// Displaying number of people and the handshakes
		System.out.println("Number of people : " + this.nPeople);
		System.out.println("Number of handshakes : " + this.count);
	}

	public ShakingParty(int nTmp){

		// as asked in the program adding nTmp with the number of people in the party
		this.nPeople = nTmp + this.nPeople;
		// calling the countHandShakes function
		this.count = countHandShakes(this.nPeople);

		// Displaying number of people and the handshakes
		System.out.println("Number of people : " + this.nPeople);
		System.out.println("Number of handshakes : " + this.count);
	}

	public int countHandShakes(int no){
		if(no == 0) // base condition for 0 people 
			this.count = 0;
		else
			this.count = (no -1) + countHandShakes(no-1); // calling the countHandShakes function recursively.
		// returning the count of the handshakes
		return this.count;
	}
}