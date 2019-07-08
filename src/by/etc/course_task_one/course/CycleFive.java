package by.etc.course_task_one.course;

import java.util.Scanner;

public class CycleFive {
    public void count() {
        Scanner in = new Scanner(System.in);
        int n, i = 1;
        double e, sum = 0;
        boolean flag = false;
        System.out.println("Enter lenght of number series");
        n = in.nextInt();
        System.out.println("e");
        e = in.nextDouble();
        in.close();
        while(i <= n && !flag) {
            sum += 1/Math.pow(i,i);
            if (sum >= e)
                flag = true;
            i++;
        }
        if (flag)
            System.out.print("sum= " + sum);
        else
            System.out.print("Can`t be solved");
        
    }
}
