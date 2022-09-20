package animalkingdom;

public class Cat extends Animal{

    private boolean evil;

    public boolean isEvil() {
        return evil;
    }

    public void setEvil(boolean evil) {
        this.evil = evil;
    }

    public Cat(String name, String food, String noise, int age, boolean evil) {
        super(name, food, noise, age);
        this.evil = evil;
    }
}
