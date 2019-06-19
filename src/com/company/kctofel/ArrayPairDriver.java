package com.company.kctofel;

public class ArrayPairDriver {

    public static void main (String[] args)
    {
        PairInterface myPair = new ArrayPair <> (9, 11); // Create new array pair of any 2 objects to test

        System.out.print(myPair.getFirst() + " " + myPair.getSecond()); // Print pair

        myPair.setFirst(3);    // Change first item in pair
        myPair.setSecond(42);  // Change second item in pair

        System.out.print("\n" + myPair.getFirst() + " " + myPair.getSecond()); // Print new pair

    }
}
