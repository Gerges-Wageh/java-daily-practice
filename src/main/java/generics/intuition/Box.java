package generics.intuition;

public class Box {
    private int value;

    public Box() {

    }
    public Box(int value) {
        this.value = value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
