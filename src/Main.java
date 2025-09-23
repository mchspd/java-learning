public class Main {

    public static void main(String[] args) {
        wrongConditionForLoop1();


    }


    public static void basicForLoop3() {
        String s = "";
        for (int i = 0; i < 2; i++) {
            s += i + ", ";
        }
        System.out.println(s);

        // 0, 0<2; s = 0,
        // 1, 1<2; s = 0, 1
        // 2, 2<2


    }

    public static void wrongConditionForLoop1() {
        int v1 = 0, v2 = 0;

        for (int i = 0; i > 10; i++) {
            v1++;
        }

        for (int i = 0; i < 10; i--) {
            v2++;
        }

        System.out.println(v1);
        System.out.println(v2);







    }
}
