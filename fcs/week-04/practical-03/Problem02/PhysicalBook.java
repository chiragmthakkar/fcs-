//==================================
// Foundations of Computer Science
// Student: Chirag Mahendra Thakkar
// id: a1806400
// Semester: Sem01
// Year: 2020
// Program to get the details of the Physical book
//===================================

// Physical Book is a child class and Book is a Parent class
class PhysicalBook extends Book
{
	private int shelf;
	private int aisle;
	private int floor;

	// Basic Constructor
	public PhysicalBook(){
		shelf = 0;
		aisle = 0;
		floor = 0;
	}

	// Parameterised Constructor
	public PhysicalBook(int shelf, int aisle, int floor){
		this.shelf = shelf;
		this.aisle = aisle;
		this.floor = floor;
	}

	// Accessor
	public int getShelf(){
		return this.shelf;
	}

	public int getAisle(){
		return this.aisle;
	}

	public int getFloor(){
		return this.floor;
	}

	// Mutator
	public void setShelf(int shelf){
		this.shelf = shelf;
	}

	public void setAisle(int aisle){
		this.aisle = aisle;
	}

	public void setFloor(int floor){
		this.floor = floor;
	}

	// METHOD
	public void displayBookLocation(){
		System.out.println("Shelf: "+this.shelf);
		System.out.println("Aisle: "+this.aisle);
		System.out.println("Floor: "+this.floor);
	}

	// // ONLY FOR TESTING 
	// public static void main(String[] args)
	// {
	// 	PhysicalBook pb = new PhysicalBook();
	// 	pb.setShelf(12);
	// 	pb.setAisle(66);
	// 	pb.setFloor(88);

	// 	pb.displayBookLocation();

	// }
}