/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Liam Pido
 */

/*
Exercise 22 - Comparing Numbers
Comparing one input to a known value is common enough, but you’ll often need to process a collection of inputs.

Write a program that asks for three numbers. Check first to see that all numbers are different.
If they’re not different, then exit the program. Otherwise, display the largest number of the three.

Example Output

Enter the first number: 1
Enter the second number: 51
Enter the third number: 2
The largest number is 51.

Constraint

Write the algorithm manually. Don’t use a built-in function for finding the largest number in a list.

Challenges

Modify the program so that all entered values are tracked and the user is prevented from entering a number that’s already been entered.
Modify the program so that it asks for ten numbers instead of three.
Modify the program so that it asks for an unlimited number of numbers.
 */

package base;

import java.util.Scanner;

public class App {
    Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        App myApp = new App();

        int firstNum = myApp.readFirstNum();
        int secNum = myApp.readSecNum();
        int thirdNum = myApp.readThirdNum();
        myApp.findLargest(firstNum, secNum, thirdNum);
    }

    public void findLargest(int firstNum, int secNum, int thirdNum) {
        int largest = firstNum;

        if(largest < secNum) {
            largest = secNum;
        }
        if(largest < thirdNum) {
            largest = thirdNum;
        }

        System.out.println("The largest number is " + largest + ".");
    }

    public int readThirdNum() {
        System.out.print("Enter the third number: ");
        String input = in.nextLine();
        int num = Integer.parseInt(input);
        return num;
    }

    public int readSecNum() {
        System.out.print("Enter the second number: ");
        String input = in.nextLine();
        int num = Integer.parseInt(input);
        return num;
    }

    public int readFirstNum() {
        System.out.print("Enter the first number: ");
        String input = in.nextLine();
        int num = Integer.parseInt(input);
        return num;
    }
}
