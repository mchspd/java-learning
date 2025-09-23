package JavaBasic.ForLoops;

import java.util.Scanner;

public class ForLoopTasks {
    public static void main(String[] args) {
//      evenNumbers();
//      sumNumbers();
//      multiplicationTable();
        stars();

    }

    public static void evenNumbers() {
        int i;
        for (i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void sumNumbers() {
        System.out.println("Type integer number: ");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            sum += i;
        }
        System.out.println("Sum = " + sum);
    }

    public static void multiplicationTable() {
        System.out.println("Type integer number: ");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(x + " * " + i + " = " + (x * i));
        }
    }

    public static void stringReverse() {
        System.out.println("Type any word: ");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

    }

    public static void stars() {
        Scanner input = new Scanner(System.in);
        System.out.println("Type height of triangle(n): ");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        input.close();


    }
}
