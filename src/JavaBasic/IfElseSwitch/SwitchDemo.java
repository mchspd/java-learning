package JavaBasic.IfElseSwitch;

public class SwitchDemo {
    public static void main(String[] args) {
        int day = 3;
        String dayName = switch (day){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            default -> "Unknown day";
        };
        System.out.println(dayName);
    }
}

