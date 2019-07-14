package by.etc.course_task_four.SimpleClass.TaskSeven;

public class Triangle {
    private double ab;
    private double bc;
    private double ca;
    Point a, b ,c;

    Triangle(Point a, Point b, Point c){
        this.a = a;
        this.b = b;
        this.c = c;
        ab = (getDistance(this.a, this.b));
        bc = (getDistance(this.b, this.c));
        ca = (getDistance(this.c, this.a));
    }

    public double getDistance(Point a, Point b){
        if (a != null && b != null) {
            return Math.sqrt(Math.pow(b.getX() - a.getX(), 2) + Math.pow(b.getY() - a.getY(), 2));
        }
        return 0;
    }

    public void getMedian(){
        System.out.print("Median: x: " + ((a.getX() + b.getX() + c.getX())/3) + ", y: " + ((a.getY() + b.getY() + c.getY())/3));
    }

    public double getSquare(){
        return Math.abs(0.5 * (a.getX() - c.getX()) * (b.getY() - c.getY()) - ((b.getX() - c.getX()) * (a.getY() - c.getY())));
    }

    public double getPerimeter(){
        return ab + bc + ca;
    }
}
