package generics.intuition;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Box b1 = new Box();
//        b1.setValue(15);
//        int retVal = b1.getValue();
//        System.out.println(retVal);

//        GenericBox b2 = new GenericBox();
//        b2.setValue(15.5);
//        int retVal2 = (int) b2.getValue();  // ClassCaseException -- not safe to retrieve the data
//        System.out.println(retVal2);

//        SafeGenericBox<Double> b1 = new SafeGenericBox<>();  // Note that if you don't specify the type then it's considered Object
//        b1.setValue(15.5);
//        double retVal3 = b1.getValue();    // Safe read without casting
//        System.out.println(retVal3);

        // Generics prevent accidental, implicit, unsafe casting — not deliberate, explicit casting.

        // (?)
        // Read: safely Object, Write: null
        SafeGenericBox<Integer> populator = new SafeGenericBox<>();
        populator.setValue(15);
        SafeGenericBox<?> box1 = populator;
        Object x = box1.getValue();

        // (? extends T)
        // Read: safely Object, Write: null
        SafeGenericBox<? extends Number> box2 = populator;
        Object y =  box2.getValue();
        


        

    }


}
