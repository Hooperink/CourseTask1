package by.etc.course_task_three.course;

//проверить является ли слово палиндромом

public class StringBuilderTaskThree {
    public static void main(String[] args) {
        String k = StringTaskTwo.enterString();
        System.out.print(k);
        System.out.println();
        System.out.print(checkIfPalindrom(k));
    }

    public static boolean checkIfPalindrom(String s){
        boolean isTrue;
        StringBuilder j = new StringBuilder();
        j.append(s);
        j = j.reverse();
        isTrue = j.toString().equals(s) ? true : false;
        return isTrue;
    }
}
