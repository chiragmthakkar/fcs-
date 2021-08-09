//==================================
// Foundations of Computer Science
// Student: Chirag M Thakkar
// id: a1806400
// Semester: Semester 1
// Year: 2020
// Program to check the working of the Queue and Stack
//===================================

import java.util.Scanner;
public class Main{
	public static boolean bracketsMatching(String input)
	{
		MyStack ms = new MyStack();
		for(int i = 0; i < input.length(); i++)
		{
			// checking for open brackets, if yes, then push
			if(input.charAt(i) == '{'|| input.charAt(i) =='['|| input.charAt(i) == '(' )
			{
				ms.push(new Node(input.charAt(i)+""));
			}
			// checking for closed brackets if yes, then call checkBrackets()
			else if(input.charAt(i) == ']' || input.charAt(i) == '}' || input.charAt(i) == ')')
				{
					if(ms.isEmpty())
					{
						// if its empty and a closed paranthesis comes then its not matching so return false
						return false;
					}
					// checkBrackets() will compare the popped data and the current inputs
					boolean tcheck = checkBrackets(ms.pop().getData() , (input.charAt(i) + ""));
					if(!tcheck){
						return false;
					}
				}
		}
		// at the end if the stack is empty it means that the brackets are balanced, so return true, if not return false
		if(ms.isEmpty())
		{
			return true;
		}
		else
		{
			return false;
		} 
	}

	public static boolean checkBrackets(String openBrac, String closedBrac){
		// check for the pair of brackets, if its a pair then return true else false
		if(openBrac.equalsIgnoreCase("(") && closedBrac.equalsIgnoreCase(")"))
			return true;
		if(openBrac.equalsIgnoreCase("[") && closedBrac.equalsIgnoreCase("]"))
			return true;
		if(openBrac.equalsIgnoreCase("{") && closedBrac.equalsIgnoreCase("}"))
			return true;
		// if neither of the above conditions is true then its false.
		return false;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Testing bracketsMatching()  " );
		System.out.println("===============================");
		System.out.print("Input : " );
		String inp = in.nextLine();
		boolean op = bracketsMatching(inp);
		System.out.println("Output : "+op);
		System.out.println("===============================");
		System.out.println("Testing reverseQueue()  " );
		System.out.println("===============================");
		MyQueue mq = new MyQueue();
		System.out.print("Please enter elements followed by space ");
		String userIp = in.nextLine();
		String a[] = userIp.split(" ");

		for(int i = 0; i < a.length ; i++){
			mq.enqueue(new Node(a[i]));
		}
		// mq.enqueue(new Node("1"));
		// mq.enqueue(new Node("2"));
		// mq.enqueue(new Node("3"));
		System.out.print("Input: ");
		mq.displayQueue();
		MyQueue t = new MyQueue();
		t = mq.reverseQueue(mq);
		System.out.print("Output: ");
		t.displayQueue();
		System.out.println("===============================");
	}
}