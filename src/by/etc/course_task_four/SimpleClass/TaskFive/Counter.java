package by.etc.course_task_four.SimpleClass.TaskFive;

import java.util.Random;

public class Counter {
    private int min;
    private int max;
    private int counter;

    Counter(){
        min = 0;
        max = 10;
        counter = 0;
    }

    Counter(int min, int max){
        if (min > max){
            this.min = max;
            this.max = min;
        } else {
            this.min = min;
            this.max = max;
        }
        Random random = new Random();
        this.counter = random.nextInt(((max - min) + 1) + min);

    }

    public int getCounter() {
        return counter;
    }

    public void increase(){
        counter = counter < max ? ++counter : 0;
    }

    public void  decrease(){
        counter = counter > min ? --counter : 0;
    }

    public void printCounter(){
        System.out.print("Counter = " + counter + "\n");
    }


}
