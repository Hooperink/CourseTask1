package by.etc.course_task_one.course;

import java.util.Scanner;

public class CycleEight {
    public void count() {
        int m, n, k, ost1, ost2;      
        boolean flag1 = false, flag2 = false;
        System.out.println("Enter m:");
        Scanner in = new Scanner(System.in);
        m = in.nextInt();
        System.out.println("Enter n:");
        n = in.nextInt();
        in.close();
        while(m != 0) {
            flag1 = false;
            ost1 = m % 10;
            m = m / 10;
            k = n;
            while (k != 0 && !flag1) {
                ost2 = k % 10;
                k = k / 10;
                if (ost1 == ost2) {
                    System.out.print(ost2 + " ");   
                    flag1 = true;
                    flag2 = true;
                }                
            }            
        }
        if (!flag2)
            System.out.print("None");   
    }   
}
