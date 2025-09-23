package Tasks;

import java.util.Scanner;

public class TaskUserInput {
    public static void main(String[] args) {
        TaskUserInput taskUserInput = new TaskUserInput();
        taskUserInput.readSimpleLine();
        taskUserInput.readNumber();
        taskUserInput.readFloatPointNumber();
    }

    void readSimpleLine() {
        Scanner input = new Scanner(System.in);

        System.out.println("Type something... ");
        String txt = input.nextLine();

        System.out.println("Line ==> ");
        System.out.println(txt);
    }

    void readNumber() {
        Scanner input = new Scanner(System.in);

        System.out.println("Type something...");
        int number = input.nextInt();

        System.out.println("Number ==> ");
        System.out.println(number);
    }

    void readFloatPointNumber() {
        Scanner input = new Scanner(System.in);
        double number = input.nextDouble();
        System.out.println("Number ==> " + number);
    }
}
