package task_course_1;

import java.util.Scanner;

public class CycleTwo {
    public void count() {
        double a, b, h;
        Scanner in = new Scanner(System.in);
        System.out.println("a: ");                
        a = in.nextDouble();
        System.out.println("b: ");                
        b = in.nextDouble();
        System.out.println("h: ");                
        h = in.nextDouble();
        in.close();
        while(a<=b) {
            if (a>2)
                System.out.println(" x= " + a + " y= " + a);
            else
                System.out.println(" x= " + a + " y= " + -a);
            a += h;
        }        
    }
}
