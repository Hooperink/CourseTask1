package by.etc.course_task_one.course;

public class CycleFour {
    public void count() {
        double res = 1;
        for (int i = 1; i <= 200; i++)
            res *= i*i;        
        System.out.print("Multiplication of 200 sqrts = " + res);
    }
}
