package by.etc.course_task_two.course.task2_2;

import java.util.Scanner;

//Сформировать квадратную матрицу порядка N по правилу: A[I, J] = sin((I^2 - J^2)/N)
// и подсчитать количество положительных элементов в ней

public class TwoDimensionalTask7 {
    public void count() {
        int n = 1; int positiveCounter = 0;
        Scanner in = null;
        try {
            in = new Scanner(System.in);
            while (n % 2 != 0) {
                System.out.print("Enter n (n % 2 = 0): ");
                n = in.nextInt();
            }
        } finally {
            if (in != null) {
                in.close();
            }
        }

        double array[][] = new double[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = Math.sin ((i * i - j * j) / n);
                if (array[i][j] > 0){
                    positiveCounter++;
                }
            }
        }
        PrintTwoDimensionalArray.PrintArray(array);
        System.out.print("Positive: " + positiveCounter);
    }
}
