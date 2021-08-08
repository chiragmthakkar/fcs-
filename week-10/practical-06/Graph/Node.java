//==================================
// Foundations of Computer Science
// Student: Chirag M Thakkar
// id: a1806400
// Semester: Semester 1
// Year: 2020
// Java Program to exceute a Node
//===================================

public class Node{
	private int index; // the index of this node

	public Node(int index){
		setIndex(index);
	}
	public void setIndex(int index){
		this.index = index;
	}
	public int getIndex(){
		return this.index;
	}

	// Print the data (the index) saved in the node. 
	public void printNode(){
		System.out.print("Node " + this.index);
	}
}