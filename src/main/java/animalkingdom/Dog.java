package animalkingdom;

public class Dog extends Animal {
    private boolean tail;
    public Dog(String name, String food, String noise, int age, boolean tail) {
        super(name, food, noise, age);
        this.tail = tail;
    }

    public boolean isTail() {
        return tail;
    }

    public void setTail(boolean tail) {
        this.tail = tail;
    }
}
