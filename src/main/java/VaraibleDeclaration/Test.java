package VaraibleDeclaration;

public class Test {
    private int x;

    {
        System.out.println("Hello from non-static initializer block");
        x = 50;
    }
    public Test(){

        System.out.println("Hello from Constructor");
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }

    public void localVarTest(){
        final int x;
        x = 15;
        System.out.println(x);

    }
    public static int initializerMethod(){
        return 50;
    }



}
