package generics.method;

public class Main {
    public static void main(String[] args) {
        Foo<? super Number> foo = new Foo<Object>();
        foo.x = 1;



    }
}
