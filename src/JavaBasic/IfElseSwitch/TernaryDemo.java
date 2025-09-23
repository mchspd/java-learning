package JavaBasic.IfElseSwitch;

import java.util.Scanner;

public class TernaryDemo {
    public static void main(String[] args) {
        checkNumber();
    }
    public static void checkNumber(){
        Scanner input = new Scanner(System.in);
        System.out.println("Type an integer number: ");
        int number = input.nextInt();
        String result = (number > 0) ? "Number is positive"
                        : (number == 0) ? "Number is zero"
                        : "Number is negative";

        System.out.println("Your number is " + result);


    }
}
