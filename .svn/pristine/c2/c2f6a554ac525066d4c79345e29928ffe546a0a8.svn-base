//==================================
// Foundations of Computer Science
// Student: Chirag Mahendra Thakkar
// id: a1806400
// Semester: Sem-1
// Year: 2020
// Practical-04
// This class represents Computer (Player 2)
//===================================

import java.util.Random;
// Computer is the child class and Player is parent class
class Computer extends Player{
	
	// Basic Constructor
	public Computer(){
		// using setName function from parent class 
		setName("Computer"); 
	}

	// Parameterized Constructor
	public Computer(String name){
		setName(name);
	}

	// Over-ridden function from Player to perform move for computer
	public String performMove(){
		// defining Random object
		Random r = new Random();
		// taking Random numbers from 0-2(exclusive 3)
		int number = r.nextInt(3);
		String cMove = "";

		if(number == 0){
			cMove = "Rock";
		}
		else if(number == 1){
			cMove = "Paper";
		}
		else if(number == 2){
			cMove = "Scissor";
		}
		// retrning computers Move
		return cMove;
	}
}