package by.etc.course_task_three.course;

//Количество цифр

public class StringTaskThree {
    public static void main(String[] args) {
        String k = StringTaskTwo.enterString();
        System.out.print(k);
        System.out.println();
        howMuchNumeralsFind(k);
    }

    public static void howMuchNumeralsFind(String s){
        char arr[] = s.toCharArray();
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= '0' && arr[i] <= '9'){
                counter++;
            }
        }
        System.out.print(counter);
    }
}
