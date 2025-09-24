package Tasks;

public class HealthAssistant {
    public static void main(String[] args) {
        double bmiCheck = bmi(80.2, 1.84);
        System.out.println(bmiCheck);
        System.out.println();
        System.out.println(interpretBMI(23.62));
        System.out.println();
        System.out.println(interpretBMI(45.1));
        System.out.println();
        printHealthReport("michau", 33);
        System.out.println();
        printHealthReport("michau", 33, 23);
        System.out.println();
        System.out.println("Is he senior? " + isSenior(33));
    }

    public static double bmi(double weightKg, double heightMeters) {
        return weightKg / (heightMeters * heightMeters);
    }

    public static String interpretBMI(double bmi) {
        if (bmi < 18.5) {
            return ("You are underweight!");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            return "You are normal";
        } else if (bmi > 24.9 && bmi < 30) {
            return "You are overweight!";
        } else {
            return "You are obese!";
        }

    }

    public static void printHealthReport(String name, int age, double bmi) {
        System.out.println("Name: " + name + '\n' + "Age: " + age + '\n' + "BMI: " + bmi + '\n' + "Interpretation: " + interpretBMI(bmi));
    }

    public static void printHealthReport(String name, int age) {
        System.out.println("Name: " + name + '\n' + "Age: " + age);
    }

    public static boolean isSenior(int age) {
        return age >= 65;

    }
}
