package animalkingdom;

public class Lion extends Animal{
    private int numberOfMates;
    public Lion(String name, String food, String noise, int age, int numberOfMates) {
        super(name, food, noise, age);
        this.numberOfMates = numberOfMates;
    }

    public int getNumberOfMates() {
        return numberOfMates;
    }

    public void setNumberOfMates(int numberOfMates) {
        this.numberOfMates = numberOfMates;
    }
}
