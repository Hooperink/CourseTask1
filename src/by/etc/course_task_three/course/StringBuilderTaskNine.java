package by.etc.course_task_three.course;

//подсчитать количество строчных и заглавных букв (только англ язык)

public class StringBuilderTaskNine {
    public static void main(String[] args) {
        String k = StringTaskTwo.enterString();
        System.out.print(k);
        System.out.println();
        countSymbols(k);
    }

    public static void countSymbols(String s){
        int lowCounter = 0;
        int highCounter = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                lowCounter++;
            }
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                highCounter++;
            }

        }
        System.out.print("Low: " + lowCounter + "; High: " + highCounter );
    }
}
