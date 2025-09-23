package Tasks;

public class TaskLogicalOperators {
    public static void main(String[] args) {
        TaskLogicalOperators app = new TaskLogicalOperators();

        app.conditionalAnd();
        app.conditionalOr();
        app.moreComplexConditions();
    }

    void conditionalAnd() {
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);
    }

    void conditionalOr() {
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);
    }

    void moreComplexConditions() {
        System.out.println(true && true && false);
        System.out.println(true || false || false);
        System.out.println(false && true || true);
        System.out.println(method() && true || method2());
    }

    private boolean method() {
        return true;
    }

    private boolean method2() {
        return false;
    }
}
