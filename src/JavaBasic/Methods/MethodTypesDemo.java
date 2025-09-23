package JavaBasic.Methods;

public class MethodTypesDemo {
    public static void main(String[] args) {
        int resultInt = add(5,5);
        System.out.println(resultInt);
        double resultDouble = multiply(33.3, 66.6);
        System.out.println(resultDouble);
        greet("michau");
        double resultSubstract = substract(71.56667, 55.6789);
        System.out.println(resultSubstract);

    }
    public static int add(int a, int b){
        return a + b;
    }
    public static double multiply(double x, double y){
        return x * y;
    }
    public static void greet(String name){
        System.out.println("hello " + name + "!");
    }
    public static double substract(double a, double b){
        return a - b;
    }
}
