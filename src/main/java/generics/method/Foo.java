package generics.method;

public class Foo <T>{
    T x;

    public Foo(){}

    public Foo(T x){
        this.x = x;
    }

    public void print(){
        System.out.println(x);
    }


}
