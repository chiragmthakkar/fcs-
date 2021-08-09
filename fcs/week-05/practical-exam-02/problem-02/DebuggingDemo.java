//==================================
// Foundations of Computer Science
// Student: Chirag Mahendra Thakkar
// id: a1806400
// Semester: Sem-1
// Year: 2020
// Practical Exam Number:02
//===================================

public class DebuggingDemo {

    public void bugMethod() {
         int num[] = {1, 2, 3, 4}; // here the array is of length 4
         // previously we trying to print the element in the array at position 5, but that position is empty & hence there was the error.
         System.out.println(num[3]); // here instead of position 5, we are printing the value of the array at position 3
     }

    public float bugMethod2() { 
            float ans = 0.0f; // the value is stored in variable ans which is of type float
            System.out.println("This method had a bug!");
            return ans;
     }

}