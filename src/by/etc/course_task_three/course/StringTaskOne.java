package by.etc.course_task_three.course;

// Из camelCase в snake_case

//Можно переделать через массив без StringBuffer, но через сцепку строк

public class StringTaskOne {
    public static void main(String[] args) {
        String k = "heDdeWas";
        k = fromCamelToSnake(k);
        System.out.print(k);
    }

    public static String fromCamelToSnake (String s){
        StringBuilder k = new StringBuilder();
        k.append(s);
       for (int i =  0; i < k.length(); i++){
           if (Character.isUpperCase(k.charAt(i))){
               k.insert(i, "_");
               i++;
           }
       }
       s = k.toString();
       s = s.toLowerCase();
        return s;
    }




}
