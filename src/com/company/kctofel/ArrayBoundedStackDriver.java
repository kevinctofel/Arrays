package com.company.kctofel;


public class ArrayBoundedStackDriver {

    public static void  main(String args[]){

        ArrayBoundedStack myStack;
        myStack = new ArrayBoundedStack <Integer> ();

        myStack.push("Kevin");
        myStack.push("Paul");
        myStack.push("John");
        myStack.push("George");
        myStack.push("Ringo");
        myStack.push("Norm");
        System.out.println(myStack.toString(myStack.topIndex));
        System.out.println("Total items in the stack: " +myStack.size());

        myStack.popSome(4);                                     // Change count for various test cases
        System.out.println(myStack.toString(myStack.topIndex));
        System.out.println("Total items in the stack: " +myStack.size());

        System.out.println(myStack.swapStart()); // Returns false if less than 2 elements in stack; true if more & swap
        System.out.println(myStack.toString(myStack.topIndex));

        System.out.println("I just popped "+ myStack.poptop()); // Pop top element off stack and return what it was

        System.out.println("Here's what's left now: " + myStack.toString(myStack.topIndex));

    }
}
