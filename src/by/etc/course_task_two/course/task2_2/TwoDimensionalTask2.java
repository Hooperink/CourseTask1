package by.etc.course_task_two.course.task2_2;

import java.util.Scanner;

//Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали

public class TwoDimensionalTask2 {
    public void count(){
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        n = in.nextInt();
        in.close();
        int array [][] = RandomTwoDimensionalArrayFill.ArrayFill(n);
        PrintTwoDimensionalArray.PrintArray(array);
        for (int i = 0; i < n; i++) {
            System.out.print(array[i][i] + " ");
        }
        System.out.println();
        for (int i = 0, j = n-1; i < n; i++, j--) {
            System.out.print(array[i][j] + " ");
        }
    }
}
