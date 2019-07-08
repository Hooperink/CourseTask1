package by.etc.course_task_one.course;

import java.util.Scanner;

public class LinearFour {
    public void count() {
        double a,b,z;
        System.out.println("Enter a: ");
        Scanner in = new Scanner(System.in);
        a = in.nextDouble();      
        in.close();     
        b = (int)a;        
        z = (a - b) * 1000 + b/1000;
        System.out.println("Answer: " + z);
    }
}