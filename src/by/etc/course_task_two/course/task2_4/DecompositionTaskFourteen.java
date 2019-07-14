package by.etc.course_task_two.course.task2_4;

public class DecompositionTaskFourteen {
    public static void main(String[] args) {
        int k = 400;
        for (int i = 1; i <= k; i++){
            if (isAmstron(i)){
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isAmstron(int k){
        int sum = 0;
        int buffer = k;
        while (k != 0){
            sum += Math.pow( k % 10,DecompositionTaskTen.getAmountOfArray(buffer)); //Подсчёт цифр подтянул с 10ой задачи
            k = k / 10;
        }

        return sum == buffer ? true : false;
    }
}
