package by.etc.course_task_two.course.task2_1;

public class OneDimensionalTask6 {
	public void count(){
		int array[] = OneDimensionalArrayIn.arrayIn();
		int summ = 0;
		for (int i = 0; i < array.length; i++){
			boolean flag  = false;
			for (int j = 2; j < i; j++){
				if (i % j == 0)
					flag = true;
			}
			if (!flag)
				summ += array[i];
		}
		System.out.print("Summ = " + summ);
	}
}
