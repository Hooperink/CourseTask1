package by.etc.course_task_four.SimpleClass.TaskTwo;

public class Test2 {
    private int first;
    private int second;

    public Test2(int first, int second){
        this.first = first;
        this.second = second;
    }

    public Test2 (){
        this.first = 1;
        this.second = 2;
    }

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void print(){
        System.out.print(this.second);
    }
}
