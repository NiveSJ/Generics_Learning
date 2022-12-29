package se.lexicon;

public class CounterImpl<T> implements Icounter {
    T t;

    public CounterImpl(T t) {
        this.t = t;


    }
    public void pritn() {

        System.out.println(">> The Printed Number\t"+ t);

    }
}
