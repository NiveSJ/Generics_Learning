package se.lexicon;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        Icounter<Integer> Icounter = new CounterImpl<Integer>(1);
        Icounter.pritn();

        Icounter<Double> Dcounter = new CounterImpl<Double>(3.0);
        Dcounter.pritn();
    }
}
