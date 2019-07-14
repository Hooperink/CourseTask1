package by.etc.course_task_two.course.task2_3;

//Сортирова обменами

public class SortingTask4 {  //Переделал в статику так как было лень заново писать для 8ого задания
    public static int [] sort(int ... arr){
        int buffer, counter = 0;
        boolean isSorted = false;
        PrintArray.printArray(arr);
        while(!isSorted){
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++){
                if (arr[i] > arr[i + 1]){
                    isSorted = false;
                    counter++;
                    buffer = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = buffer;
                }
            }
        }
        PrintArray.printArray(arr);
        System.out.print("Number of permutations: " + counter);
        System.out.println();
        return arr;
    }
}
