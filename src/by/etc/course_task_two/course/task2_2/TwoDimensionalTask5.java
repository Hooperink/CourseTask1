package by.etc.course_task_two.course.task2_2;

import java.util.Scanner;

//Сформировать квадратную матрицу порядка n по заданному обрвзцу

public class TwoDimensionalTask5 {
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
            for (int j = 0; j < array.length - i; j++) {
                array[i][j] = i + 1;
            }
        }
        PrintTwoDimensionalArray.PrintArray(array);
    }
}


