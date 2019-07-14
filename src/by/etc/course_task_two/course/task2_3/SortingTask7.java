package by.etc.course_task_two.course.task2_3;

//Даны две последовательности, указать те места, куда вставлять числа из второй посоледовательности во вторую. В итоге должен получится отсортированный массив

public class SortingTask7 {
    public void sort(){
        int array1 [] = {1,3,4,6,8};
        int array2 [] = {2,3,4,5,6};
        int k;
        PrintArray.printArray(array1);
        PrintArray.printArray(array2);
        for (int i = 0; i < array2.length; i++){
            k = binarySearch(array1, i, array2[i]);
           array1 = insertIntoArray(array1, array2[i], k);
        }
        PrintArray.printArray(array1);
    }


    public int binarySearch(int array[], int i, int arrayValue) {
        int low = 0;
        int high = array.length - 1;
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
    public int [] insertIntoArray(int array [], int i, int pos){
        int result [] =  new int [array.length + 1];
        for (int k = 0; k < array.length; k++){
            result[k] = array[k];
        }
        for (int j = result.length - 1; j > pos; j--){
            result[j] = result [j - 1];
        }
        result[pos] = i;
        System.out.print("Insert into " + pos + " position");
        System.out.println();
        return result;
    }
}
