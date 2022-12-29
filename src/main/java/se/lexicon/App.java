package se.lexicon;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        Icounter Icounter = new CounterImpl<Integer>(1);
        Icounter.pritn();

        Icounter Dcounter = new CounterImpl<Double>(3.0);
        Dcounter.pritn();
        pritnVal(1,3);
        pritnVal("Nive","Jay");
        List<Integer> intList= new ArrayList<Integer>();
        List<String> strList= new ArrayList<String>();
        intList.add(1);
        intList.add(2);
        System.out.println("with Wild cards to print Int list");
        listPrint(intList);



    }

    public static <T,U> T pritnVal( T t,U u) {

        System.out.println(">> The Printed Number\t"+ t + "\t"+ u);
        return t;

    }
    // Using Wildcards : Since Parameter extends Number it can accept only numeric values
    public static void listPrint(List<? extends Number> list){

        System.out.println(list);

    }
}
