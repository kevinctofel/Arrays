

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

        myData[0] = myData[4];
        myData[4] = "null";

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

        String temp = myData[1];
        myData[1] = myData[5];
        myData[5] = temp;

        // 6. Print the array from beginning to end.
        System.out.println("\nArray of names:");
        for (int i = 0; i < myData.length; i++) {
            System.out.println(myData[i]);
        }

        // 7. Shuffle the array of strings

        Random mixed = new Random();
        String [] tempString = new String[myData.length];

        for (int i = 0; i < myData.length; i++) {
            int randPos = mixed.nextInt(myData.length);
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

        for (int i = 1; i < myData.length; i++) {
            if (myData[i].length() <= shortest) {
                shortString = myData[i];
                shortest = myData[i].length();
            }
            if (myData[i].length() >= longest) {
                longString = myData[i];
                longest = myData[i].length();
            }
        }

        System.out.println("\nThe shortest name in the string is " + shortString);
        System.out.println("\nThe longest name in the string is " + longString);

        // 9. Add up the total number of characters in all of the strings in the array and print the answer

        int characters = 0;

        for (int i = 0; i < myData.length; i++){
            characters += myData[i].length();
        }

        System.out.println("\nThe total number of characters in all of the strings is " + characters);

        // 10. Prompt the user for a String and then perform a linear search of the array
        //  to see if that string is or is not in the array. Print if it is or is not found.

//        Scanner keyboard = new Scanner;





        // 11. Remove the item at index 4 of the array by shifting everything after it one spot to the left.
        // This means your array should have one empty index at the end after the shift (delete the duplicate item at the end).

        // 12. Create a new array that is twice as big as the current array and copy all of the items to the new array.
        // When complete, swap references so our old array gets garbage collected and the new array is pointed to by your array variable myData.

        // 13. Prompt the user to enter 2 numbers within the range of the array's length. If the first is larger than the second print backwards from that index to the first.
        // If the second is larger than the first, print forward in the array from the first index to the second.
    }

}
