package Homework;

import java.util.Scanner;

public class DailyAssistant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = input.nextLine();
        System.out.println("Type your age: ");
        int age = input.nextInt();
        System.out.println("Type day of week number: ");
        int day = input.nextInt();

        while (day < 1 || day > 7) {
            System.out.println("Type correct number of day!");
            day = input.nextInt();
        }

        System.out.println("Type temperature in F: ");
        double fahrenheitTemperature = input.nextDouble();

        System.out.println();
        System.out.println();

        System.out.println("Hello " + name + "!");
        System.out.println("Age: " + age + " " + interpretAge(age));
        System.out.println("Today is " + " " + getDayName(day));
        System.out.println("Temperature: " + fahrenheitTemperature + " F" + " = " + toCelsius(fahrenheitTemperature) + " C");


    }

    public static String interpretAge(int age) {
        if (age < 10) {
            return ("You are child!");
        } else if (age >= 10 && age < 18) {
            return ("You are teenager!");
        } else if (age >= 18 && age < 65) {
            return ("You are adult!");
        } else {
            return ("You are senior!");
        }
    }

    public static String getDayName(int day) {
        String dayName = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Unknown";
        };
        return dayName;

    }

    public static double toCelsius(double fahrenheit) {
        return (fahrenheit - 32) / (1.8);
    }
}
