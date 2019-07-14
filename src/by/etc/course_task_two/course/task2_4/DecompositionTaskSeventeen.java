package by.etc.course_task_two.course.task2_4;

//Из данного числа отняли сумму цифр, и т.д. пока не получится 0. Подсчитать количество вычитаний

public class DecompositionTaskSeventeen {
    public static void main(String[] args) {
        int n = 14242;
        System.out.print(amountOfOperations(n));
    }

    public static int sumOfNumbers(int n){
        int sum = 0;
        while (n > 0){
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }

    public static int amountOfOperations(int n){
        int counter = 0;
        while (n != 0){
            n = n - sumOfNumbers(n);
            counter++;
        }
        return counter;
    }
}
