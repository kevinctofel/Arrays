package com.company.kctofel;

public class Sample {

    public static void main (String[] args)
    {
        PairInterface myPair = new BasicPair("apple", "peach");

        System.out.print(myPair.getFirst() + " ");
        System.out.println(myPair.getSecond());

        myPair.setSecond("orange");

        System.out.println(myPair.getSecond());

    }
}
