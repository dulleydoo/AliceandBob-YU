package animalkingdom;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
//        Animal dog = new Animal("doggy", "dogfood", "ruff ruff", 10);
//        //dog.name = "Bob";
//        dog.setName("Bob");
//        dog.setNoise("rawr");
//        System.out.println(dog.getName());
//        System.out.println(dog.getNoise());

        Dog dog = new Dog("Bolt", "dogfood", "ruffs", 10, true);

        Cat cat = new Cat("Garfield", "catfood", "moews", 10, true);

        Lion lion = new Lion("Alex", "meat", "Rawrs", 2, 5);


        Scanner scan = new Scanner(System.in);
        System.out.println("How many pets do you have?");
        scan.nextLine();
        System.out.println("What kind of pets do you have and whats their name?");
        String animal = scan.nextLine();
            if (animal.equalsIgnoreCase("dog")) {
                System.out.println("You have a dog named " + dog.getName() + " and he " + dog.getNoise());
                scan.nextLine();
            } else if (animal.equalsIgnoreCase("cat")) {
                System.out.println("You have a cat named " + cat.getName() + " and she " + cat.getNoise());
                scan.nextLine();
            } else if (animal.equalsIgnoreCase("lion")) {
                System.out.println("You have a lion named " + lion.getName() + " and he " + lion.getNoise());
                scan.nextLine();
            } else {
                System.out.println("Your a liar, BYE!!");
            }
        }





    }

