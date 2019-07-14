package by.etc.course_task_two.course.task2_2;

import java.util.Random;

public class RandomTwoDimensionalArrayFill {

    static public int[][] ArrayFill (int n){
        Random r = new Random();
        int [][] array = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
            {
                array [i][j] = r.nextInt(30);
            }
        return array;
    }

    static public int[][] ArrayFill (int n,int m){
        Random r = new Random();
        int [][] array = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
            {
                array [i][j] = r.nextInt(30);
            }
        return array;
    }
    static public int[][] ArrayFillWithNegative (int n){
        Random r = new Random();
        int [][] array = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
            {
                array [i][j] = r.nextInt(15 + 1 + 15) - 15;
            }
        return array;
    }

    static public int[][] ArrayFillFromTenToTwenty (int n,int m){
        Random r = new Random();
        int [][] array = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
            {
                array [i][j] = r.nextInt(15  + 1);
            }
        return array;
    }
}
