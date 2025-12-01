package VerySimpleTasks;

import java.util.Scanner;

public class IsAdult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your age: ");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("YES, adult");
        } else {
            System.out.println("NO, minor");
        }
        scanner.close();
    }

}


