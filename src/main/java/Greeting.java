import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name = scan.nextLine();


        if (name.equals("Bob") | name.equals("Alice")) {
            System.out.println("Hello There");



        }
        else {
            System.out.println("You dont belong here");

        }

    }
}
