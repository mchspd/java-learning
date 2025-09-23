package JavaBasic.IfElseSwitch;

import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        EvenOddChecker evenOddChecker = new EvenOddChecker();
        System.out.println("Type any number");
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();
        if(answer % 2 == 0){
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
        if(answer > 0){
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is negative");
        }
    }
}
