package by.etc.course_task_three.course;

//Предложение оканчивается "." , "!" , "?" Определить количество предложений

public class StringBuilderTaskTen {
    public static void main(String[] args) {
        String k = StringTaskTwo.enterString();
        System.out.print(k);
        System.out.println();
        System.out.print(countSentences(k));

    }

    public static int countSentences(String s){
        int counter = 0;
        String k = "!?.";
        char p[]  = k.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < p.length; j++) {
                if(s.charAt(i) == p[j]){
                    counter++;
                }
            }

        }
        return counter;
    }
}
