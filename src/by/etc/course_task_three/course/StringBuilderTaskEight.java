package by.etc.course_task_three.course;

//Найти и вывести самое длинное слово (несколько одинаковых не обрабатывать)

public class StringBuilderTaskEight {
    public static void main(String[] args) {
        String k = StringTaskTwo.enterString();
        System.out.print(k);
        System.out.println();
        System.out.print(getMaxWord(k));
    }

    public static String getMaxWord(String s){
        int max = 0;
        String p ="";
        for (String k : s.split(" ")){
            if( max < k.length()){
                max = k.length();
                p = k;
            }
        }
        return p;
    }

}
