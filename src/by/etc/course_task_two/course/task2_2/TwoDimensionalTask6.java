package by.etc.course_task_two.course.task2_2;

import java.util.Scanner;

//Сформировать квадратную матрицу порядка n по заданному обрвзцу

public class TwoDimensionalTask6 {
    public void count() {
        int n = 1;
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

        int array[][] = new int[n][n];
        for (int i = 0; i < array.length; i++) {
           if ((array.length / 2) > i) {
               for (int j = i; j < array.length - i; j++) {
                   array[i][j] = 1;
               }
           }else {
               for (int j = array.length / 2 - 1, k = array.length/2; k <= i ; j--, k++){
                   array[i][j] = 1;
                   array[i][k] = 1;
               }
           }

        }
        PrintTwoDimensionalArray.PrintArray(array);
    }
}
