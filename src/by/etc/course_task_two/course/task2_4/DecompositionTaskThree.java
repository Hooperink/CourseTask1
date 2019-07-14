package by.etc.course_task_two.course.task2_4;

//Найти площадь правильного шестиугольника

public class DecompositionTaskThree {
    public static void main(String[] args) {
        int a = 4;
        System.out.print(getTriangleSquare(a) * 6);
    }
    public static double getTriangleSquare(int a){
        return (a * a) * (Math.sqrt(3)/4);
    }
}
