package by.etc.course_task_four.SimpleClass.TaskThree;


public class Main {
    public static void main(String[] args) {
        Student arr [] = new Student[10];
        arr[0] = new Student("vad", "sdsd", 12);
        arr[1] = new Student("vaasdad", "scgrfdsd", 13);
        arr[2] = new Student("vvvdfvad", "svzdsd", 14);
        arr[3] = new Student("vcvbcvbad", "sdsd", 15);
        arr[4] = new Student("vaxvxcvd", "zsdsd", 16);
        arr[5] = new Student("vzsvad", "sdsd", 17);
        arr[6] = new Student("vzxzcad", "sdsd", 18);
        arr[7] = new Student("vaxcWd", "sdsd", 19);
        arr[8] = new Student("vzvseafad", "sdsd", 20);
        arr[9] = new Student("vzzsdsad", "sedsd", 21, 10,9,10,10,10);


        for (int i = 0; i < arr.length - 1; i++) {
            arr[i].setGrades();
        }

        for (int i = 0; i < arr.length; i++){
            if (arr[i].checkGrades()){
                arr[i].printSecondNameAndGroupNumber();
                System.out.println();
            }
        }


    }
}
