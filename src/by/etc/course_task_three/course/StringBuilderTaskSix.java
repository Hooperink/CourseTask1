package by.etc.course_task_three.course;

//продублировать все символы

public class StringBuilderTaskSix {
    public static void main(String[] args) {
        String p = StringTaskTwo.enterString();
        System.out.print(p);
        System.out.println();
        System.out.print(getDoubleString(p));
    }

    public static String getDoubleString(String k){
        String p = "";
        for (int i = 0; i < k.length(); i++) {
            p += k.charAt(i);
            p += k.charAt(i);
        }
        return p;
    }
}
