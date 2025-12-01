package VerySimpleTasks;

import java.util.Scanner;

public class NettoBrutto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give price netto: ");
        double priceNetto = input.nextDouble();
        double vat = 0.23;
        double priceBrutto = priceNetto + priceNetto * vat;
        System.out.println("Price brutto: " + priceBrutto);
        input.close();

    }
}
