package by.etc.course_task_four.SimpleClass.TaskSeven;

public class Main {
    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(3,3);
        Point c = new Point(3, 0);
        Triangle triangle = new Triangle(a, b ,c);
        System.out.print(triangle.getPerimeter() + "\n");
        triangle.getMedian();
        System.out.println();
        System.out.print(triangle.getSquare());
    }
}
