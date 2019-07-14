package by.etc.course_task_two.course.task2_1;

public class OneDimensionalTask7 {
	public void count(){
		int array[] = OneDimensionalArrayIn.arrayIn();
		int max = 0;
		for (int i = 0; i < array.length-1; i++)
		{
			if (array[i] + array[i+1] > max)
				max = array[i] + array[i+1];
		}
		System.out.print("Max summ = " + max);
	}
}
