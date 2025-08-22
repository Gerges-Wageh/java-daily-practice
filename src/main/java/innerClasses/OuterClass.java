package innerClasses;

public class OuterClass {
    int number = 5;

    public void heyThere(){
        System.out.println("Hey there!");
    }

    public static class InnerClass{
        int innerNumber = 10;

        public void whatsUp(){
            System.out.println("What's up from inner class!");
        }
    }
}
