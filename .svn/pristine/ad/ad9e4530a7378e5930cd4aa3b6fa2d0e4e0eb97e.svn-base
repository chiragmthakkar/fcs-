//==================================
// Foundations of Computer Science
// Student: Chirag M Thakkar
// id: a1806400
// Semester: Semester 1
// Year: 2020
// Java Program to exceute Binary Search Tree
//===================================

class MyBST{
	private Node root; // The reference to the root node in this tree

	// Initialising an empty tree in the constructor.
	public MyBST(){
		this.root = null;
	}

	// Insert a new value into the tree. This method calls insertRec()
	public void insert(int value){
		insertRec(this.root,value);
	}

	// This is a recursive function to insert a new value in the tree.
	private void insertRec(Node current, int value){
		if(current == null){
			this.root = new Node(value);
			return;
		}
		else{
			// if the value is same as the current data
			if(current.getData() == value){
				System.out.println("current data " + current.getData() + "value " +value);
				System.out.println("Node is in the tree");
				return;
			}

			// when only root element is inserted and there are no children
			if(current.getLeft() == null && current.getRight() == null){
				if(value > current.getData()){
					current.setRight(new Node(value));
					return;
				}
				else{
					current.setLeft(new Node(value));
					return;
				}
			}
			else{
				// when the there are no children inn the left side and right has some children
				if(current.getLeft() == null && current.getRight() != null){
					// if value is less then the current data
					if(value < current.getData()){
						// set it to the left side
						current.setLeft(new Node(value));
						return;
					}
					// if the value is greater then the current data, we have to traverese the right -side
					// so call recursive function with root as curent.getRight()
					else insertRec(current.getRight(), value);
				}
				// when the there are no children inn the right side and left has some children
				else if(current.getRight() == null && current.getLeft() != null ){
						// if value is greater then the current data
						if(value > current.getData()){
							// set it to the right side
							current.setRight(new Node(value));
							return;
						}
						// if the value is less then the current data, we have to traverese the left-side
						// so call recursive function with root as curent.getLeft()
						else insertRec(current.getLeft() , value);
				}
			} 

			// when there are no null leaves to the current node then we start traversing
			// if the value to be inserted is less than the current data then we will traverse the left side
			if(value < current.getData()){
				// calling recursive function to insert in the left-side tree
				insertRec(current.getLeft() , value);
			}
			else {
				// calling recursive function to insert in the right-side tree
				insertRec(current.getRight() , value);
			}
			}
		}

	// Pre-order traverse tree and printing
	// public void printPreorder(Node root) {
	// 	// Make sure tree/subtree is not empty 
	// 	if (root != null) {
	// 		// Print root
	// 		System.out.print(root.getData() + " ");

	// 		// Print left subtree
	// 		printPreorder(root.getLeft());
			
	// 		// Print right subtree
	// 		printPreorder(root.getRight());
	// 	}
	// }

	// public void printPreorder() {
	// 	this.printPreorder(this.root);
	// 	System.out.println();
	// }

	//	Search a node in the tree. This method calls searchRec()
	public boolean search(int value){
		boolean ans = searchRec(this.root, value);
		return ans;

	}

boolean searchRecResult = false;
	//Data()s is a recursive function to search a node in the tree.
	private boolean searchRec(Node current, int value){
		try{
			if(current == null){
				searchRecResult = false;
				return searchRecResult;
			}
			else if(current.getData() == value){
				searchRecResult = true;
				return searchRecResult;
			}
			else if(value < current.getData()){
				searchRec(current.getLeft(), value);
			}
			else {
				searchRec(current.getRight(), value);
			}	
		}
		catch(Exception e){
		System.out.println(e + " Exception ");
		}
		
		return searchRecResult;
	}

	public static void main(String[] args) {
		MyBST bs = new MyBST();
		bs.insert(6);
		bs.insert(3);
		bs.insert(8);
		bs.insert(2);
		bs.insert(4);
		// bs.insert(3);
		bs.insert(7);
		bs.insert(9);
		// bs.printPreorder();

		boolean t = bs.search(90);
		System.out.println(t);
	}
}