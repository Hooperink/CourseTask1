package task_course_2;

import java.util.Scanner;

public class OneDimensionalTask2 {
	public void count (){
		int z, counter = 0;
		int array[] = OneDimensionalArrayIn.arrayIn();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Z ");
		z = in.nextInt();
		in.close();
		for (int i = 0; i < array.length; i++){
			if (array[i] > z){
				array[i] = z;
				counter++;
			}
		}
		OneDimensionalArrayPrint.printArray(array);
		System.out.print('\n' + "replaced: " + counter);
	}
}
