package by.etc.course_task_two.course.task2_2;

import java.util.Scanner;

//Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом стобце.
//Определить какой столбец содержит максимальную сумму

public class TwoDimensionalTask9 {
    public void count(){
        int n, m,whichColumn = -1, sum,max = 0;
        Scanner in = null;
        try {
            in = new Scanner(System.in);
            System.out.print("Enter n: ");
            n = in.nextInt();
            System.out.print("Enter m: ");
            m = in.nextInt();
        }
        finally {
            if (in != null) {
                in.close();
            }
        }

        int array [][] = n == m ? RandomTwoDimensionalArrayFill.ArrayFill(n) :
                RandomTwoDimensionalArrayFill.ArrayFill(n, m);
        PrintTwoDimensionalArray.PrintArray(array);

        for (int j = 0; j < m; j++){
            sum = 0;
            for (int i = 0; i < array.length; i++){
                sum += array[i][j];
            }
            if (sum > max){
                max = sum;
                whichColumn = j;
            }
            System.out.print(sum + " " + '\n');
        }
        System.out.print("Max sum on column position " + whichColumn);
    }
}
