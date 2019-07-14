package by.etc.course_task_two.course.task2_4;

// Найти сумму D[1]+D[2]+D[3], D[3]+D[4]+D[5], D[4]+D[5]+D[6]

public class DecompositionTaskEight {
    public static void main(String[] args) {
        int array [] = {1,2,3,4,5,6};
        int sum = getSumOfThreeNumbers(array,0) + getSumOfThreeNumbers(array, 2)
                + getSumOfThreeNumbers(array, 3);
        System.out.print(sum);

    }
    public static int getSumOfThreeNumbers (int []array, int pos){
        int sum = 0;
        int count = 0;
        while (count < 3){
            sum += array[pos];
            count++;
            pos++;
        }
        return sum;
    }
}

