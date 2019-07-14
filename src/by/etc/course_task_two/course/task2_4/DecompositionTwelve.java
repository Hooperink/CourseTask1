package by.etc.course_task_two.course.task2_4;

import by.etc.course_task_two.course.task2_3.PrintArray;

//Даны натуральные числа K и N. Написать метод формирования массива А, элементами
//которого являются числа, сумма цифр которых равна K и которые  не больше N

public class DecompositionTwelve {
    public static void main(String[] args) {
        int array[] = new int [0];
        int k = 6;
        int n = 1000;
        for (int i = 0; i < n; i++){
            if (sumOfNumbers(i) == k){
              array = pushToArray(array, i);
            }
        }
        PrintArray.printArray(array);
    }

    public static int sumOfNumbers(int a){
        int sum = 0;
        while (a != 0){
            sum += a % 10;
            a = a / 10;
        }
        return sum;
    }

    public static int [] pushToArray(int array[], int k){
        int newArray [] = new int[array.length + 1];
        for (int i = 0; i < array.length; i++){
            newArray[i] = array[i];
        }
        newArray[newArray.length - 1] = k;
        return newArray;
    }
}
