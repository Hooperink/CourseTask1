package task_course_2;

public class OneDimensionalTask5 {
	public void count (){
		int array[] = OneDimensionalArrayIn.arrayIn();
		for (int i = 0; i < array.length; i++){
			if (array[i] > i)
				System.out.print(array[i] + " ");
		}
	}
}
