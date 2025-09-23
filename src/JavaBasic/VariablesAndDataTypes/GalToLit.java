package JavaBasic.VariablesAndDataTypes;

public class GalToLit {
    public static void main(String[] args) {
        //System.out.println(galToLit(10.5));
        galToLitTable();

    }

    public static String galToLit(double gallons) {
        double liters = gallons * 3.7854;
        return String.format("%.2f", gallons) + " gallons = " + String.format("%.2f", liters) + " liters";
    }

    public static void galToLitTable(){
        int counter = 0;
        for (int gallons = 1; gallons <=100; gallons++){
            System.out.println(galToLit(gallons));
            counter++;
            if (counter == 10){
                System.out.println();
                counter = 0;
            }
        }
    }

}
