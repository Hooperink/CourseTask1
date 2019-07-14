package by.etc.course_task_three.course;

public class StringTaskFour {
    public static void main(String[] args) {
        String k = StringTaskTwo.enterString();
        System.out.print(k);
        System.out.println();
        howMuchNumbersFind(k);
    }

    public static void howMuchNumbersFind(String s){
        char arr[] = s.toCharArray();
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= '0' && arr[i] <= '9'){
                while ((arr[i + 1] >= '0' && arr[i + 1] <= '9') && i + 1 <arr.length){
                   i++;
                }
                counter++;
            }
        }
        System.out.print(counter);
    }
}
