package by.etc.course_task_one.course;

import java.util.Scanner;

public class BranchingFive {
    public void count() {
        int x;
        double res;        
        System.out.println("Enter x: ");
        Scanner in = new Scanner(System.in);        
        x = in.nextInt();            
        in.close();
        if (x <= 3)
            res = x * x + 3 * x + 9;            
        else
            res = 1 / (Math.pow(x, 3) + 6);
        System.out.println("Result is: " + res);
    }    
}
