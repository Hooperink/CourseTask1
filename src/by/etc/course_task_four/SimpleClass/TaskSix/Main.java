package by.etc.course_task_four.SimpleClass.TaskSix;

public class Main {
    public static void main(String[] args) {
        TimeClass timeClass = new TimeClass();
        timeClass.printTime();
        timeClass.setHours(12);
        timeClass.setMin(13);
        timeClass.setSec(70);
        timeClass.printTime();
        timeClass.setTime();
        timeClass.printTime();
    }

}
