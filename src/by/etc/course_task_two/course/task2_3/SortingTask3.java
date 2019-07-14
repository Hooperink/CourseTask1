package by.etc.course_task_two.course.task2_3;

//сортировка выбором

public class SortingTask3 {
    public void sort(){
        int array [] = FillOneDimensionArray.fillArray();
        int max, buffer;
        PrintArray.printArray(array);
        for (int i = 0; i < array.length - 1; i++){
            max = i;
           for (int j = i + 1; j < array.length; j++){
               if (array[max] < array[j]) {
                   max = j;
               }
           }
            buffer = array[i];
            array[i] = array[max];
            array[max] = buffer;
        }
        PrintArray.printArray(array);
    }
}

