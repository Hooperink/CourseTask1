package by.etc.course_task_two.course.task2_3;

import by.etc.course_task_two.course.task2_2.RandomTwoDimensionalArrayFill;

import java.util.Random;
import java.util.Scanner;

public class FillOneDimensionArray {
    public static int [] fillArray (){
        Scanner in = null;
        Random r = new Random();
        int n;
        try {
            in = new Scanner(System.in);
            System.out.print("Enter n: ");
            n = in.nextInt();
        }
        finally {
            if (in != null) {
                //in.close();
            }
        }
        int array [] = new int[n];
        for (int i = 0; i < array.length; i++){
            array[i] = r.nextInt(20 + 1 + 20) - 20;
        }
        return array;
    }
}
