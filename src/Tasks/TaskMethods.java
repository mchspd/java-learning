package Tasks;

public class TaskMethods {
    void voidMethodWithoutArguments() {

    }

    public void testMethodWithArguments() {
        methodWithSingleArgument("Johnny");
        methodWithMultipleArguments("Johnny", 2, false);

    }

    void methodWithSingleArgument(String v) {

    }

    void methodWithMultipleArguments(String v1, int v2, boolean v3) {
        voidMethodWithoutArguments();
    }

    public static void main(String[] args) {
        testMethodWithReturn();

    }

    public static void testMethodWithReturn() {
        int v1 = add(1, 2);
        String v2 = add("Nauka ", "javy");
        System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);

    }

    static int add(int a, int b) {
        int result = a + b;
        return result;
    }

    static String add(String a, String b) {
        String result = a + b;
        return result;
    }
}
