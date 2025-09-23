package JavaBasic.IfElseSwitch;


import java.util.Scanner;

public class SwitchTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type day of the week number: ");
        int day = scanner.nextInt();
        while (day < 1 || day > 7){
            System.out.println("Wrong day number! Type correct day of the week number: ");
            day = scanner.nextInt();

        }

        String dayName = switch (day){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Unknownday";
        };
        System.out.println(dayName);
        scanner.close();
    }

}
