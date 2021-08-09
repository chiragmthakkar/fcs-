import java.util.Scanner;
class test{
	public static void main(String args[]){
	 	Scanner in = new Scanner(System.in);
	 	System.out.println("Enter width and height: ");
	 	String temp = in.nextLine();
		String[] dimensions = temp.split("\\s+");
		int width = Integer.parseInt(dimensions[0]);
		int height = Integer.parseInt(dimensions[1]);


	}
}