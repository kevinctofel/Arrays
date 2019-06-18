package com.company.kctofel;


public class ArrayBoundedStackDriver {

    public static void  main(String args[]){

        ArrayBoundedStack myStack;
        myStack = new ArrayBoundedStack <Integer> ();

        myStack.push(2);
        myStack.push(5);
        myStack.push(9);
        myStack.push(11);
        myStack.push(25);
        myStack.push(39);
        System.out.println(myStack.toString(myStack.topIndex));
        System.out.println("Total items in the stack: " +myStack.size());

        myStack.popSome(2);
        System.out.println(myStack.toString(myStack.topIndex));
        System.out.println("Total items in the stack: " +myStack.size());

        System.out.println(myStack.swapStart());
        System.out.println(myStack.toString(myStack.topIndex));

        System.out.println("I just popped "+ myStack.poptop());

        System.out.println("Here's what's left now: " + myStack.toString(myStack.topIndex));

    }
}
