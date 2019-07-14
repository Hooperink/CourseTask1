package by.etc.course_task_three.course;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringPatterTaskTwo {
    public static void main(String[] args) {
            String xml =
                    "<notes>" +
                    "<note id = \"1\">" +
                    "<to>Вася</to>" +
                    "<from>Света</from>" +
                    "<heading>Напоминание</heading>" +
                    "<body>Позвони мне завтра!</body>" +
                    "</note>" +
                    "<note id = \"2\">" +
                    "<to>Петя</to>" +
                    "<from>Маша</from>" +
                    "<heading>Важное напоминание</heading>" +
                    "</note></notes>";
            getNotesTag(xml);
    }

    public static void getNotesTag(String xml){
        Pattern pattern = Pattern.compile("<(.+?)>(.+)<(/\\1)>");
        Matcher matcher = pattern.matcher(xml);
        matcher.find();
        System.out.print("Open tag: " + matcher.group(1) + " | Close tag: " + matcher.group(3) + "\n");
        System.out.print("Between tags: " + matcher.group(2) + "\n");
        System.out.println();
         String []j = splitAndAddDelimiter(matcher.group(2));
        for (String k: j) {
            printTagAndInto(k);

        }
    }
    public static String[] splitAndAddDelimiter(String k){
        String []p = k.split("</note>");
        for (int i = 0; i <p.length; i++) {
            p[i] += "</note>";
        }
        return p;
    }

    public static void printTagAndInto (String xml){
        Pattern pattern = Pattern.compile("<(\\w+)(\\s+[^>]+)*>(.+)<(/\\1)>");
        Matcher matcher = pattern.matcher(xml);
        while (matcher.find()) {
            System.out.print("Open tag: " + matcher.group(1));
            if (matcher.group(2) != null) {
                System.out.print(" | Attribute: " + matcher.group(2));
            }
            System.out.print(" | Close tag: " + matcher.group(4) + "\n");
            System.out.print("Between tags: " + matcher.group(3) + "\n");
            System.out.println();
            printTagAndInto(matcher.group(3));
        }
    }

}
