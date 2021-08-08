//==================================
// Foundations of Computer Science
// Student: Chirag M Thakkar
// id: a1806400
// Semester: Semester 1
// Year: 2020
// Program to implement working of Stack
//===================================

public class MyStack{
	private Node top;

	public Node getTop(){
		return this.top;
	}

	public void setTop(Node top){
		this.top = top;
	}

	// You should initialise an empty stack in the constructor.
	public MyStack(){
		Node n = new Node();
	}

	// function to push or insert the an element in the stack
	public void push(Node node){
		node.setNext(getTop());
		node.setData(node.getData());
		setTop(node);
	}

	// function to pop or remove the top most element in the stack
	public Node pop(){
		// Storing the top node (LIFO) of the stack in temp
		Node temp = getTop();
		
		if(getTop() == null){
			System.out.println("Stack is empty.");	
			return temp;
		}
		else{
			setTop(getTop().getNext());	
		}
		return temp;
	} 

	// function to get the top node in this stack. 
	public Node peek(){
		if(getTop() == null){
			System.out.println("Stack is empty.");	
			return null;
		}
		return getTop();
	}

	// function to print stack values
	public void print() {
	// Check if it's empty
	if (getTop() == null) {
		System.out.println("Stack is empty.");
	}
	else {
		Node tmp = getTop();
		while(tmp != null) {
			System.out.println(tmp.getData());
			tmp = tmp.getNext();
		}
		System.out.println();
	}
	}

	// function to check if the stack is empty or not
	public boolean isEmpty(){
		if(getTop() == null){
			return true;
		}
		return false;
	}

	// public static void main(String[] args) {
	// 	MyStack ms =new MyStack();
		
	// 	// ms.push(new Node("10"));
	// 	// ms.push(new Node("100"));
	// 	ms.peek();
	// 	ms.push(new Node("101"));
	// 	ms.peek();
	// 	// ms.print();
	// 	// System.out.println("After popping");
	// 	while(!ms.isEmpty()){
	// 		ms.pop();	
	// 	}
		
	// 	//ms.pop();
	// 	ms.print();
		

	// }
}