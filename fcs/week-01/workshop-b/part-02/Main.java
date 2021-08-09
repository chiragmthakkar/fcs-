import java.util.Scanner;
class Main{
	public static void main(String[] args){

		Scanner input=new Scanner(System.in);

		/*  Workshop B- Part2- Variables and Data Types- Workshop Task.3
		Create all of the primitives (except long and double) with different values. Concatenate them into a string and print it to the screen so it will print: H3110 w0r1d 2.0 true */
		
		char h='H';
		int i=3110;
		char w='w';
		int o=0;
		char r='r';
		int one=1;
		char d='d';
		float f=2.0f;
		boolean b=true;
		System.out.println(""+h+i+" "+w+o+r+one+d+" "+f+" "+b);

		/*  Workshop B- Part2- Variables and Data Types- Workshop Task.3
		Using scanner to get the user input, attribute variables for all the variables data type.*/

		//Take a char as a input from user and display
		System.out.print("Enter a char : ");
		char cUser=input.next().charAt(0); // Takes the 1st character of the input
		System.out.println("You entered char : "+cUser);

		// Take a Integer as a input from user and display
		System.out.print("Enter an Integer value : ");
		int iUser=input.nextInt();
		System.out.println("You entered Integer : "+iUser);

		// Take a float as a input from the user and display
		System.out.print("Enter a float value : ");
		float fUser=input.nextFloat();
		System.out.println("You entered float : "+fUser);

		// Take a double as a input from the user and display
		System.out.print("Enter a double value : ");
		double dUser=input.nextDouble();
		System.out.println("You entered double : "+dUser);

		// Take a long as a input from the user and display
		System.out.print("Enter a long value : ");
		long lUser=input.nextLong();
		System.out.println("You entered long : "+lUser);

		// Output

		/*

		H3110 w0r1d 2.0 true
		Enter a char : d
		You entered char : d
		Enter an Integer value : 23
		You entered Integer : 23
		Enter a float value : 32.02
		You entered float : 32.02
		Enter a double value : 3233
		You entered double : 3233.0
		Enter a long value : 5454354544
		You entered long : 5454354544

		*/

	}
}