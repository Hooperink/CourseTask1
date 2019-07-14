package by.etc.course_task_two.course.task2_3;

//Общий знаменатель дробей и их упорядочивание

public class SortingTask8 {
    public void sort(){
        int numerator [] = {12,5,7,21,11,9};
        int denominator [] = {24,15,33,3,17,12};
        int newNumerator [] = new int [numerator.length];
        boolean isTrue = false;
        int counter = 0;
        int max = 0;
        for (int i = 0; i < denominator.length; i++){
            if (denominator[i] > max){
                max = denominator[i];
            }
        }
        while (!isTrue){
            isTrue = true;
            counter++;
            for (int x : denominator){
                if ((max * counter) % x != 0){
                    isTrue = false;
                }
            }
        }
        int commonDenominator = max * counter;
        for (int i = 0; i < newNumerator.length; i++){
            newNumerator[i] = commonDenominator / denominator[i] * numerator[i];
        }
         newNumerator = SortingTask4.sort(newNumerator);
        for (int x : newNumerator){
            System.out.print(x + "/" + commonDenominator + " ");
        }
    }



}