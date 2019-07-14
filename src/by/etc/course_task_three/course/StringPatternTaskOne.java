package by.etc.course_task_three.course;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringPatternTaskOne {
    public static void main(String[] args){
        Scanner in = null;
        String k = "";
        String str;
        int choose;
        char p;
        try {
            System.out.print("Enter your text!" + "\n");
            in = new Scanner(System.in);
            while(true){
                str = in.nextLine();
                if (str.equals("")) break;
                else k += str + "\n";

            }
            System.out.print("What to do with your text: \n 1. Sort by paragraph. \n 2. Sort sentences by word length. \n " +
                    "3. Sort by symbol. \n 0. Exit \n");

            while (!in.hasNextInt()){
                System.out.println("That not a number!");
                in.next();
            }
            choose = in.nextInt();
            while (choose != 0 ){
                switch (choose){
                    default:
                        choose = 0;
                        break;
                    case (1):
                        System.out.print(sortByParagraph(k));
                        choose = 0;
                        break;
                    case (2):
                        System.out.print(sortSentencesByWordsLength(k));
                        choose = 0;
                        break;
                    case (3):
                        System.out.print("Enter your symbol to sort: ");
                        p = in.next().charAt(0);
                        System.out.print(sortBySymbolAndAlphabet(k, p));
                        choose = 0;
                        break;
                    case (0):
                        break;
                }
            }

        } finally {
            if (in != null){
                in.close();
            }
        }
    }

    public static String sortByParagraph(String k){
        String []p = k.split("\n");
        int amountOFStringInParagraph [] = getAmountOfSentences(p);
        String punctuations[] = getPunctuations(k, "\n");
        String []f = sortParagraphBySentences(amountOFStringInParagraph, p);

        return fromArrayToStringAndMerge(f, punctuations);
    }

    public static String[] sortParagraphBySentences(int array[], String k[]){
        for (int i = 0; i < array.length - 1 ; i++) {
            int max = i;
            for (int j = i + 1; j < array.length ; j++) {
                if (array[j] < array[max] ){
                    max = j;
                }
            }
            int bufferForInt = array[max];
            array[max] = array[i];
            array[i] = bufferForInt;
            String bufferForString = k[max];
            k[max] = k[i];
            k[i] = bufferForString;
        }
        return k;
    }

    public static int [] getAmountOfSentences(String p[]){
        Pattern pattern = Pattern.compile("[!?.]");
        int counter;
        int amountOFStringInParagraph [] = new int [p.length];
        for (int i = 0; i < p.length; i++) {
            counter = 0;
            Matcher matcher = pattern.matcher(p[i]);
            while(matcher.find()){
                counter++;
            }
            amountOFStringInParagraph[i] = counter;
        }
        return amountOFStringInParagraph;
    }

    public static String sortSentencesByWordsLength(String k){
        String regX = "\n";
        String [] p = k.split(regX);
        String [] punctuation = getPunctuations(k, regX);
        for (int i = 0; i < p.length ; i++) {
            p[i] = splitSentences(p[i]);
        }
        return fromArrayToStringAndMerge(p, punctuation);
    }

    public static String splitSentences(String g){
        String f[] = g.split("[!?.]+\\s+");
        f[f.length - 1] = f[f.length - 1].substring(0, f[f.length - 1].length() - 1);
        Pattern pattern = Pattern.compile("[!?.]+");
        String punctuation [] = getPunctuations(g, "[!?.]+");
        for (int i = 0; i < punctuation.length ; i++) {
            punctuation[i] = punctuation[i] + " ";
        }
        for (int i = 0; i < f.length; i++) {
            f[i] = sortSentence(f[i]);
            if (i == f.length - 1){
              f[i] = f[i].substring(0, f[i].length() - 1);
            }
        }
        return fromArrayToStringAndMerge(f, punctuation);
    }

    public static String sortSentence(String p){
        String regX = "\\s+";
        String f[] = p.split(regX);
        String punctuation [] = getPunctuations(p, regX);
        for (int i = 0; i < f.length - 1; i++) {
            int max = i;
            for (int j = i + 1; j < f.length; j++) {
                if (f[j].length() < f[max].length()){
                    max = j;
                }
            }
            String buffer = f[max];
            f[max] = f[i];
            f[i] = buffer;
        }
        return fromArrayToStringAndMerge(f, punctuation);
    }

    public  static String fromArrayToStringAndMerge (String p[], String punctuation[]){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < p.length; i++) {
            builder.append(p[i]);
            if (i < punctuation.length) {
                builder.append(punctuation[i]);
            }
        }
        return builder.toString();
    }

    public static int getAmountOfMatchers(String p, String regX){
        int counter = 0;
        Pattern pattern = Pattern.compile(regX);
        Matcher matcher = pattern.matcher(p);
        while (matcher.find()){
                counter++;
            }
        return counter;
    }

    public static String [] getPunctuations(String p, String regX){
        Pattern pattern = Pattern.compile(regX);
        Matcher matcher = pattern.matcher(p);
        String punctuation [] = new String[getAmountOfMatchers(p, regX)];
        for (int i = 0; i < punctuation.length ; i++) {
            if (matcher.find()){
                punctuation[i] = matcher.group();
            }
        }
        return punctuation;
    }

    public static String sortBySymbolAndAlphabet(String k, char t){
        String regX = "\n";
        String [] p = k.split(regX);
        String [] punctuation = getPunctuations(k, regX);
        for (int i = 0; i < p.length ; i++) {
            p[i] = splitSentences(p[i], t);
        }
        return fromArrayToStringAndMerge(p, punctuation);
    }

    public static String splitSentences(String g, char t){
        String f[] = g.split("[!?.]+\\s+");
        f[f.length - 1] = f[f.length - 1].substring(0, f[f.length - 1].length() - 1);
        Pattern pattern = Pattern.compile("[!?.]+");
        String punctuation [] = getPunctuations(g, "[!?.]+");
        for (int i = 0; i < punctuation.length ; i++) {
            punctuation[i] = punctuation[i] + " ";
        }
        for (int i = 0; i < f.length; i++) {
            f[i] = sortSentenceBySymbol(f[i], t);
            if (i == f.length - 1){
                f[i] = f[i].substring(0, f[i].length() - 1);
            }
        }
        return fromArrayToStringAndMerge(f, punctuation);
    }

    public static String sortSentenceBySymbol(String p, char a){
        String charToFind = a + "+";
        Pattern pattern = Pattern.compile(charToFind);
        String regX = "\\s+";
        String f[] = p.split(regX);
        String punctuation [] = getPunctuations(p, regX);
        int amountOfEntersOfChar [] = new int [f.length];
        for (int i = 0; i < f.length ; i++) {
            int counter = 0;
            Matcher matcher = pattern.matcher(f[i]);
            int w = 0;
            while (matcher.find(w)){
                counter++;
                w = matcher.start() + 1;
            }
            amountOfEntersOfChar[i] = counter;
        }
        for (int i = 0; i < amountOfEntersOfChar.length - 1; i++) {
            int max = i;
            for (int j = i + 1; j < amountOfEntersOfChar.length ; j++) {
                if(amountOfEntersOfChar[j] > amountOfEntersOfChar[max]){
                    max = j;
                }
            }
            int bufferForInt = amountOfEntersOfChar[max];
            amountOfEntersOfChar[max] = amountOfEntersOfChar[i];
            amountOfEntersOfChar[i] = bufferForInt;
            String bufferForString = f[max];
            f[max] = f[i];
            f[i] = bufferForString;
        }


        return fromArrayToStringAndMerge(preSort(f, amountOfEntersOfChar), punctuation);
    }

    public static String[] preSort (String k[], int arr[]){
        if (k.length == 1){
            return k;
        } else {
        for (int i = 0; i < arr.length; i++) {
           int startIndex = 0;
           int endIndex = 0;
            if (i < (arr.length - 1) && arr[i] == arr[i + 1]){
                startIndex = i;
                while (i != (arr.length - 1) && (arr[i] == arr[i + 1])){
                   i++;
                }
                endIndex = i;
            }
            k = sortByAlphabet(k, startIndex, endIndex);
        }
            return k;
        }
    }

    public static String[] sortByAlphabet(String arr[], int start, int end){
        for (int i = start; i < end ; i++) {
            for (int j = i + 1; j <= end; j++){
                if (arr[j - 1].compareTo(arr[j]) > 0){
                    String buffer = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = buffer;
                }
            }
        }
        return arr;
    }

}
