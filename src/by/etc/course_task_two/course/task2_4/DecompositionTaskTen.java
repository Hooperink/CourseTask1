package by.etc.course_task_two.course.task2_4;

import by.etc.course_task_two.course.task2_3.PrintArray;

//Дано натуральное число N из его цифр сделать массив

public class DecompositionTaskTen {
    public static void main(String[] args) {
        int n = 34563;
        PrintArray.printArray(getArray(n, getAmountOfArray(n)));
    }

    public static int getAmountOfArray(int n){
        int counter = 0;
        while (n != 0){
            n = n / 10;
            counter++;
        }
        return counter;
    }

    public static int [] getArray (int a, int size){
        int array [] = new int [size];
        for (int i = 0; i < array.length; i++){
            array[i] = a % 10;
            a = a / 10;
        }
        return array;
    }
}
