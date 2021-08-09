//==================================
// Foundations of Computer Science
// Student: Chirag M Thakkar
// id: a1806400
// Semester: Semester 1
// Year: 2020
// Java Program to exceute a Node
//===================================
public class Node {

private int data; // the data saved in this node
private Node left; // the reference to its left child
private Node right; // the reference to its right child

public Node(int data){
	this.data = data;
	this.left = this.right = null;
}
void setData(int data){
	this.data = data;
}

public int getData(){
	return this.data;
}

void setLeft(Node left){
	this.left = left;
}

public Node getLeft(){
	return this.left;
}

void setRight(Node right){
	this.right = right;
}

public Node getRight(){
	return this.right;
}

// fn to print Node
public void printNode(){
	System.out.println("Node data: " + getData());
}


// Example output for printNode():
// Node data: "<data saved in this node>"
}