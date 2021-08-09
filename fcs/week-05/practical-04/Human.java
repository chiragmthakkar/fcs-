//==================================
// Foundations of Computer Science
// Student: Chirag Mahendra Thakkar
// id: a1806400
// Semester: Sem-1
// Year: 2020
// Practical-04
// This class represents Human (Player 1)
//===================================

import java.util.Scanner;
// Human is the child class and Player is parent class
class Human extends Player{
	Scanner in = new Scanner(System.in);

	// Basic Constructor
	public Human(){
		System.out.println("Welcome to RPS ! ");
		System.out.print("Enter your name: ");
		setName(in.next());
	}

	// Parameterized Constructor
	public Human(String name){
		setName(name);
	}

	// Over-ridden function from Player to perform move for human
	public String performMove(){
		System.out.println("Enter r - Rock , p - Paper , s - Scissor , q - Quit");
		// taking 1st character as input
		String hMove = "";
		String str = System.console().readLine();
		if (str.length() == 1){
			char uInput = str.charAt(0);
			if(uInput == 'r'|| uInput == 'R'){
				hMove = "Rock";
			}
			else if(uInput == 'p' || uInput == 'P'){
					hMove = "Paper";
				}
				else if(uInput == 's' || uInput == 'S'){
						hMove = "Scissor";
					}
					else if(uInput == 'q' || uInput =='Q'){
							hMove = "Quit";
						}
		}
		else hMove = str;

		// returning human move
		return hMove;



	
	}
}