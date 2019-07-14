package by.etc.course_task_three.course;

public class StringBuilderTaskOne {
    public static void main(String[] args) {
        String k = StringTaskTwo.enterString();
        System.out.print(k);
        System.out.println();
        System.out.print(maxSpacesResult(k));
    }

    public static int maxSpacesResult(String s){
        int max = 0;
        int counter = 0;
        boolean isEnd;
        for (int i = 0; i < s.length(); i++) {
            counter = 0;
            isEnd = false;
                while (Character.isWhitespace(s.charAt(i)) && isEnd == false){
                    counter++;
                    if (i == s.length() - 1){
                        isEnd = true;
                        break;
                    }
                    i++;
                }
            max = counter > max ? counter : max;
        }
        return max;
    }
}
