package animalkingdom;

public class Animal {
    private String name;
    private String food;
    private String noise;
    protected int age;

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", food='" + food + '\'' +
                ", noise='" + noise + '\'' +
                ", age=" + age +
                '}';
    }


    public Animal(String name, String food, String noise, int age) {
        this.name = name;
        this.food = food;
        this.noise = noise;
        this.age = age;
    }

    //getter method
    public String getName() {
        return this.name;
    }

    public String getNoise() {
        return this.noise;
    }

    //setter method
    public void setName(String name) {
        this.name = name;
    }

    public void setNoise(String noise) {
        this.noise = noise;
    }

    public static void makeNoise(Animal animal) {
        if (animal instanceof Dog) {
            System.out.println(animal.noise);
        } else if (animal instanceof Cat) {
            System.out.println(animal.noise);

        } else {
            System.out.println("");

        }

    }

    public static void animalFood(Animal animal ) {
        if (animal instanceof Dog) {
            System.out.println(animal.food);
        } else if (animal instanceof Cat) {
            System.out.println(animal.food);
        } else if (animal instanceof Lion) {
            System.out.println(animal.food);
        } else
            System.out.println("");


//Everybody will create a method that takes an array of animals and prints out each animals name.

    }
}
