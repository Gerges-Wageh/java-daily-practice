package generics;

public class GenericPrinter <T>{
    public T val;
    public GenericPrinter(T val) {
        this.val = val;
    }
    public void print() {
        System.out.println(val);
    }
}
