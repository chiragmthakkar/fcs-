//==================================
// Foundations of Computer Science
// Student: Chirag M Thakkar
// id: a1806400
// Semester: Semester 1
// Year: 2020
// Program to implement working of Node
//===================================
public class Node{
	private String data; // the data saved in this node
	private Node next; // the reference to another node

	public Node(){
		next = null;
	}

	public Node(String data){
		this.data = data;
		this.next = null;
	}

	public String getData(){
		return this.data;
	}

	public void setData(String data){
		this.data = data;
	}

	public Node getNext(){
		return this.next;
	}

	public void setNext(Node next){
		this.next = next;
	}

	public void printNode(){
		//System.out.println("Node data: " + getData());
		System.out.print(getData() + " ");
	}

}