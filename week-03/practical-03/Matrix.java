import java.util.Scanner;
public class Matrix{
    // declaring method to calculate determinant for order 2
    public static int order2determinant(int a[][]){
        int determinant = ((a[0][0])*(a[1][1]))-((a[0][1])*(a[1][0]));
        return determinant;
    }

    // declaring method to calculate determinant for order 3
    public static int order3determinant(int a[][]){
        int determinant = ((a[0][0])*(a[1][1])*(a[2][2])) + ((a[0][1])*(a[1][2])*(a[2][0])) + ((a[0][2])*(a[1][0])*(a[2][1])) - ((a[0][2])*(a[1][1])*(a[2][0])) - ((a[0][1])*(a[1][0])*(a[2][2])) - ((a[0][0])*(a[1][2])*(a[2][1]));
        return determinant;
    }

    public static void main(String args[]){
    System.out.println("Welcome to Matrix Determinant Calculator!");
    System.out.println("Would you like to calculate the determinant of a new matrix?");
    System.out.println("1. Yes\n2. No");
    System.out.print("Option : ");
    Scanner in = new Scanner(System.in);
    int option = in.nextInt();

    System.out.println("What is the dimension of the matrix ? ");
    System.out.println("1. 2*2\n2. 3*3 ");
    System.out.print("Option : ");
    int orderInput = in.nextInt();
    System.out.println("Great ! Let's calculate this determinant then. ");
    System.out.println("Please insert all the values for your matrix ");
    int order = 0;
    if (orderInput == 1)
    {
        order = 2;
    }
    else if (orderInput == 2)
    {
        order = 3;
    }
    // declaring array of the order
    int a[][] = new int [order][order];
    for(int i = 0;i < order;i ++){
        for(int j = 0;j < order;j++){
            System.out.print("Enter " + i + " " + j + " element "); // taking inputs from the user
            a[i][j]=in.nextInt();
        }
    }
    System.out.println("The determinant of your matrix is : ");
    // printing the determinant array
    for(int i = 0;i < order;i ++){
        System.out.print("| ");
        for(int j = 0;j < order;j++){
            System.out.print(" "+a[i][j]);
        }
        System.out.print("|\n");
    }
    int determinant = 0;
    if (order == 2){
        determinant = order2determinant(a); // calling method to calculate determinant for order 2
    }
    else if (order == 3)
    {
     determinant = order3determinant(a); // calling method to calculate determinant for order 3
    }

    System.out.println("Determinant : "+ determinant);
    


    }
}