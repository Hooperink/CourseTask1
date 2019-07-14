package by.etc.course_task_two.course.task2_4;

public class DecompositionTaskSixteen {
    public static void main(String[] args) {
        int n = 400;
        int amountOfOperations;
        int sum = 0;
        for (int i = 1; i <= n; i++){
            amountOfOperations = DecompositionTaskTen.getAmountOfArray(i); // функция из 10 задаи (снова)
            if (onlyOdd(i, amountOfOperations)){
                sum += i;
            }
        }
        System.out.print("Sum = " + sum + " amount of even: " + howManyEven(sum));
    }

    public static boolean onlyOdd(int n, int amountOfOperations){
        boolean isOdd = true;
        for (int i = amountOfOperations; i > 0; i--){
            if (n % 2 == 0){
                isOdd = false;
            }
            n = n / 10;
        }
        return isOdd;
    }

    public static int howManyEven (int n){
        int counter = 0;
        while (n > 0){
            if (n % 2 == 0){
                counter++;
            }
            n = n / 10;
        }
        return counter;
    }
}
