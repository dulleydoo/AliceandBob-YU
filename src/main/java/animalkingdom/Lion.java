package animalkingdom;

public class Lion extends Pet {
    public Lion() {
    }

    public Lion(String name) {
        super(name);
    }

    public void makeNoise() {
        System.out.println( getName() + " is Rawring");
    }
}
