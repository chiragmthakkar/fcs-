//==================================
// Foundations of Computer Science
// Student: Chirag Mahendra Thakkar
// id: a1806400
// Semester: Sem-1
// Year: 2020
// Practical Exam Number:02
//===================================


import java.lang.RuntimeException ;
public class HandlingArrays {

    public static void printArray(double [] testArray) {
          for(int i = 0 ;i < testArray.length ;i ++){
              System.out.print(testArray[i]+" "); // printing the elements of the array.
          }
          System.out.println();
     }

    public static double[] sumElements(double [] firstArray, double [] secondArray) {
          // checking if arrray length is same, if no then error
          if( firstArray.length > secondArray.length ){ 
            throw new RuntimeException("Error - Arrays different shape");
          }
          else{
              double result[] = new double[firstArray.length];
              for(int i = 0 ;i < firstArray.length; i++){
                  result[i] = firstArray[i] + secondArray[i]; // adding two array
              }
              return result;
          }
     }

     public static double[] reverseArray(double [] testArray) {
           int j = testArray.length;
           double temp[] = new double[j]; // creating new temporary array
           j--;
           for(int i = 0 ;i < testArray.length ;i ++){
              temp[j] = testArray[i]; // storing values in the temp array
              j--;
          }
          return temp;
      }
}