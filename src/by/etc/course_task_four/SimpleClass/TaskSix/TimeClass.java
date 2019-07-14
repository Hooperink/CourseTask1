package by.etc.course_task_four.SimpleClass.TaskSix;

import java.util.Scanner;

public class TimeClass {
    private int sec;
    private int min;
    private int hours;

    public void setHours(int hours) {
        this.hours = hours > 0 ? hours : 0;
    }

    public void setMin(int min) {
        if (min < 60 && min >= 0) {
            this.min = min;
        } else {
            this.min = 0;
        }
    }
    public void setSec(int sec) {
        if (sec < 60 && sec >= 0) {
            this.sec = sec;
        } else {
            this.sec = 0;
        }
    }

    public void printTime (){
        System.out.print(hours + "hh " + min + "mm " + sec + "sec " + '\n');
    }

    public void setTime(){
        System.out.print("Enter hours: ");
        setHours(getValueFromKeyBoard());
        System.out.println("Enter minutes: ");
        setMin(getValueFromKeyBoard());
        System.out.println("Enter seconds: ");
        setSec(getValueFromKeyBoard());
    }

    public static int getValueFromKeyBoard(){
        int k = 0;
        Scanner in = new Scanner(System.in);
            if (in.hasNextInt()){
                k = in.nextInt();
            } else {
                System.out.print("Not a number \n" );
            }
        return k;
    }
}
