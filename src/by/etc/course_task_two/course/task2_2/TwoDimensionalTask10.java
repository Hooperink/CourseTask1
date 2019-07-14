package by.etc.course_task_two.course.task2_2;

import java.util.Scanner;

//Найти положительные элементы главной диагонали матрицы

public class TwoDimensionalTask10 {
    public void count(){
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
        int array [][] = RandomTwoDimensionalArrayFill.ArrayFillWithNegative(n);
        PrintTwoDimensionalArray.PrintArray(array);

        for(int i = 0, j = 0; i < array.length; i++, j++){
            if (array[i][j] > 0){
                System.out.print(array[i][j] + " ");
            }
        }
    }
}
