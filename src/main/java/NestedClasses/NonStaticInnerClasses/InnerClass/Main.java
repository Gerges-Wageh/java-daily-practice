package NestedClasses.NonStaticInnerClasses.InnerClass;

public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner innerRefVar = outer.new Inner();  // Note the constructor call from the reference
        // Outer.Inner staticInner = new Outer.Inner(); // In case of static Inner Class
    }
}

