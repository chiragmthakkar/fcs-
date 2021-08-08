//==================================
// Foundations of Computer Science
// Student: Chirag Mahendra Thakkar
// id: a1806400
// Semester: Sem-1
// Year: 2020
// Practical-04
// This class checks whether the move made by the player is a valid one or not
//===================================

import java.util.Scanner;
class Refree{
	int hScore, cScore, tie = 0;
	String hMove = "" ;
	String cMove = "" ;

	// this function decides who won
	public void movePoint(String player1, String player2, String cMove, String hMove){
		// in case of tie
		if(cMove == hMove){
			tie +=1;
			System.out.println("It's a tie !");
		}
		else if(hMove == "Rock" && cMove == "Scissor"){
			hScore += 1;
			System.out.println(player2 + " wins");
		}
		else if(hMove == "Paper" && cMove == "Rock"){
			hScore += 1;
			System.out.println(player2 + " wins");
		}
		else if(hMove == "Scissor" && cMove == "Paper"){
			hScore += 1;
			System.out.println(player2 + " wins");
		}
		else if(cMove == "Rock" && hMove == "Scissor"){
			cScore += 1;
			System.out.println(player1 + " wins");
		}
		else if(cMove == "Paper" && hMove == "Rock"){
			cScore += 1;
			System.out.println(player1 + " wins");
		}
		else if(cMove == "Scissor" && hMove == "Paper"){
			cScore += 1;
			System.out.println(player1 + " wins");
		}
	}

	// this function displays the score
	public void displayScore(String player1 , String player2){
		System.out.println(player1 + ": " + hScore + " " + player2 + ": " + cScore + " Tie: " + tie);
	}

	public Refree(){
		// using Polymorphism creating Human and Computer objects
		Player h = new Human();
		Player c = new Computer();

		// to keep the loop on we assign it to true
		while (h.isValid){

			// getting human move and saving it
			h.setMove(h.performMove());	

			// checking if the human move is valid or not
			if (h.getMove() == "Rock" || h.getMove() == "Paper" || h.getMove() == "Scissor"){
				c.setMove(c.performMove());

				// Printing player name and moves
				System.out.println(h.getName() + ": " + h.getMove());
				System.out.println(c.getName() + ": " + c.getMove());
				
				// to check who won
				movePoint(c.getName(), h.getName(), c.getMove() , h.getMove()); 
				
				// to display the score
				displayScore(h.getName() , c.getName());
				System.out.println();
			}

			// checking if the human wants to quit
			else if(h.getMove() == "Quit"){
				System.out.println("Thankyou for playing " + h.getName() + " !");
				// to break the loop we need to assign as false
				h.isValid = false;
			}

			// checking for invalid input
			else{
				System.out.println("Please enter valid input\n");	
			}
		}
	}
}