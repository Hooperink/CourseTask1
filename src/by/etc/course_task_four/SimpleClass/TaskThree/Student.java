package by.etc.course_task_four.SimpleClass.TaskThree;

import java.util.Random;

public class Student {
   private String firstName;
   private String secondName;
   private int groupNumber;
   private int grades[] = new int[5];
   Random random = new Random();

   Student (String firstName, String secondName, int groupNumber){
       this.firstName = firstName;
       this.secondName = secondName;
       this.groupNumber = groupNumber;
   }
   Student (String firstName, String secondName, int groupNumber, int ... grade){
       this.firstName = firstName;
       this.secondName = secondName;
       this.groupNumber = groupNumber;
       this.grades = grade;
   }

    public void setGrades() {
        for (int i = 0; i < 5; i++) {
            this.grades[i] = random.nextInt(11);
        }

    }

    public void printSecondNameAndGroupNumber(){
       System.out.print("Second Name = " + this.secondName + " Group number = " + this.groupNumber);
    }

    public int[] getGrades() {
        return this.grades;
    }

    public boolean checkGrades(){
       boolean isTrue = true;
        for (int i = 0; i < grades.length; i++) {
            if (this.grades[i] < 9){
                isTrue = false;
            }
        }
       return isTrue;
    }
}
