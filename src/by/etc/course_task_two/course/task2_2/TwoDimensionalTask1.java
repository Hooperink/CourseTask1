package by.etc.course_task_two.course.task2_2;

import java.util.Scanner;

 //Дана матрица. Вывести на экран все ечетные стобцы, у которых первый элемент больше первого

public class TwoDimensionalTask1 {
	public void count (){
		int n, m;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter n: ");
		n = in.nextInt();
		System.out.print("Enter m: ");
		m = in.nextInt();
		in.close();
		int array [][] = n == m ? RandomTwoDimensionalArrayFill.ArrayFill(n) :
				RandomTwoDimensionalArrayFill.ArrayFill(n, m);
		PrintTwoDimensionalArray.PrintArray(array);
		for (int j = 0; j < m; j = j + 2){
			if (array[0][j] > array [n-1][j]){
						for (int i = 0; i < n; i++) {
							System.out.print(array[i][j] + " ");
						}
			}
			System.out.println();
		}
	}
}
