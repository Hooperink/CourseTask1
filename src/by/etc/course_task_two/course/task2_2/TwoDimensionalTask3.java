package by.etc.course_task_two.course.task2_2;

import java.util.Scanner;

//Дана матрица. Вывести к-ую строку и р-ый столбец матрицы.

public class TwoDimensionalTask3 {
    public void count(){
        int n, m, k, p;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        n = in.nextInt();
        System.out.print("Enter m: ");
        m = in.nextInt();
        System.out.print("Enter k: ");
        k = in.nextInt();
        System.out.print("Enter p: ");
        p = in.nextInt();
        in.close();
        int array [][] = n == m ? RandomTwoDimensionalArrayFill.ArrayFill(n) :
                RandomTwoDimensionalArrayFill.ArrayFill(n, m);
        PrintTwoDimensionalArray.PrintArray(array);
            for (int i = 0; i < m; i++) {
                System.out.print(array[k-1][i] + " ");
            }
            System.out.println();
            for (int i = 0; i < n; i++) {
                System.out.print(array[i][p-1] + " ");
            }
            System.out.println();
    }
}
