package by.etc.course_task_three.course;

//убрать повторяющиеся пробелы, обрезать их сначала и в конце

public class StringTaskFive {
    public static void main(String[] args) {
        String k = StringTaskTwo.enterString();
        String p = deleteSpaces(k);
        System.out.print(k);
        System.out.println();
        System.out.print(p);
    }

    public static String deleteSpaces(String s){
        String p = "";
        s = s.trim();
        char arr[] = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
           p += arr[i];
            if(arr[i] == ' '){
                while (((arr[i + 1] == ' ') && (i + 1 < arr.length))){
                    i++;
                }
            }
        }
        return p;
    }

}
