package by.etc.course_task_two.course.task2_4;

//Найти второе максимальное число

public class DecompositionTaskFive {
    public static void main(String[] args) {
        int array [] = {1,2,3,4,5,6,7};
        int max = findMax(array);
        int secondMax = findSecondMax(max, array);
        System.out.print(secondMax);
    }

    public static int findMax(int array[]){
        int max = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    public static int findSecondMax(int max, int array[]){
        int secondMax = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] > secondMax && array[i] < max){
                secondMax = array[i];
            }
        }
        return secondMax;
    }


}
