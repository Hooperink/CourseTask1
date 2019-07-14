package by.etc.AgregationAndComposition.course_task_four.TaskTwo;

public class Engine {
    private int horsePower;
    private String mark;
    Engine(int horsePower, String mark){
        this.horsePower = horsePower;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return " Amount of horse power: " + horsePower + ", mark: " + mark + "\n";
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getMark() {
        return mark;
    }

    public int getHorsePower() {
        return horsePower;
    }
}
