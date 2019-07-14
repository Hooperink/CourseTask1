package by.etc.course_task_two.course.task2_4;

//У кого цифр в самом числе больше

public class DecompositionTaskEleven {
    public static void main (String[] args){
        int k = 1244;
        int m = 1234;
        if (DecompositionTaskTen.getAmountOfArray(k) > DecompositionTaskTen.getAmountOfArray(m)){
            System.out.print(k + " have more numbers than " + m);
        } else if (DecompositionTaskTen.getAmountOfArray(k) < DecompositionTaskTen.getAmountOfArray(m)){
            System.out.print(m + "have more numbers than " + k);
        } else {
            System.out.print("Equal");  // Использовал метод из 10ой задачи декомпозиции
        }

    }

}
