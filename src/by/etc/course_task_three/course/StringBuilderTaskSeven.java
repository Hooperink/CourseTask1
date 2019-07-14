package by.etc.course_task_three.course;

//Удалить все пробелы и повторяющиеся символы

public class StringBuilderTaskSeven {
    public static void main(String[] args) {
        String k = StringTaskTwo.enterString();
        System.out.print(k);
        System.out.println();
        System.out.print(deleteRepeats(k));
    }

    public static String deleteRepeats(String s){
        String p = "";
        p += s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
             if ((checkIfInString(p, s.charAt(i))) || (s.charAt(i) == ' ')){
                i++;
             } else {
                 p += s.charAt(i);
             }
        }
        return p;
    }

    public static boolean checkIfInString (String k, char p){
        boolean isTrue = false;
        for (int j = 0; j < k.length() ; j++) {
            if (k.charAt(j) == p){
                isTrue = true;
            }
        }
        return isTrue;
    }
}
