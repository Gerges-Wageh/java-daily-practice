package StaticClasses;

public class Cat {

    int age;
    String name;

    public Cat(int age, String name) {
        System.out.println("Constructor called");
        this.age = age;
        this.name = name;
    }
    public Cat() {}

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void introduceYourSelf() {
        System.out.printf("Hello, I'm %s and I am %d years old.\n",name, age);
    }
    public static void makeSound(){
        System.out.println("Mewooooo");
    }

     {
        int  x = 15;
        System.out.println("Initializer block called before any constructor");
    }
}
