package by.etc.AgregationAndComposition.course_task_four.TaskTwo;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Ferrari",new Engine(400, "Mishel"),
                new Wheel("mkl", "winter", 1), new Wheel("mkl", "winter", 2),
                new Wheel("mkl", "winter",3),new Wheel("mkl", "winter",4));
        car.changeTire(3, new Wheel("qwe", "summer", 3));
       System.out.println(car.getCarMark());
    }
}
