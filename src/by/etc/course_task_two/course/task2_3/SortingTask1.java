package by.etc.course_task_two.course.task2_3;

// Заданы два массива. Второй массив соеденить с 1ыйм между позицикй к и к + 1

public class SortingTask1 {
    public void sort(){
        int arr1[] = FillOneDimensionArray.fillArray();
        int arr2[] = FillOneDimensionArray.fillArray();
        int k = 3;
        int newArray [] = new int[arr1.length + arr2.length];
        PrintArray.printArray(arr1);
        PrintArray.printArray(arr2);
        for (int i = 0; i < k; i++ ){
            newArray[i] = arr1[i];
        }
        for (int i = 0, j = k; i < arr2.length; i++, j++){
              newArray[j] = arr2[i];
        }
        for (int i = k, j = (k + arr1.length); j < newArray.length; i++, j++){
            newArray[j] = arr1[i];
        }
        PrintArray.printArray(newArray);
    }
}
