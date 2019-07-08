package by.etc.course_task_one.course;

import java.util.Scanner;

public class BranchingThree {
    public void count() {
        int x1, x2, x3, y1, y2, y3;
        Scanner in = new Scanner(System.in);       
        System.out.println("Enter x1: ");               
        x1 = in.nextInt();        
        System.out.println("Enter y1: ");               
        y1 = in.nextInt();      
        System.out.println("Enter x2: ");               
        x2 = in.nextInt();
        System.out.println("Enter y2: ");               
        y2 = in.nextInt();    
        System.out.println("Enter x3: ");               
        x3 = in.nextInt();
        System.out.println("Enter y3: ");               
        y3 = in.nextInt();            
        in.close();
       if (((y3 - y1) / (y2 - y1)) == ((x3 - x1) / (x2 - x1)))
           System.out.print("Three points on one line: true");
       else
           System.out.print("Three points on one line: false");
    }
}
