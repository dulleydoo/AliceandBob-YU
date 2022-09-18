package animalkingdom;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("doggy", "dogfood", "ruff ruff", 10 );
        //dog.name = "Bob";
        dog.setName("Bob");
        dog.setNoise("rawr");
//        System.out.println(dog.getName());
//        System.out.println(dog.getNoise());

        Dog dog1 = new Dog("bobby", "dogfood", "ruff ruff", 10, true);

        Cat cat = new Cat("bobby", "catfood", "moew moew", 10);

        Lion lion = new Lion("Lion", "meat", "Rawr", 2);



        Animal[] animals = {dog1, cat, lion};

        Animal.animalFood(cat);


//        Animal.makeNoise(dog1);
//        Animal.makeNoise(cat);

        //Animal cat = new Animal("catty", "Catfood", "Moew moew", 13);

//        System.out.println(dog);
//        System.out.println(cat);
    }
}
