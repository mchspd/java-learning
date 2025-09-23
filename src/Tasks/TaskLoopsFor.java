package Tasks;

public class TaskLoopsFor {
    public static void main(String[] args) {
        TaskLoopsFor taskLoopsFor = new TaskLoopsFor();
        taskLoopsFor.basicForLoop();
    }
    void basicForLoop(){
        int x = 0;
        for (int i = 0; i <=10; i++){
            System.out.println(i);
        }
    }
    void basicForLoop3(){
        for (int i = 3; i > 0; i--){
            System.out.println(i);
        }
    }
    void basicForLoop5(){
        for(int i = 0; i < 2; i++){
            System.out.println(i);
        }
    }
    void basicForLoop6(){
        for(int i = 0; i <11; i +=2){
            System.out.println(i);
        }
    }
    void basicForLoopWithTwoVariables(){
        for (int i = 0, j = 10; i < 5 && j > 5; i++, j--){
            System.out.println((i + ", " + j));
        }
    }
    void forVSWhileLoop(){
        int v1 = 0, v2 = 0;
        for(int i = 0; i < 10; i++){
            v1++;
        }
        int i = 0;
        while (i < 10) {
            v2++;
            i++;
        }
    }
}
