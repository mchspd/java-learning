package JavaBasic.WhileLoop;

import java.util.Scanner;

public class WhileLoopScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

        System.out.println("Type integer numbers, type 0 to stop: ");
        int number = input.nextInt();

        while (number != 0) {
            if (number > 0) {
                counter++;
                sum += number;
            } else {
                System.out.println("Negative numbers are ignored.");
            }

            System.out.println("Type another number: ");
            number = input.nextInt();
        }

        System.out.println("Sum of positive numbers: " + sum);
        System.out.println("Count of positive numbers: " + counter);
        input.close();
    }
}
