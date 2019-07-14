package by.etc.course_task_two.course.task2_2;

import java.util.Scanner;

//Сформировать квадратную матрицу порядка n по заданному обрвзцу

public class TwoDimensionalTask4 {
    public void count(){
        int n = 1, counterFromDownToUp, counterFromUpToDown;
        Scanner in = new Scanner(System.in);
        while (n % 2 != 0) {
            System.out.print("Enter n (n % 2 = 0): ");
            n = in.nextInt();
        }
        in.close();
        int array[][] = new int [n][n];
        for (int i = 0; i < n; i++){
            counterFromDownToUp = 0;
            counterFromUpToDown = n-1;
            if (i % 2 == 0){
                while(counterFromDownToUp < n) {
                    array[i][counterFromDownToUp] = counterFromDownToUp+1;
                    counterFromDownToUp++;
                }
            }
            if (i % 2 != 0){
                while(counterFromUpToDown > -1) {
                    array[i][counterFromDownToUp] = counterFromUpToDown+1;
                    counterFromUpToDown--;
                    counterFromDownToUp++;
                }
            }
        }
        PrintTwoDimensionalArray.PrintArray(array);
    }
}
