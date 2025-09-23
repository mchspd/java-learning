package JavaBasic.Operators;

public class OperatorsDemo {
    public static void main(String[] args) {
        int age = 20;
        boolean hasID = true;
        if (age >= 18 && hasID) {
            System.out.println("You can come in");
        }

        boolean isWeekend = false;
        boolean isHoliday = true;

        if (isWeekend || isHoliday) {
            System.out.println("Today is your day off!");
        }

        boolean raining = false;
        if (!raining) {
            System.out.println("We can go for a walk!");
        }
    }
}

