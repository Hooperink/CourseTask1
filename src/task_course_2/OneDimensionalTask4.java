package task_course_2;

public class OneDimensionalTask4 {
	public void count (){
		int array[] = OneDimensionalArrayIn.arrayIn();
		int max = array[0], min = array[0], change, iMax = 0, iMin = 0;
		for (int i = 0; i < array.length; i++){
			if (array[i] > max){
				max = array[i];
				iMax = i;
			}
			if (array[i] < min){
				min  = array[i];
				iMin = i;
			}
		}
		change = array[iMax];
		array [iMax] = array[iMin];
		array[iMin] = change;
		OneDimensionalArrayPrint.printArray(array);
	}
}
