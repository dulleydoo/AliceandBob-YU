import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you think the temperature is High, Low or Humid?");
        String condition = scan.nextLine();
        if(condition.equalsIgnoreCase("High")){
            System.out.println("sunblock may be needed");
        } else if (condition.equalsIgnoreCase("Low")){
            System.out.println("a coat may be needed");
        }else if(condition.equalsIgnoreCase("Humid")){
            System.out.println("its muggy");

        }


    }
}
/*Prompt a user to enter if they think the temperature is High, Low or Humid
Based on the user's input print out one of these
High: print out " sunblock may be needed"
Low : print out " a coat may be needed"
Humid: print out " it's muggy!" */