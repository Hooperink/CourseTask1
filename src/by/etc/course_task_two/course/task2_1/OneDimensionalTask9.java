package by.etc.course_task_two.course.task2_1;

public class OneDimensionalTask9 {
	public void count (){
			int array[] = OneDimensionalArrayIn.arrayIn();
			int firstCounter, maxCounter = 0, number = 0;
			for (int i = 0; i < array.length; i++){
				firstCounter = 1;
				for (int j = i + 1; j < array.length; j++){
					if (array[i] == array[j]){
						firstCounter++;
					}
				}
				if (firstCounter > maxCounter){
					number = array[i];
					maxCounter = firstCounter;
				}
				if (firstCounter == maxCounter){
					number = number < array[i] ? number : array[i];
				}
			}
			System.out.print("Your number is: " + number);
	}
}
