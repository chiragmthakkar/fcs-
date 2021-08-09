//==================================
// Foundations of Computer Science
// Student: Chirag Mahendra Thakkar
// id: a1806400
// Semester: Sem01
// Year: 2020
// Program to get the details of the Player
//===================================

// Player is the child class
class Player extends Person{
	private int id = 1;
	private int numWins;
	private int numPlayed;
	private static int nextId; // stores next id

	// parameterised constructor
	public Player(String name, int age, int numWins, int numPlayed){
		super(name, age);
		this.nextId++;
		this.id = this.nextId;
		this.numWins = numWins;
		this.numPlayed = numPlayed;
	}

	public void win(){
	 	this.numWins++;
	 	this.numPlayed++;
	}

	public void lose(){
		this.numPlayed++;
	}

	// method to get ranking
	public int getRanking(){
		// 
		if(this.numPlayed == 0)
			return 0;
		else {
			int rank = this.numPlayed * (this.numWins/this.numPlayed);
			return rank;
		}
	}

	// method to get the id of the person
	public int getId(){
		return this.id;
	}

	// method to convert to string
	public String toString(){
		// to call the toString() method of the parent class
		String personDetails = super.toString();
		String t = personDetails + " Id: " + this.id + " Ranking: " + getRanking();
		return t;
	}

}