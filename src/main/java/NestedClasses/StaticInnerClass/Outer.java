package NestedClasses.StaticInnerClass;

public class Outer {
    private int x;  // No worries about initialization, it's assigned the default value
    private final int y;  // Must be initialized at declaration, or in an initializer block, or in a constructor
    private static int w;  // No worries about initialization, it's assigned the default value
    private static final int CONSTANT; // Must be initialized at declaration or, in a static block

    static {
        CONSTANT = 42;
    }
    {
        y = 50;
    }

    public static class Inner {
        private int innerx;
        private int innerY;
        public Inner() {
            this.innerx = w;  // Can access static non-final
            this.innerY = CONSTANT; // Can access static final
            // int temp = x; // Non-static filed x, can't be referenced from static context
            // you can't access instance variables cause they belong to instance
            System.out.println(innerx + "  " + innerY);
        }
    }

}
