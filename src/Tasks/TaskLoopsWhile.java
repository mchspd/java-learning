package Tasks;

public class TaskLoopsWhile {
    public static void main(String[] args) {
        TaskLoopsWhile taskLoopsWhile = new TaskLoopsWhile();
        taskLoopsWhile.simpleWhileLoop1();
        System.out.println("---------------");
        taskLoopsWhile.simpleWhileLoop2();
        System.out.println("---------------");
        taskLoopsWhile.alwaysFalseConditionWhileLoop();
        System.out.println("---------------");
        taskLoopsWhile.whileWithTwoWariables();

    }
    void simpleWhileLoop1(){
        int v = 0;
        while (v<3) {
            System.out.println(v);
            v++;
        }
    }
    void simpleWhileLoop2(){
        int counter = 4;
        while (counter-- >=0){
            System.out.println(counter);
        }
    }
    void alwaysFalseConditionWhileLoop(){
        int y = 10;
        while (y < 5) {
            y++;
            System.out.println(y);
        }
    }
    void wrongConditionWhileLoop(){
        int y = 10;
        while (y > 0) {
            y++;
            System.out.println(y);
        }
    }
    void whileWithTwoWariables(){
        int v1 = 0, v2 = 0;
        while (v1 <= 3 && v2 <=5) {
            v1++;
            v2 += 2;
            System.out.println(v1);
            System.out.println(v2);
        }
    }
}
