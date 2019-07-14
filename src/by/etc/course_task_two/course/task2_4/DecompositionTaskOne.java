package by.etc.course_task_two.course.task2_4;

//Найти НОК

public class DecompositionTaskOne {
    public static void main(String[] args) {
        int a = 4;
        int b = 8;
        System.out.print(getNOK(a,b));
    }

    public static int getNOD (int a, int b){
        return b == 0 ? a : getNOD(b, a % b);
    }

    public static int getNOK (int a, int b){
        return (a * b) / getNOD(a,b);
    }
}

