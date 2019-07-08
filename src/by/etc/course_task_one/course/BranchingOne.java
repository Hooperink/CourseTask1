package by.etc.course_task_one.course;

import java.util.Scanner;

public class BranchingOne {
    public void count() {
        int a = 0, b = 0, c = 0;
        Scanner in = new Scanner(System.in);
        while (a <= 0) {
            System.out.println("Enter a: ");               
            a = in.nextInt();
        }
        while (b <= 0) {
            System.out.println("Enter b: ");               
            b = in.nextInt();
        }
        while (c <= 0) {
            System.out.println("Enter c: ");               
            c = in.nextInt();
        }
        in.close();
        if ((a + b + c) == 180) {
            System.out.print("May exist ");
            if (a == 90)
                System.out.print("A = 90");
            if (b == 90)
                System.out.print("B = 90");
            if (c == 90)
                System.out.print("C = 90");
        }
        else
            System.out.print("Can't exist");
    }
}