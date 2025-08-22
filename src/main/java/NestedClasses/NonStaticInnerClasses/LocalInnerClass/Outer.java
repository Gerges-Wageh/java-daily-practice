package NestedClasses.NonStaticInnerClasses.LocalInnerClass;

public class Outer {
    private int x;
    private final int y;
    private static int w;
    private static final int z;

    static{
        z = 115;
    }
    {
        y = 50;
    }
    public void testLocalInnerClass() {
        int localX = 6;
        //localX = 5; // Not effectively final
        class Local {
            public void foo() {
                System.out.println(x + " " + y + " " + w + " " + z + " " + localX);
            }
        }
        new Local().foo();
    }
}
