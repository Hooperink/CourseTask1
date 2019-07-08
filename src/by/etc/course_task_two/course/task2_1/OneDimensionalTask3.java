package by.etc.course_task_two.course.task2_1;

public class OneDimensionalTask3 {
	public void count (){
		int negative = 0, positive = 0, zero = 0;
		int array[] = OneDimensionalArrayIn.arrayIn();
		for (int i = 0; i < array.length; i++){
			if (array[i] > 0)
				positive++;
			if (array[i] == 0)
				zero++;
			if (array[i] < 0)
				negative++;
		}
		System.out.print("Negative: " + negative + " Positive: " + positive + " Zero:" + zero);
	}
}
