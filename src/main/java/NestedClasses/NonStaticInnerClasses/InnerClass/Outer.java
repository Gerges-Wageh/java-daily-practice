package NestedClasses.NonStaticInnerClasses.InnerClass;

public class Outer {
    private int x;
    private final int y;
    private static int w;
    private static final int Z_CONSTANT;

    static {
         Z_CONSTANT = 10;
    }
    {
        y = 50;
    }

    public class Inner {
        int innerX;
        public Inner() {
            innerX = x;
            int innerY = y;
            int innerW = w;
            int innerZ = Z_CONSTANT;
            System.out.println(innerX + " " + innerY + " " + innerW + " " + innerZ);
        }


    }
}
