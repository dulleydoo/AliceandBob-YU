package scans;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scans = new Scanner(System.in);
        System.out.println("What is your name");
        String name = scans.nextLine();
        System.out.println("What is your age");
        int age = scans.nextInt();
        scans.nextLine();
        System.out.println("Whats your favorite color");
        String color = scans.nextLine();
        System.out.println("Your name is " + name + " Your age is " + age + " Your fav color is " + color);
        scans.close();

    }
}
