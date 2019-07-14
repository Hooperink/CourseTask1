package by.etc.course_task_two.course.task2_4;

//Найти НОД 4ех чисел

public class DecompositionTaskTwo {
    public static void main(String[] args) {
        int a = 8;
        int b = 8;
        int c = 16;
        int d = 16;
        System.out.print(DecompositionTaskOne.getNOD(DecompositionTaskOne.getNOD(a,b),DecompositionTaskOne.getNOD(c,d)));
    }
}
