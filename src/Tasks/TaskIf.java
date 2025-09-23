package Tasks;

public class TaskIf {
    public static void main(String[] args) {
        TaskIf taskIf = new TaskIf();
        taskIf.basicIfStatement();
        taskIf.basicIfElseIfElse1();
        taskIf.basicIfStatement2();
        taskIf.basicIfStatement3();
        taskIf.basicIfElseIfElse1();
        taskIf.ifElseStatement1();
        taskIf.ifStatementWithoutBraces1();
        taskIf.nestedIfStatement();
    }

    void basicIfStatement() {
        int v1 = 1;

        if (true) {
            v1 = v1 + 1;
        }
        System.out.println(v1);
    }

    void basicIfStatement2() {
        String name = "Joozek";
        String sex = null;
        if (name.endsWith("a")) {
            sex = "woman";
        } else {
            sex = "man";
        }
        System.out.println(sex);
    }

    void basicIfStatement3() {
        int v1 = 1;
        int v2 = 2;
        if (true) {
            v1++;
            v2++;
        }
        System.out.println(v1);
        System.out.println(v2);
    }

    void ifStatementWithoutBraces1() {
        String name = "Joozek";
        String sex = null;

        if (name.endsWith("a"))
            sex = "woman";

        System.out.println(sex);
    }

    void ifElseStatement1() {
        String name = "Joozek";
        String sex = null;
        if (name.endsWith("a")) {
            sex = "woman";
        } else {
            sex = "man";
        }
        System.out.println(sex);
    }

    void basicIfElseIfElse1() {
        int points = 34;
        int grade = 0;

        if (points >= 50) {
            grade = 5;
        } else if (points >= 40) {
            grade = 4;
        } else if (points >= 38) {
            grade = 3;
        } else if (points >= 28) {
            grade = 2;
        } else {
            grade = 1;
        }
        System.out.println(grade);
    }

    void nestedIfStatement() {
        String name = "Małgorzata";
        String sex = null;
        boolean longName = false;
        if (name.endsWith("a")) {
            sex = "woman";
            if (name.length() > 7) {
                longName = true;
            }
        } else {
            sex = "man";
        }
        System.out.println(sex);
        System.out.println(longName);
    }

}
