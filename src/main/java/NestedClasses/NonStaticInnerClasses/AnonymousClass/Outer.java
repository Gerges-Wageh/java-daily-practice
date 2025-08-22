package NestedClasses.NonStaticInnerClasses.AnonymousClass;

public class Outer {
    private int x;
    private final int y;
    private static int w;
    private static final int h;

    static {
        h = 15;
    }
    {
        y = 14;
    }
    Parent p = new Parent() {
        @Override
        void sayHello() {
            System.out.println(x + " " + y + " " + w + " " + h);

            System.out.println("Hello from Anonymous");
        }
    };

    public void triggerAnonImplementation (){
        p.sayHello();
    }
}
