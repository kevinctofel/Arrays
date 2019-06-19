package com.company.kctofel;

public class ArrayPair <T> implements PairInterface<T> {

    private T[] numbers;

    protected ArrayPair(T first, T second) { // Create and fill array pair
        numbers = (T[]) new Object[2];
        numbers[0] = first;
        numbers[1] = second;
    }

    @Override
    public T getFirst(){
        return this.numbers[0];
    }

    @Override
    public T getSecond() {
        return this.numbers[1];
    }

    @Override
    public void setFirst(T first){
        this.numbers[0] = first;
    }

    @Override
    public void setSecond(T second){
        this.numbers[1] = second;
    }

}
