package by.etc.course_task_two.course.task2_4;

public class DecompositionTaskThirteen {
    public static void main(String[] args) {
        int n = 30;
        for (int i = 1; i <= n - 2; i++){
            printNumbers(i, i + 2);
        }
    }
        public static void printNumbers(int a, int b){
        System.out.print(a + "." + b + " | ");
        }
}
