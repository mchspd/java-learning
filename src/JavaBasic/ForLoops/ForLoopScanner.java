package JavaBasic.ForLoops;

import java.util.Scanner;

public class ForLoopScanner {
    public static void main(String[] args) {
        System.out.println("Type integer number higher than 0: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        while (number < 0){
            System.out.println("Number must be higher than 0! ");
            number = input.nextInt();
        }
        for(int i = 1; i <= number; i++){
            if (i % 3 == 0){
                continue;
            }

            if (i > 50){
                break;
            }
            System.out.println(i);

        }
        input.close();
    }
}
