package JavaBasic.Methods;

public class MethodPractice {
    public static void main(String[] args) {
        double temperature = toCelsius(78);
        System.out.println(temperature);
        boolean result1 = isEven(10);
        System.out.println(result1);
        boolean result2 = isEven(3);
        System.out.println(result2);
        printLine("Elo", 2);

    }
    public static double toCelsius(double fahrenheit){
        return (fahrenheit - 32)/(1.8);
    }
    public static boolean isEven(int number){
        return number % 2 == 0;
    }
    public static void printLine(String message, int count){
        int i;
        for (i = 1; i <= count; i++) {
            System.out.println(message);

        }
    }
}
