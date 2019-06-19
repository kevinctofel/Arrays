package com.company.kctofel;

public interface PairInterface <T> {

    T getFirst();

    T getSecond();

    default void setFirst(T str) {

    }

    default void setSecond(T str) {

    }
}
