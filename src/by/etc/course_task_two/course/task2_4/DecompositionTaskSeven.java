package by.etc.course_task_two.course.task2_4;

//Сумма факториала нечетных чисел от 1 до 9

public class DecompositionTaskSeven {
    public static void main(String[] args) {
     int answer = getNotEvenFactorial();
     System.out.print(answer);
    }

    public static int getFactorial (int a){
        int factorial = 1;
        for (int i = 2; i <= a; i++){
            factorial *= i;
        }
        return factorial;
    }

    public static int getNotEvenFactorial (){
        int factorial = 0;
        for (int i = 1; i <= 9; i = i + 2){
            factorial += getFactorial(i);
        }
        return factorial;
    }
}
