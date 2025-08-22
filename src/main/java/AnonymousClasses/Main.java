package AnonymousClasses;

public class Main {
    public static void main(String[] args) {

        // Note that uniqCat is of anonymous (nameless) subtype extends Cat
        // thanks to polymorphism we could store that subtype instance in a reference of the parent
        // Anonymous class MUST extend or implement an existing parent class (concrete or abstract) or interface
        // Intuition: used to create only one instance of a one-off type extends some class or implements an interface

        Cat uniqueCat = new Cat(){
            @Override
            public void makeSound() {
                System.out.println("I'm a unique cat instantiated only " +
                        "once to be one of a type regardless the name of this type");
            }
        };
        uniqueCat.makeSound();
    }
}
