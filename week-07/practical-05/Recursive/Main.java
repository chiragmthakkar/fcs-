//==================================
// Foundations of Computer Science
// Student: Chirag M Thakkar
// id: a1806400
// Semester: Semester 1
// Year: 2020
// Java Program to execute happy number problem
//===================================

public class Main {
    int nextHappy(int num) { // function returns the next happy number to the provided input
        if (isHappy(num)) {
            num++; // check if the input number is happy
                   // if its happy we move to the next number

        }
        while (!isHappy(num)) { // loop to check for happy number
            num++; // comes out of the loop if happy number is found
        }
        return num;
    }

    private int squareSum(int num) { // method that returns the squared sum of digits
        int sum = 0;
        int tempnum = num;
        while (tempnum > 0) {
            sum += Math.pow(tempnum % 10, 2); // dividing the number by 10 and squaring the remainder and adding it the
                                              // sum
            tempnum = tempnum / 10;
        }
        return sum;

    }

    private boolean isHappy(int num) { // function that checks if a number is happy or not
        if (num == 0) {
            return false;
        }
        int sum;
        boolean result = false;
        sum = num;
        while (sum != 1 && sum != 4) { // loop that recursively checks if the sum of squares of the numbers is 1 or 4
            sum = squareSum(sum); // if the sum is 1, its happy else if it is 4 at some point , it forms an
                                  // infinite loop
                                  // so we return false
        }

        if (sum == 1) {
            result = true;
        } else if (sum == 4) {
            result = false;
        }

        return result;
    }

    String printMultiple(int num, String s) { // method that takes a number and string and return the string count
                                              // number of times
        String temp = "";
        System.out.println("Number : " + num);
        for (int i = 0; i < num; i++) {
            temp = temp + s;
        }
        return temp;
    }

    String decodeString(String s) { // method that returns the decoded string
        String numberString = "";
        String externalString = "";
        String remString = "";
        int counter = 0;
        int i = 0;

        while ((i < s.length()) && s.charAt(i) != '[') { // loop to check if a we encounter [
            if (Character.isDigit(s.charAt(i))) { // check if the character is number
                numberString += s.charAt(i);
            } else if (s.charAt(i) == ']') { // if the character is ], it returns the string before it
                return externalString;
            } else {
                externalString += s.charAt(i); // stores all string charatcers
            }
            i++;
        }

        counter = Integer.parseInt(numberString); // stores the number just before the [ bracket

        if (!Character.isDigit(s.charAt(i - 1))) { // check to see if a number is provided before [ bracket
            counter = 1;
        }

        remString = s.substring(i + 1); // storing all thes strings after [

        return externalString + printMultiple(counter, decodeString(remString)); // recursiverly calling decode on the
                                                                                 // rest of the string and adding with
                                                                                 // current string

    }

}