package VerySimpleTasks;

import java.util.Scanner;

public class VerySimpleCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give price product: ");
        double productPrice = scanner.nextDouble();
        System.out.println("Give ammount of discount(%): ");
        int discountPercent = scanner.nextInt();
        double priceAfterDiscount = productPrice - (productPrice * discountPercent / 100);
        System.out.println("Price after discount: " + priceAfterDiscount);
        scanner.close();


    }
}
