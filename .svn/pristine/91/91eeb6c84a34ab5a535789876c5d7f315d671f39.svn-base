//==================================
// Foundations of Computer Science
// Student: Chirag M Thakkar
// id: a1806400
// Semester: Semester 1
// Year: 2020
// Program to implement working of queue
//===================================

public class MyQueue{
	private Node front, rear; // The reference to the first and last node in this queue

	public MyQueue(){
		this.front = null;
		this.rear = null;
	} 

	// accessors and mutators
	public Node getFront(){
		return this.front;
	}

	public void setFront(Node front){
		this.front = front;
	}

	public Node getRear(){
		return this.rear;
	}

	public void setRear(Node rear){
		this.rear = rear;
	}

	// fn to insert one node at the end of the queue.
	public void enqueue(Node node){
		// for the very 1st element in the queue
		if(getRear() == null){
			setRear(node);
			setFront(node);
		}
		else {
			getRear().setNext(node);
			setRear(node);
		}

	}

	// fn to Get and remove the front node from the queue. 
	// Returns Null and print "Queue is empty" when the queue is empty
	public String dequeue(){
		if(isEmpty()){
			System.out.println("Queue is empty");
			return null;
		}
		else {
			// Queue follows FIFO, so to remove 1st we getFront() and store it in temporary Node
			Node t = getFront();
			setFront(getFront().getNext());

			// while dequeing if the front becomes null ie we have removed the last element then set rear to null
			if(getFront() == null)
				setRear(null);

			return t.getData();
		}
		
	}

	// fn to check whether the queue is empty or not
	public boolean isEmpty(){
		if(getRear() == null){
			return true;
		}
		else return false;
	}

	// fn to printout data from the queue from 1st to last
	public void displayQueue(){
		// checking for empty queue
		if(isEmpty()){
			System.out.println("Queue is empty");
		}
		else {
			// Queue follows FIFO, so to display elements we have to get the first
			// and store it in temporary Node
			Node temp = getFront();

			// till the temporary node is null we print
			while(temp != null){
				temp.printNode();  // calling printNode() to print the data
				temp = temp.getNext();  // refering the next Node to the temp
			}
		System.out.println("");	
		}
	}

	public static MyQueue reverseQueue(MyQueue queue){
		// creating a stack
		MyStack tempStack = new MyStack();

		// emptying the passed queue
		while(!queue.isEmpty()){
			tempStack.push(new Node(queue.dequeue()));	// pushing the dequeued Node from the queue to the stack
		}
		// creating a queue which will contain reverese elements
		MyQueue revQueue = new MyQueue();
		
		// checking for the top of the stack, if its null then it means that the stack is empty
		while(tempStack.getTop() != null){
			// popping the last element from the stack (LIFO) and inserting it into the queue which stores reverse
			revQueue.enqueue(new Node(tempStack.pop().getData()));	
			
		}
		return revQueue;
	}

	// public static void main(String[] args) {
	// 	MyQueue mq = new MyQueue();
	// 	System.out.println("=========================== ");
	// 	System.out.println("Initially ");
	// 	System.out.println("=========================== ");
	// 	mq.displayQueue();
	// 	mq.enqueue(new Node("1"));
	// 	mq.enqueue(new Node("2"));
	// 	mq.enqueue(new Node("3"));
		
	// 	System.out.println("=========================== ");
	// 	System.out.println("After enqueue ");
	// 	System.out.println("=========================== ");
	// 	mq.displayQueue();
	// 	// mq.dequeue();
	// 	// mq.dequeue();
	// 	// mq.dequeue();
		
	// 	System.out.println("=========================== ");
	// 	System.out.println("After dequeue : ");
	// 	System.out.println("=========================== ");
	// 	mq.displayQueue();
	// 	System.out.println("=========================== ");
	// 	System.out.println("=========================== ");
	// 	MyQueue t = new MyQueue();
	// 	t = reverseQueue(mq);
	// 	t.displayQueue();

	// }
}