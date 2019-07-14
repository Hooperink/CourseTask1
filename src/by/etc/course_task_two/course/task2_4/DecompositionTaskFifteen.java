package by.etc.course_task_two.course.task2_4;

public class DecompositionTaskFifteen {
    public static void main(String[] args) {
        int n = 999999;
        int amountOfOperations = 0;
        for (int i = 120; i <= n; i++){
            amountOfOperations = DecompositionTaskTen.getAmountOfArray(i);  // подтянул фугкцию с 10ой задачи (лень заново писать было)
            if (isIncreasing(i, amountOfOperations)){
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isIncreasing(int n, int amountOfOperations){
        int buffer = n;
        boolean isIncreasing = true;
        for (int i = amountOfOperations; i > 0; i--){
           buffer = n / 10;
            if (n % 10 < (buffer % 10)){
                isIncreasing = false;
            }
            if (n % 10 == buffer % 10){   //Убрать этот if если яисла могут повторяться (11122 в таком виде)
                isIncreasing = false;
            }
            n = n / 10;
        }

        return isIncreasing;
    }

}
