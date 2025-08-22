package OOP;

class Outer {
    private String message = "Hello from Outer";

    class Inner {
        void display() {
            System.out.println("Message: " + message); // access private
        }
    }
}

public class Main {
    int x = 5;

    public static void main(String[] args) {
        Main main = new Main();
        main.x = 10;
        main.testLocalInner();
    }

    public void testLocalInner(){
        class Inner {
            void display() {
                System.out.println(x);
            }
        }
        Inner inner = new Inner();
        inner.display();
    }
}
