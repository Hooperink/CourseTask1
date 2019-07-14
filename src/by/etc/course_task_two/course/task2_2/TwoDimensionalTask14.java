package by.etc.course_task_two.course.task2_2;

import java.util.Scanner;

//Сформировать случайную матрицу m x n, состоящую из нулей и единиц,
// причем в каждом столбце число единиц равно номеру столбца

public class TwoDimensionalTask14 {
    public void count(){
        int n, m, counter = -1, amountOfOne = 0, coin;
        Scanner in = null;
        try {
            in = new Scanner(System.in);
            System.out.print("Enter n: ");
            n = in.nextInt();
            System.out.print("Enter m: ");
            m = in.nextInt();
        } finally {
            if (in != null) {
                in.close();
            }
        }
        int array[][] = new int [n][m];
        PrintTwoDimensionalArray.PrintArray(array);

        for (int j = 0; j < m; j++){
            amountOfOne = j < array.length ? j : array.length - 1;
            counter = -1;
            while (counter != amountOfOne){
                for (int i = 0; i < array.length; i++) {
                   if (counter != amountOfOne && array[i][j] == 0){
                        coin = (int) (2 * Math.random());
                        if (coin == 1) {
                            array[i][j] = 1;
                          counter++;
                      }
                   }
                }

            }
        }
        PrintTwoDimensionalArray.PrintArray(array);
    }
}
