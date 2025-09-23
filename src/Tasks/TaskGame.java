package Tasks;

import java.util.Random;
import java.util.Scanner;

public class TaskGame {
    public static void main(String[] args) {
        System.out.println("<=========================>");
        System.out.println("Let's go! Try to guess my number");

        int number = new Random().nextInt(1, 101);

        Scanner scanner = new Scanner(System.in);

        int answer = -1;

        while (answer != number) {
            answer = scanner.nextInt();

            if (answer == number) {
                System.out.println("You win!");
            } else if (answer > number) {
                System.out.println("Number is too high!");
                System.out.println("Try again");
            } else {
                System.out.println("Number is too low!");
                System.out.println("Try again");
            }
        }
    }
}
