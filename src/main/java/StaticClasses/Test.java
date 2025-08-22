package StaticClasses;

public  class Test {
     int a;
     static int b = 15;

    public int getA() {
        int x = staticClass.v;
        return a;

    }

    public void setA(int a) {
        this.a = a;
    }

    public Test(int a) {
        this.a = a;
    }

    public Test() {

    }
    public static class staticClass {
        Test t1 = new Test(1);
        static final int v = 5;
        int x = b;
    }
}
