package by.etc.course_task_two.course.task2_2;

import java.util.Scanner;

/*В числовой матрице поменять местами два стобца любых стобца*/

public class TwoDimensionalTask8 {
    public void count()
    {
        int n, m, k, p;
        Scanner in = null;
        try {
            in = new Scanner(System.in);
            System.out.print("Enter n: ");
            n = in.nextInt();
            System.out.print("Enter m: ");
            m = in.nextInt();
            System.out.print("Enter k: ");
            k = in.nextInt();
            System.out.print("Enter p: ");
            p = in.nextInt();
        }
        finally {
            if (in != null) {
                in.close();
            }
        }
        int array [][] = n == m ? RandomTwoDimensionalArrayFill.ArrayFill(n) :
                RandomTwoDimensionalArrayFill.ArrayFill(n, m);
        PrintTwoDimensionalArray.PrintArray(array);
        int switchArray [] = new int [n];

        for (int i = 0; i < array.length; i++){
            switchArray[i] = array [i][k];
            array [i][k] = array [i][p];
            array[i][p] = switchArray[i];
        }
        PrintTwoDimensionalArray.PrintArray(array);
    }
}



