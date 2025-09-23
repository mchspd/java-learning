package JavaBasic.Increment;

public class IncrementTask {
    public static void main(String[] args) {
        int x = 5;

        int a = ++x;
        int b = x++;
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + a);
        for(int i = 0; i <3; i++){
            System.out.println("i++ = " + (i++));
            System.out.println("++i = " + (++i));

        }
    }
}
