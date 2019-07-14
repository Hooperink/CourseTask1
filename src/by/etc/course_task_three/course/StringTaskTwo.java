package by.etc.course_task_three.course;

// Все вхождения "word" поменять на "letter"
//  System.out.print(k.replaceAll("word", "letter"));  //Решение в одну строку без массива
import java.util.Scanner;

public class StringTaskTwo {
    public static void main(String[] args) {

        String k = enterString();
        System.out.print(replaceWord(k));
    }

    public static boolean checkWord(char []word, char []str, int index){
        boolean isTrue = true;
        for (int i = 0, j = index; i < word.length; i++, j++) {
            if (word[i] != str[j]){
                isTrue = false;
                break;
            }
        }
        return isTrue;
    }

    public static String enterString(){
        Scanner in = null;
        String k;
        try {
            in = new Scanner(System.in);
            System.out.print("Enter your string: ");
            k = in.nextLine();
        }
        finally {
            if (in != null) {
                in.close();
            }
        }
        return k;
    }

    public static String replaceWord(String k){
        char [] str = k.toCharArray();
        char []word = {'w','o','r','d'};
        String newStr = "";
        for (int i = 0; i < str.length ; i++) {
            if (checkWord(word, str, i) && i < str.length - 3){
                i = i + 3;
                newStr += "letter";
            } else {
                newStr += str[i];
            }
        }
        return newStr;
    }
}
