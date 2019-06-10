/*
Kevin C. Tofel
CIS112 - Week 1

 */

package com.company.kctofel;

import java.util.Random;
import java.util.Scanner;

public class ArraySkills {


    public static void main(String[] args) {

        // ***********************
        // For each item below you must code the solution. You may not use any of the
        //  methods found in the Arrays class or the Collections classes
        //

        String[] myData;

        // 1. Instantiate the given array to hold 10 Strings.

        myData = new String[10];

        // 2. Add your name to the Array at index 0 and a friend's name to the Array at index 4

        myData[0] = "Kevin";
        myData[4] = "Norm";

        // 3. Move your friend's name to index 0 in the array and "delete" their name from index 4

        myData[0] = myData[4];  // Point reference of element 0 to reference of element 4
        myData[4] = null;       // "Delete" data from memory stored in element 4 reference

        // 4. Fill up all of the remaining indices in the array with more names

        myData[1] = "Jurgen";
        myData[2] = "John";
        myData[3] = "Paul";
        myData[4] = "George";
        myData[5] = "Ringo";
        myData[6] = "Qi";
        myData[7] = "Abercrombie";
        myData[8] = "Fitch";
        myData[9] = "Linus";

        // 5. Swap the values at index 5 and index 1

        String temp = myData[1];        // Temporarily point reference to element 1 in originally array
        myData[1] = myData[5];          // Point element 1 reference to element 5 reference
        myData[5] = temp;               // Point element 5 reference to temporary reference to complete swap

        // 6. Print the array from beginning to end.
        System.out.println("\nArray of names:");    // Enhanced for loop to print array values in order
        for (String myDatum : myData) {
            System.out.println(myDatum);
        }

        // 7. Shuffle the array of strings

        Random mixed = new Random();
        String [] tempString = new String[myData.length];

        for (int i = 0; i < myData.length; i++) {           // Loop reads array of random integers and
            int randPos = mixed.nextInt(myData.length);     // assigns new elements to String array
            tempString[i] = myData[i];
            myData[i] = myData[randPos];
            myData[randPos] = tempString[i];
        }

        System.out.println("\nShuffled array of names:");
        for (int i = 0; i < myData.length; i++) {
            System.out.println(myData[i]);
        }

        // 8. Find and print the longest and shortest Strings in the array

        int longest = myData[0].length(), shortest = myData[0].length();
        String longString = myData[0], shortString = myData[0];
        // Set int variables to the first String for use as baseline of shortest and longest

        for (int i = 1; i < myData.length; i++) {   // Loop through array and compare each element to
            if (myData[i].length() <= shortest) {   // current longest and shortest lengths. Save as new
                shortString = myData[i];            // shortest or longest if either case is met.
                shortest = myData[i].length();
            }
            else if (myData[i].length() >= longest) {
                longString = myData[i];
                longest = myData[i].length();
            }
        }

        System.out.println("\nThe shortest name in the string is " + shortString);
        System.out.println("\nThe longest name in the string is " + longString);

        // 9. Add up the total number of characters in all of the strings in the array and print the answer

        int characters = 0;

        for (int i = 0; i < myData.length; i++){    // Loop through array and add length of each string
            characters += myData[i].length();
        }

        System.out.println("\nThe total number of characters in all of the strings is " + characters);

        // 10. Prompt the user for a String and then perform a linear search of the array
        //  to see if that string is or is not in the array. Print if it is or is not found.

        Scanner keyboard = new Scanner(System.in);
        System.out.println("\nEnter a string of characters and I'll search for it.");
        String input = keyboard.nextLine();     // Read scanner object for a string
        boolean found = false;                  // Set default flag to false

        for (String i : myData) {               // Loop through each string in array and compare for
            if (i.equals(input))                // exact, case sensitive match
                    found = true;
        }

        if (found)
            System.out.println("Found it!");
        else
            System.out.println("Sorry, that string wasn't found.");


        // 11. Remove the item at index 4 of the array by shifting everything after it one spot to the left.
        // This means your array should have one empty index at the end after the shift (delete the duplicate item at the end).

        int removeIndex = 4;                                    // Temp var for index start
        for (int i = removeIndex; i < myData.length-1; i++){    // Loop through array and shift elements by
            myData[i] = myData[i+1];                            // minus one
            if (myData[i] == myData[myData.length-1])           // For last element, set to null which removes
                myData[myData.length-1] = null;                 // dupe between last and second to last elements
        }

        for (int i = 0; i < myData.length; i++) {   // Show that String at index 4 was removed
            System.out.println(myData[i]);          // and that all other Strings shifted
        }

        // 12. Create a new array that is twice as big as the current array and copy all of the items to the new array.
        // When complete, swap references so our old array gets garbage collected and the new array is pointed to by your array variable myData.

        String[] newData;                           // Declare temporary array
        int newArraySize = (myData.length * 2);
        newData = new String[newArraySize];         // Initialize temp array to double size of original array
        for (int i = 0; i < myData.length; i++) {   // Loop through original array and duplicate elements in
            newData[i] = myData[i];                 // temp array by reference
        }

        myData = newData; // Point myData reference to newData array.


        // 13. Prompt the user to enter 2 numbers within the range of the array's length. If the first is larger than the second print backwards from that index to the first.
        // If the second is larger than the first, print forward in the array from the first index to the second.

        // Prompt for and read two Scanner input objects to get integers

        System.out.println("\nEnter an number between 1 and " + myData.length);
        int num1 = keyboard.nextInt();
        System.out.println("\nEnter another number between 1 and " + myData.length);
        int num2 = keyboard.nextInt();

        if (num2 < num1) {                          // Case 1: Loop and print array from smaller index to the first
            for (int i = num1 - 1; i >= 0; i--) {
                System.out.println(myData[i]);
            }
        }
        else if (num2 > num1){                      // Case 2: Loop and print array from first index to the second
            for (int i=num1; i<=num2; i++){
                System.out.println(myData[i]);
            }
        }
    }

}
