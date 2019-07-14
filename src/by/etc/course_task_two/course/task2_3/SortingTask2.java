package by.etc.course_task_two.course.task2_3;

 // Заданы 2 упорядоченных массива, сделать из них один упорядоченный

public class SortingTask2 {
        public void sort() {
            int arr1[] = {1, 2, 3, 4, 5};
            int arr2[] = {3, 4, 5, 6, 7, 8};
            int newArray[]  = new int [arr1.length + arr2.length];
            int counterOfSecondArray = 0;
            int buffer, counter = 0;
            boolean isSorted = false;
            for (int i = 0; i < newArray.length; i++){
                if (i < arr1.length){
                    newArray[i] = arr1[i];
                }else {
                    newArray[i] = arr2[counterOfSecondArray];
                    counterOfSecondArray++;
                }
            }
            PrintArray.printArray(newArray);

            while(!isSorted){
                isSorted = true;
                for (int i = 0; i < newArray.length - 1; i++){
                    if (newArray[i] > newArray[i + 1]){
                        isSorted = false;
                        counter++;
                        buffer = newArray[i];
                        newArray[i] = newArray[i + 1];
                        newArray[i + 1] = buffer;
                    }
                }
            }
            PrintArray.printArray(newArray);
        }
}