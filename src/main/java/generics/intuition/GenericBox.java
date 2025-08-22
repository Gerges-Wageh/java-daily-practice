package generics.intuition;

public class GenericBox {
    private Object value;

    public GenericBox(){

    }
    public GenericBox(Object value) {
        this.value = value;
    }
    public void setValue(Object value) {
        this.value = value;
    }
    public Object getValue() {
        return value;
    }
}
