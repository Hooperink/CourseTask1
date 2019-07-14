package by.etc.course_task_two.course.task2_3;

//сортровка вставками с бинарным поиском

public class SortingTask5 {
    public void sort(){
        int array [] = FillOneDimensionArray.fillArray();
        int buffer, k;
        PrintArray.printArray(array);
        for (int i = 1; i < array.length; i++){
            k = binarySearch(array, i, array[i]);
            buffer = array[i];
            for (int j = i; j > k; j--){
                array[j] = array[j - 1];
            }
            array[k] = buffer;
        }
        PrintArray.printArray(array);
    }


    public int binarySearch(int array[], int i, int arrayValue) {
        int low = 0;
        int high = i - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arrayValue >= array[high]) {
                return high + 1;
            }
            if (arrayValue <= array[mid]) {
                high = mid - 1;
                if (arrayValue == array[mid]){
                    return mid;
                }
            } else if(arrayValue >= array[mid]){
                low = mid + 1;
                if (arrayValue == array[mid]){
                    return mid + 1;
                }
            }
        }
        return mid;
    }

}
