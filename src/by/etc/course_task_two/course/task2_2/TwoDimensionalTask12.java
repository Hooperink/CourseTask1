package by.etc.course_task_two.course.task2_2;

import java.util.Scanner;

//Отсортировать строки матрицы

public class TwoDimensionalTask12 {
    public void count(){
        int n, m;
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

        int array [][] = RandomTwoDimensionalArrayFill.ArrayFill(n, m);
        PrintTwoDimensionalArray.PrintArray(array);
        int reverseArray [] = new int [m];
        for (int i = 0; i < array.length; i++){
            array[i] = BubbleSort.sort(array[i]);
        }
        PrintTwoDimensionalArray.PrintArray(array);
        for (int i = 0; i < array.length; i++ ){
            for (int j = array[i].length - 1, k = 0; j > -1; j--, k++){
                reverseArray[k] = array [i][j];
            }

            //array[i] = reverseArray; Не могу понять почему это не сработало(
            // хотя при сортировки по возрастанию всё сработало
            for (int p = 0; p < array[i].length; p++){
                     array[i][p] = reverseArray[p];
            }
        }
        PrintTwoDimensionalArray.PrintArray(array);
    }
}
