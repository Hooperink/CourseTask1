package by.etc.course_task_three.course;

//С помощью копирования и конкатенации составить слово "торт" из "информатика"

public class StringBuilderTaskFour {
    public static void main(String[] args) {
        String k = "информатика";
        System.out.print(getCake(k));
    }

    public static String getCake(String k){
        String p = "";
        p += String.valueOf(k.charAt(7));
        p += k.substring(3,5);
        p += String.valueOf(k.charAt(7));
        return p;
    }
}
