package com.company.kctofel;

public class BasicPair <Object> implements PairInterface<Object> {

   private Object first;
   private Object second;

    protected BasicPair(Object first, Object second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public Object getFirst() {
        return first;
    }

    @Override
    public Object getSecond() {
        return second;
    }

    @Override
    public void setFirst(Object first) {
    }

    @Override
    public void setSecond(Object second) {
        this.second = second;
    }


}
