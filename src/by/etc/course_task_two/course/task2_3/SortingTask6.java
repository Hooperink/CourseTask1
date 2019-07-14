package by.etc.course_task_two.course.task2_3;

//Сортировка Шелла

public class SortingTask6 {
    public void sort() {
        int arr[] = FillOneDimensionArray.fillArray();
        int buffer;
        int mid = arr.length / 2;
        PrintArray.printArray(arr);
        while(mid > 0){
            for (int i = 0; i < arr.length - mid; i++){
                int j = i;
                while ((j >= 0) && arr[j] > arr[j + mid]){
                    buffer = arr[j];
                    arr[j] = arr[j + mid];
                    arr[j + mid] = buffer;
                    j--;

                }
            }
            mid /= 2;
        }

        PrintArray.printArray(arr);

    }
}
