package by.etc.course_task_two.course.task2_2;

//Матрицу 10х20 заполнить случайными числами от 0 до 15.
//Вывести на экран саму матрицу и номера строк, в которых число 5 встречается три и более раз.

public class TwoDimensionalTask11 {
    public void count(){
        int counterForFives;
        int array [][] = RandomTwoDimensionalArrayFill.ArrayFillFromTenToTwenty(10,20);
        PrintTwoDimensionalArray.PrintArray(array);
        for (int i = 0; i < array.length; i++){
            counterForFives = 0;
            for (int j = 0; j < array[i].length; j++){
                if (array[i][j] == 5){
                    counterForFives++;
                }
            }
            if (counterForFives >= 3){
                System.out.print("Row number " + i + " has more then two fives" + '\n');
            }
        }
    }
}
