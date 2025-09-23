package Tasks;

import java.util.Random;

public class TaskRandomNumbers {
    public static void main(String[] args) {
        TaskRandomNumbers taskRandomNumbers = new TaskRandomNumbers();
        taskRandomNumbers.randomIntegers();
        taskRandomNumbers.randomIntegersWithRange();
        taskRandomNumbers.randomDoubleWithRange();
    }

    void randomIntegers() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int randomInt = random.nextInt();
            System.out.println(randomInt);
        }
    }

    void randomIntegersWithRange() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int randomInt = random.nextInt(20, 25 + 1);
            System.out.println(randomInt);
        }
    }

    void randomDoubleWithRange() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            double randomDouble = random.nextDouble(0.5, 12.5);
            System.out.println(randomDouble);
        }

    }
}
