package generics.intuition;

public class SafeGenericBox <T> {
    private T value;

    public SafeGenericBox() {

    }
    public SafeGenericBox(T value) {
        this.value = value;
    }
    public void setValue(T value) {
        this.value = value;
    }
    public T getValue() {
        return value;
    }
}
