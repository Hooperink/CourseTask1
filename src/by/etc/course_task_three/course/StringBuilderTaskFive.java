package by.etc.course_task_three.course;

//Подсчитать количество "а"

public class StringBuilderTaskFive {
    public static void main(String[] args) {
        String k = StringTaskTwo.enterString();
        System.out.print(k);
        System.out.println();
        System.out.print(getCountOfA(k));
    }

    public static int getCountOfA(String s){
        int counter = 0;
        for (int i = 0; i < s.length() ; i++) {
            if(s.charAt(i) == 'a'){
                counter++;
            }
        }
        return counter;
    }
}
