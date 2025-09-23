package Homework;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args) {

        System.out.println("<===========================>");
        System.out.println("Let's go! Try to guess my number");

        int number = new Random().nextInt(1, 101);
        Scanner scanner = new Scanner(System.in);
        int answer = -1;
        while (answer != number) {
            answer = scanner.nextInt();
            if (number > answer) {
                System.out.println("Number is too low!");
                System.out.println("Try again");
            } else if (number < answer) {
                System.out.println("Number is too high!");
                System.out.println("Try again");
            } else {
                System.out.println("You win!");
            }
        }
    }
}
