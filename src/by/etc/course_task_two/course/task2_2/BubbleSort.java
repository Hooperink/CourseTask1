package by.etc.course_task_two.course.task2_2;

public class BubbleSort {
    public static int [] sort(int []a){
        boolean isSorted = false;
        int buf;
        while (!isSorted){
            isSorted = true;
            for (int i = 0; i < a.length - 1; i++){
                if (a[i] > a[i+1]){
                    isSorted = false;
                    buf = a[i];
                    a[i] = a[i+1];
                    a[i+1] = buf;
                }
            }
        }
        return a;
    }

}
