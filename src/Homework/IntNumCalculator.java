package Homework;

import java.util.Scanner;

public class IntNumCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type first integer number");

        int num1 = input.nextInt();

        System.out.println("Type second integer number");

        int num2 = input.nextInt();

        System.out.println("Enter operation type");

        System.out.println("1 - sum | 2 - substraction | 3 - multiplication | 4 - division ");

        int operation = input.nextInt();

        while(operation != 1 && operation != 2 && operation != 3 && operation != 4){
            System.out.println("Enter correct type operation! (1 | 2 | 3 | 4)");
            operation = input.nextInt();
        }

        while(operation == 4 && num2 == 0){
            System.out.println("Must not divide by 0! Enter second integer number");
            num2 = input.nextInt();
        }

        double result = switch (operation){
            case 1 -> (num1 + num2);
            case 2 -> (num1 - num2);
            case 3 -> (num1 * num2);
            case 4 -> ((double)num1 / num2);
            default -> 0;
        };

        char operator = switch (operation){
            case 1 -> '+';
            case 2 -> '-';
            case 3 -> '*';
            case 4 -> '/';
            default -> 'x';
        };

        System.out.println(num1 + " " + operator + " " + num2 + " " + "=" + " " + result);

        input.close();
    }
}
