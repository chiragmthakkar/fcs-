//==================================
// Foundations of Computer Science
// Student: Chirag Mahendra Thakkar
// id: a1806400
// Semester: Semester 1
// Year: 2020
// Practical Number: 04
// Program to find the number of handshakes between couples in a party. 
//===================================

import java.util.Random;
class ShakingPartyConstrained{
	// number of couples in the party
	private int nCouples;
	private int count;

	public ShakingPartyConstrained(){
		// randomly generating number of couples in the party.
		Random r = new Random();
		// an integer number from 0-9 will be generated.
		this.nCouples = r.nextInt(10); 

		/* considering that there can be 3 handshakes between two couples as per the example given, 
		so for every couple represented single handshake there will 3 internal handshake, therefore we multiply it by 3 */
		this.count = 3 * countHandShakes(this.nCouples);

		System.out.println("Number of couples : " + this.nCouples);
		System.out.println("Number of handshakes : " + this.count);

	}

	public ShakingPartyConstrained(int nTmp){
		this.nCouples = nTmp + this.nCouples;

		/* considering that there can be 3 handshakes between two couples as per the example given, 
		so for every couple represented single handshake there will 3 internal handshake, therefore we multiply it by 3 */
		this.count = 3 * countHandShakes(this.nCouples);

		System.out.println("Number of couples : " + this.nCouples);
		System.out.println("Number of handshakes : " + this.count);
	}

	public int countHandShakes(int no){
		if(no == 0) // base condition for 0 couple 
			this.count = 0;
		else
			this.count = (no -1) + countHandShakes(no-1); // calling the countHandShakes function recursively.
		// returning the count of the handshakes
		return this.count;
	}
}