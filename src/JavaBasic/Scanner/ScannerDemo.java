package JavaBasic.Scanner;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type your name: ");
        String name = scanner.nextLine();

        System.out.println("Type your age: ");
        int age = scanner.nextInt();

        System.out.println("Type your height in meters: ");
        double height = scanner.nextDouble();

        System.out.println("\nUser data: ");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " m");

        scanner.close();

    }
}
