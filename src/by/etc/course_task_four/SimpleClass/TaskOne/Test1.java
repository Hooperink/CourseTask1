package by.etc.course_task_four.SimpleClass.TaskOne;

public class Test1 {
    private int first = 12;
    private int second = 12;

    public void printFirst(){
        System.out.print("First = " + first);
        System.out.println();
    }

    public void printSecond(){
        System.out.print("Second = " + second);
        System.out.println();
    }

    public void setFirst(int p){
        first = p;
    }
    public void setSecond(int p){
        second = p;
    }

    public void summ(){
        System.out.print("Summ = " + (first + second));
        System.out.println();
    }

    public void max(){
        int max = first > second ? first : second;
        System.out.print("Max = " + max);
        System.out.println();
    }
}
