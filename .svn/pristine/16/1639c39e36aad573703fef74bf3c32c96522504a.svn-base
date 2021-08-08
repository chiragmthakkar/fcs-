/*==================================
Foundations of Computer Science
Student: Chirag Thakkar
id: a1806400
Semester: Sem1
Year: 2020
Practical Exam Number:
===================================*/

class Queue{
	private Node back;
	private Node front;

	// default constructor
	public Queue(){
		this.back = null;
		this.front = null;

	}

	// // parameterised constructor
	// public Queue(){

	// }

	// accessors
	public Node getBack(){
		return this.back;
	}

	public Node getFront(){
		return this.front;
	}

	// mutators
	public void setBack(Node back){
		this.back = back;
	}

	public void setFront(Node front){
		this.front = front;
	}

	// method to add a student in the queue
	void enqueue(Student tmpStudent){
		// for the very 1st element in the queue
		Node temp = new Node(tmpStudent);
		if(getBack() == null){
			setBack(temp);
			setFront(temp);
		}
		else {
			getBack().setNext(temp);
			setBack(temp);
		}
	}

	// fn to check whether the queue is empty or not
	public boolean isEmpty(){
		if(getBack() == null){
			return true;
		}
		else return false;
	}

	// method to remove a student from the queue
	void dequeue(){
		if(isEmpty()){
			System.out.println("Queue is empty");
		}
		else {
			// Queue follows FIFO, so to remove 1st we getFront() and store it in temporary Node
			Node t = getFront();
			setFront(getFront().getNext());

			// while dequeing if the front becomes null ie we have removed the last element then set rear to null
			if(getFront() == null)
				setBack(null);
		}



	}

	// method to print the queue
	void displayQueue(){
		// checking for empty queue
		if(isEmpty()){
			System.out.println("");
		}
		else {
			// Queue follows FIFO, so to display elements we have to get the first
			// and store it in temporary Node
			Node temp = getFront();
			int count = 0;
			// till the temporary node is null we print
			while(temp != null){
				count ++;
				System.out.print("#");
				System.out.print(count);
				System.out.print(" ");

				System.out.print(temp.getInfo().getName() + ", ");
				System.out.print(temp.getInfo().getAge() + "years old, ");
				int tmpPeriod = temp.getInfo().getPeriod();

				if(tmpPeriod == 1){
					System.out.print(tmpPeriod + "st year in Hogwarts");
				}
				else if(tmpPeriod == 2){
					System.out.print(tmpPeriod + "nd year in Hogwarts");
				}
				else if(tmpPeriod == 3){
					System.out.print(tmpPeriod + "rd year in Hogwarts");
				}
				else{
					System.out.print(tmpPeriod + "th year in Hogwarts");
				}
				System.out.println(";");
		
				temp = temp.getNext();  // refering the next Node to the temp
			}
		}


	}
}


