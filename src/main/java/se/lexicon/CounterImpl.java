package se.lexicon;

import java.io.Serializable;
import java.util.List;

public class CounterImpl<T extends Number & Serializable> implements Icounter {

    // T extends Number  it is like bound only Numerics values can only be accepted
    //Can extend one class but multiple Interface(Number should come first)
    T t;

    public CounterImpl(T t) {
        this.t = t;


    }

    public void pritn() {

        System.out.println(">> The Printed Number\t" + t);

    }
    // For Example

}
