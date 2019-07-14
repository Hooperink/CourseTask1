package by.etc.course_task_two.course.task2_2;

import java.util.Scanner;

//Отсортировать строки матрицы

public class TwoDimensionalTask13 {
    public void count() {
        int n, m, buf;
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
        int reverseArray[] = new int[n];
        int array[][] = RandomTwoDimensionalArrayFill.ArrayFill(n, m);
        PrintTwoDimensionalArray.PrintArray(array);

        for (int i = 0; i < m; i++){
            boolean isSorted = false;
            while (!isSorted){
                isSorted = true;
                for (int j = 0; j < array.length - 1; j++){
                    if (array[j][i] > array[j + 1][i]){
                        isSorted = false;
                        buf = array [j][i];
                        array [j][i] =  array[j + 1][i];
                        array[j + 1][i] = buf;
                    }
                }
            }
        }
        PrintTwoDimensionalArray.PrintArray(array);

        for (int i = 0; i < m; i++){
            for (int j = array.length - 1, k = 0; j > -1; j--, k++){
                reverseArray[k] = array[j][i];
            }
            for (int j = 0; j < array.length; j++){
                array[j][i] = reverseArray[j];
            }
        }
        PrintTwoDimensionalArray.PrintArray(array);
    }
}
