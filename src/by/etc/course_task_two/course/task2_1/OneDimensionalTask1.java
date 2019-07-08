package by.etc.course_task_two.course.task2_1;

import java.util.Scanner;

public class OneDimensionalTask1 {
	public void count (){
		int k, sum = 0;
		int array[] = OneDimensionalArrayIn.arrayIn();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter K");
		k = in.nextInt();
		in.close();
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] % k == 0)
				sum += array[i];
		}
		System.out.print("Sum = " + sum);
	}
}
