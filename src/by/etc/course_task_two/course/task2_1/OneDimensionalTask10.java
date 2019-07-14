package by.etc.course_task_two.course.task2_1;

public class OneDimensionalTask10 {
	public void count(){
		int array[] = OneDimensionalArrayIn.arrayIn();
		for (int i = 1; i<array.length; i = i+2){
			array[i] = 0;
		}
		OneDimensionalArrayPrint.printArray(array);
	}
}
