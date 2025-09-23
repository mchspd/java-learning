package JavaBasic.IfElseSwitch;

import java.util.Scanner;

public class IfElseTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your age: ");
        int age = scanner.nextInt();

        if (age<13){
            System.out.println("Child");
        }else if (age >= 13 && age <= 17){
            System.out.println("Teenager");
        }else if (age >=18 && age <= 64){
            System.out.println("Adult");
        } else {
            System.out.println("Senior");
        }

    }
}
