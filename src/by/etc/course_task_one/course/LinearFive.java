package by.etc.course_task_one.course;

import java.util.Scanner;

public class LinearFive {
    public void count() {
        int hour, min, sec;
        System.out.println("Enter a: ");
        Scanner in = new Scanner(System.in);        
        sec = in.nextInt();   
        in.close();
        min  = sec / 60;
        sec = sec % 60;
        hour = min / 60;
        min = min % 60;
        System.out.print(hour + "� " + min + "��� " + sec + "���");        
    }
}
