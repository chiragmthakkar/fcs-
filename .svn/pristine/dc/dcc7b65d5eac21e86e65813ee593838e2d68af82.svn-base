//==================================
// Foundations of Computer Science
// Student: Chirag M Thakkar
// id: a1806400
// Semester: Semester 1
// Year: 2020
// Java Program to execute Graph Data structure using inbuilt linklist
//===================================

import java.util.LinkedList;
import java.util.Scanner;

public class MyGraph{
	LinkedList<Node> adjListArray[]; 

	public MyGraph(){
		// initiallising null adjacentcy list
		this.adjListArray = null;
	}

	// transform an adjacency matrix to an adjacency list
	public void matrixToList(int[][] matrix){
		this.adjListArray = new LinkedList[matrix.length];
		for(int i = 0; i < matrix.length; i++){
			this.adjListArray[i] = new LinkedList();
			for(int j = 0; j < matrix.length; j++){
				// checking for the edge or connection
				if(matrix[i][j] == 1){
					// adding a new node to the current linklist ie, i-th LL
					adjListArray[i].add(new Node(j));
				}
			}
		}
	}

	// Print out the adjacency list array
	public void displayAdjListArray(){
		for(int i = 0; i < adjListArray.length; i++){
			System.out.print(i + ": ");
			for (int j = 0; j < adjListArray[i].size(); j++) {
				if(j > 0)
					System.out.print(" -> ");
				// in the current(i-th) LL, getting the j-th element and calling print Node fn to print
				adjListArray[i].get(j).printNode();
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		System.out.print("Enter number of vertices: ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] array = new int[n][n];
		System.out.print("Enter 1 - edge.   Enter 0 - no edge");
		for(int i = 0; i < n; i++){
			for (int j = 0; j < n ; j++) {
				System.out.print("Enter weight at "+ i +" "+ j +" : ");
				array[i][j] = in.nextInt();
			}
		}

		MyGraph mg = new MyGraph();
		mg.matrixToList(array);
		mg.displayAdjListArray();
	}
}