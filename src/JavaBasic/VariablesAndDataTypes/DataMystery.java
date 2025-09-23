package JavaBasic.VariablesAndDataTypes;

public class DataMystery {
    public static void main(String[] args) {
        int bigValue = 300;
        byte smallValue = (byte)bigValue;
        double price = 10.0;
        double discount = 0.1 + 0.2;
        boolean isDiscountCorrect = (discount == 0.3);
        char smiley = '\u263A';
        final int DAYS_IN_WEEK = 7;

        System.out.println(bigValue);
        System.out.println(smallValue);
        System.out.println(price);
        System.out.println(discount);
        System.out.println(isDiscountCorrect);
        System.out.println(smiley);
        System.out.println(DAYS_IN_WEEK);

        if(isDiscountCorrect){
            System.out.println("Discount works correctly");
        } else {
            System.out.println("Floating point issues!");
        }
    }
}
