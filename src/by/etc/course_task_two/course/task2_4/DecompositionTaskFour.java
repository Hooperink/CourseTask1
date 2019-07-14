package by.etc.course_task_two.course.task2_4;

//Максимальная дистанция между какими двумя точками координат?

import java.util.Scanner;

public class DecompositionTaskFour {
    public static void main(String[] args) {
        int arrayX [] = {1, 10, 3, 4, 2};
        int arrayY [] = {1, 10, 3, 4, 2};
        getAnswer(arrayX,arrayY);
    }

    public static double getDistance(int x1, int y1, int x2, int y2){
        return Math.sqrt(Math.pow(2, x2 - x1) + Math.pow(2, y2 - y1));
    }

    public static void getAnswer (int []arrayX, int []arrayY){
        double max = 0;
        int coords1 = -1;
        int coords2 = -1;
        for (int i = 0; i < arrayX.length; i++){
            for (int j = i + 1; j < arrayX.length; j++){
                if ((getDistance(arrayX[i],arrayY[i],arrayX[j], arrayY[j])) > max){
                    max = getDistance(arrayX[i],arrayY[i],arrayX[j], arrayY[j]);
                    coords1 = i;
                    coords2 = j;
                }
            }
        }
        System.out.print("The greatest distance is between " + arrayX[coords1] + "." + arrayY[coords1]
                + " and " + arrayX[coords2] + "." + arrayY[coords2]);
    }
}
