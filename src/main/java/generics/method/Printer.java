package generics.method;

import java.util.ArrayList;

public class Printer {
    public static <T> void print(T somethingToPrint, ArrayList<?> list){
        System.out.println(somethingToPrint);

    }
}
