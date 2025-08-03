package generics;

public class GenericBoundedPrinter <T extends Animal>{
    String valueToPrint;

    public GenericBoundedPrinter(T animal) {
        this.valueToPrint = animal.name;
    }
    public void print() {
        System.out.println(valueToPrint);
    }
}
