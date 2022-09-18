import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name = scan.nextLine();

        boolean trueOrFalse = true;
        while (trueOrFalse) {
            if (name.equalsIgnoreCase("Bob") | name.equalsIgnoreCase("Alice")) {
                System.out.println("Hello There " + name);
                trueOrFalse = false;

            } else {
                System.out.println("Try again");
                name = scan.nextLine();


            }

        }
    }
}
