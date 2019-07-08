package by.etc.course_task_one.course;

public class CycleThree {
    public void count() {
        int res = 0;
        for (int i = 1; i <= 100; i++)
            res += i*i;        
        System.out.print("Summ of 100 sqrts = " + res);
    }
}