package by.etc.course_task_two.course.task2_4;

public class DecompositionTaskNine {
    public static void main(String[] args) {
        int x = 2;
        int y = 4;
        int z = 2;
        int t = 4;
        if (isRectangular(x,y,z,t)){
            System.out.print(getSquare(x,y));
        } else {
            System.out.print("Not rectangular");
        }
    }
    public static boolean isRectangular(int a, int b, int c, int d){
        return (a == c && b == d) ? true : false;
    }
    public static int getSquare(int a, int b){
        return a * b;
    }
}
