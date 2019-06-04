package task_course_2;

public class OneDimensionalTask8 {
	public void count(){
		int array[] = OneDimensionalArrayIn.arrayIn();
		int min = array[0], newArraySize = array.length, counter = 0;
		for (int i = 0; i < array.length; i++)
		{
			min = array[i] < min ? array[i] : min;
		}
		for (int i = 0; i < array.length; i++){
			if (array[i] == min)
			{
				newArraySize--;
			}
		}
		int newArray[] = new int[newArraySize];
		for (int i = 0; i < array.length; i++){
			if (array[i]!= min){
				newArray[counter] = array[i];
				counter++;
			}
		}
		OneDimensionalArrayPrint.printArray(newArray);
	}
}
