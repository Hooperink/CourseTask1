package task_course_1;

public class CycleThree {
    public void count() {
        int res = 0;
        for (int i = 1; i <= 100; i++)
            res += i*i;        
        System.out.print("Summ of 100 sqrts = " + res);
    }
}