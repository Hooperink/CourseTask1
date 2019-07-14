package by.etc.course_task_three.course;

public class StringBuilderTaskTwo {
    public static void main(String[] args) {
        String k = StringTaskTwo.enterString();
        System.out.print(k);
        System.out.println();
        System.out.print(insertB(k));
    }

    public static String insertB (String s){
        s = s.replaceAll("a", "ab");
        return s;
    }
}
