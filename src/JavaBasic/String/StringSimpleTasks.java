package JavaBasic.String;

import java.util.Scanner;

public class StringSimpleTasks {
    public static void main(String[] args) {
        //simpleTask();
        //miniTask();
        containLetterTask();
    }

    public static void simpleTask(){
        Scanner input = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = input.nextLine();
        System.out.println("Name: " + name);
        System.out.println("UPPERCASE: " + name.toUpperCase());
        System.out.println("lowercase: " + name.toLowerCase());
        System.out.println("First letter: " + name.charAt(0));
        System.out.println("Name length: " + name.length());
    }

    public static void miniTask(){
        Scanner input = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = input.nextLine();
        System.out.println("Name: " + name);
        System.out.println("Name length: " + name.length());
        System.out.println("First letter: " + name.charAt(0));
        System.out.println("Last letter: " + name.charAt(name.length()-1));
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());
        if(name.charAt(0) == 'A'){
            System.out.println("First letter of your name is 'A'");
        }
    }

    public static void containLetterTask(){
        Scanner input = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = input.nextLine();
        System.out.println("Type letter: ");
        String letter = input.nextLine();


    }
}
