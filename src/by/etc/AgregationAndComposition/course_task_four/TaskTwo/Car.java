package by.etc.AgregationAndComposition.course_task_four.TaskTwo;

public class Car {
    private Wheel []wheels;
    private Engine engine;
    private String carMark;
    private boolean iSmoving = false;

    Car(String carMark, Engine engine, Wheel ... wheels){
        this.carMark = carMark;
        this.engine = engine;
        this.wheels = wheels;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setWheels(Wheel ... wheels) {
        this.wheels = wheels;
    }

    public void setCarMark(String carMark) {
        this.carMark = carMark;
    }

    public void setiSmoving(boolean iSmoving) {
        this.iSmoving = iSmoving;
    }

    public Engine getEngine() {
        return engine;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public String getCarMark() {
        return carMark;
    }
    public Boolean getIsMoving(){
        return iSmoving;
    }

    public void move(){
        if (iSmoving){
            System.out.println("Your car is already moving, so ill stop it");
            iSmoving = false;
        } else {
            System.out.print("Moving");
            iSmoving = true;
        }
    }
    public void changeTire(int id, Wheel wheel){
        for (int i = 0; i < this.wheels.length; i++) {
            this.wheels[i] = this.wheels[i].getId() == id ? wheel : this.wheels[i];
        }
        System.out.println("Tyre is changed");
    }

    public void fillOff(){
        System.out.println("Sucсessfully filed!");
    }


}
