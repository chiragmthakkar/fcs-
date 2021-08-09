//==================================
// Foundations of Computer Science
// Student: Chirag M Thakkar
// id: a1806400
// Semester: Semester 1
// Year: 2020
// Java Program to illustrate reading from Text File 
// using Scanner Class 
//===================================

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
  // method that reads students names from file and stores it in a list of type student

  private static Student[] readData(String filename) {
    File file = new File(filename);
    int fileSize = 0;

    Scanner sc;

    try {
      sc = new Scanner(file);
      // counting the no of elements
      while (sc.hasNextLine()) { 
        sc.nextLine();
        fileSize++;

      }
      sc.close();
      }
    catch (Exception e) {
      System.out.println("File read error");
    }

    Student[] studentList = new Student[fileSize];

    try {
      int studentListCounter = 0;
      sc = new Scanner(file);
      while (sc.hasNextLine()) {
        String[] tempArray = sc.nextLine().split(" ", 4);
        if (tempArray.length == 4) {
          // reading a line from file and storing in the student object
          Student s = new Student(tempArray[0], Integer.parseInt(tempArray[1]), Integer.parseInt(tempArray[2]), Integer.parseInt(tempArray[3]));
          // saving the student object in the list of students
          studentList[studentListCounter] = s; 
          studentListCounter++;
        }
      }
      sc.close();
    }
    catch (FileNotFoundException e) {
      System.out.println("File read error");
      e.printStackTrace();
    }

    return studentList;

  }

  // method to print student details
  public static void printStudents(Student[] students) { 
    System.out.println("Student    AverageScore   Physic    Chemistry     Maths");
    for (int i = 0; i < students.length; i++) {
      if (students[i] != null) {
        System.out.print(students[i].getName());
        System.out.print("         " + students[i].getAverage());
        System.out.print("          " + students[i].getPhysic() + "   ");
        System.out.print("      " + students[i].getChemistry() + "    ");
        System.out.print("      " + students[i].getMath());
        System.out.println();

      }
    }
  }

  public Student[] sortStudents(Student[] students) {

    // sorting based on the average marks of the student
    for (int i = 0; i < students.length; i++) {
      int marker = i;
      // System.out.println("i = "+i);
      while (marker > 0 && students[marker - 1].getAverage() < students[marker].getAverage()) {
        Student temp = students[marker - 1];
        students[marker - 1] = students[marker];
        students[marker] = temp;
        marker = marker - 1;

      }
    }

    // sorting based on the physics marks of the student if their average marks are same

    for (int i = 0; i < students.length; i++) {
      if ((i > 0 && i - 1 < students.length) && students[i].getAverage() == students[i - 1].getAverage()) {
        int marker = i;
        float checkValue = students[i].getAverage();
        // System.out.println("i = "+i);
        while ((marker > 0 && students[marker].getAverage() == checkValue
            && students[marker - 1].getAverage() == checkValue)
            && students[marker - 1].getPhysic() < students[marker].getPhysic()) {
          Student temp = students[marker - 1];
          students[marker - 1] = students[marker];
          students[marker] = temp;
          marker = marker - 1;
        }

      }
    }

    // sorting based on the chemistry marks of the student if their physics marks are same
    // sorting based on the average marks of the student
    for (int i = 0; i < students.length; i++) { 
      if ((i > 0 && i - 1 < students.length) && students[i].getPhysic() == students[i - 1].getPhysic()) {
        int marker = i;
        float checkValue = students[i].getPhysic();
        while ((marker > 0 && students[marker].getPhysic() == checkValue
            && students[marker - 1].getPhysic() == checkValue)
            && students[marker - 1].getChemistry() < students[marker].getChemistry()) {
          Student temp = students[marker - 1];
          students[marker - 1] = students[marker];
          students[marker] = temp;
          marker = marker - 1;
        }

      }
    }

    // sorting based on the maths marks of the student if their chemistry marks are same
    for (int i = 0; i < students.length; i++) {
      if ((i > 0 && i - 1 < students.length) && students[i].getChemistry() == students[i - 1].getChemistry()) {
        int marker = i;
        float checkValue = students[i].getChemistry();
        while ((marker > 0 && students[marker].getChemistry() == checkValue
            && students[marker - 1].getChemistry() == checkValue)
            && students[marker - 1].getMath() < students[marker].getMath()) {
          Student temp = students[marker - 1];
          students[marker - 1] = students[marker];
          students[marker] = temp;
          marker = marker - 1;
        }

      }
    }

    // sorting the students by their name if their maths marks are same
    for (int i = 0; i < students.length; i++) {
      if ((i > 0 && i - 1 < students.length) && students[i].getMath() == students[i - 1].getMath()) {
        int marker = i;
        float checkValue = students[i].getMath();
        while ((marker > 0 && students[marker].getMath() == checkValue
            && students[marker - 1].getMath() == checkValue)
            && students[marker - 1].getName().compareTo(students[marker].getName()) < 0) {
          Student temp = students[marker - 1];
          students[marker - 1] = students[marker];
          students[marker] = temp;
          marker = marker - 1;
        }

      }
    }

    return students;
  }
  public static void main(String[] args) {
    Student[] s = readData("students.txt");
    printStudents(s);

    Student[] sortedS = sortStudents(s);
    printStudents(sortedS);    
  }
}
