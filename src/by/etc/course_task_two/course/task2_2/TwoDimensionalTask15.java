package by.etc.course_task_two.course.task2_2;

import java.util.Scanner;

/* Найдите наибольший элемент матрицы и заменить все нечетные элементы на него*/

public class TwoDimensionalTask15 {
    public void count(){
        int n, m, max = 0;
        Scanner in = null;
        try {
            in = new Scanner(System.in);
            System.out.print("Enter n: ");
            n = in.nextInt();
            System.out.print("Enter m: ");
            m = in.nextInt();
        } finally {
            if (in != null) {
                in.close();
            }
        }
        int array[][] = RandomTwoDimensionalArrayFill.ArrayFill(n, m);
        PrintTwoDimensionalArray.PrintArray(array);
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if (array[i][j] > max){
                    max = array[i][j];
                }
            }
        }

        System.out.print("Max value is:" + max);
        System.out.println();

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if (array[i][j] % 2 != 0 && array[i][j] != max){
                    array[i][j] = max;
                }
            }
        }
        PrintTwoDimensionalArray.PrintArray(array);
    }

}
