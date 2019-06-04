package task_course_2;

import java.util.Scanner;

public class OneDimensionalArrayIn {
		static public int[] arrayIn (){
			int size;
			Scanner in = new Scanner(System.in);
			System.out.println("Enter size of array N");
			size = in.nextInt();
			int array[] = new int[size];
			System.out.println("Lets fill your array");
			for (int i = 0; i < array.length; i++)
			{
				array[i] = in.nextInt();
			}
			return  array;
		}
}
