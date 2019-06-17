package com.company.kctofel;

public class ArrayPairDriver {

    public static void main (String[] args)
    {
        PairInterface myPair = new ArrayPair <> (9, 11);

        System.out.print(myPair.getFirst() + " ");
        System.out.println(myPair.getSecond());

        myPair.setSecond("orange");

        System.out.println(myPair.getSecond());

    }
}
